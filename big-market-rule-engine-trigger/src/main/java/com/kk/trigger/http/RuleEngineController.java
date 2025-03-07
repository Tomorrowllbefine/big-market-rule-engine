package com.kk.trigger.http;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ice.core.context.IcePack;
import com.ice.core.utils.JacksonUtils;
import com.kk.api.IRuleEngineService;
import com.kk.domain.rule.model.entity.IceRuleFactorEntity;
import com.kk.domain.rule.service.IRuleExecute;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

/**
 * 规则引擎服务 - 控制器
 *
 * @author limoukun
 * @since 2025/2/15
 **/
@Slf4j
@CrossOrigin("${app.config.cross-origin}")
@RequestMapping("/api/${app.config.api-version}/rule_engine")
@RestController
public class RuleEngineController implements IRuleEngineService {

    @Resource
    private IRuleExecute ruleExecute;

    @RequestMapping(value = "/execute", method = RequestMethod.POST)
    @Override
    public String execute(@RequestBody Map<String, Object> mmap) throws JsonProcessingException {
        // 简单实现版
        log.info("rule-engine receive: {}",mmap.toString());
        IcePack pack = JacksonUtils.readJson(JacksonUtils.toJsonString(mmap), IcePack.class);
        IceRuleFactorEntity iceRuleFactorEntity = IceRuleFactorEntity.builder()
                .pack(pack).build();
        return ruleExecute.execute(iceRuleFactorEntity);
    }

    /*-------------------------------------- ~ Field ----------------------------------*/



    /*-------------------------------------- ~ Method ----------------------------------*/

}
