package com.kk.trigger.rpc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ice.core.context.IcePack;
import com.ice.core.utils.JacksonUtils;
import com.kk.api.IRuleEngineService;
import com.kk.domain.rule.model.entity.IceRuleFactorEntity;
import com.kk.domain.rule.service.IRuleExecute;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;
import java.util.Map;

@Slf4j
@DubboService(version = "1.0.0")
public class RuleEngineService implements IRuleEngineService {

    @Resource
    private IRuleExecute ruleExecute;

    @Override
    public String execute(Map<String, Object> mmap) throws JsonProcessingException {
        // 简单实现一版
        log.info("rule-engine receive: {}",mmap.toString());
        IcePack pack = JacksonUtils.readJson(JacksonUtils.toJsonString(mmap), IcePack.class);
        IceRuleFactorEntity iceRuleFactorEntity = IceRuleFactorEntity.builder().build();
        return ruleExecute.execute(iceRuleFactorEntity);
    }
}
