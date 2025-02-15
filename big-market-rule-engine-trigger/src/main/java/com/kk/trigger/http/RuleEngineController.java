package com.kk.trigger.http;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ice.core.Ice;
import com.ice.core.context.IcePack;
import com.ice.core.utils.JacksonUtils;
import com.kk.api.IRuleEngineService;
import com.kk.domain.rule.model.entity.IceRuleFactorEntity;
import com.kk.domain.rule.service.IRuleExecute;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
// Todo Dubbo @limoukun 2025-2-15 16:45:49
public class RuleEngineController implements IRuleEngineService {

    @Resource
    private IRuleExecute ruleExecute;

    @Override
    public String execute(Map<String, Object> mmap) throws JsonProcessingException {
        // 简单实现一版
        IcePack pack = JacksonUtils.readJson(JacksonUtils.toJsonString(mmap), IcePack.class);
        IceRuleFactorEntity iceRuleFactorEntity = IceRuleFactorEntity.builder().build();
        return ruleExecute.execute(iceRuleFactorEntity);
    }

    /*-------------------------------------- ~ Field ----------------------------------*/



    /*-------------------------------------- ~ Method ----------------------------------*/

}
