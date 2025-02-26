package com.kk.domain.rule.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ice.core.Ice;
import com.ice.core.context.IceContext;
import com.ice.core.context.IcePack;
import com.ice.core.utils.JacksonUtils;
import com.kk.domain.rule.model.entity.IceRuleFactorEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 规则执行服务 - 默认实现
 *
 * @author limoukun
 * @since 2025/2/15
 **/
@Slf4j
@Service
public class DefaultRuleExecuteService implements IRuleExecute{

    @Override
    public String execute(IceRuleFactorEntity iceRuleFactor) throws JsonProcessingException {
        IcePack pack = iceRuleFactor.getPack();
        List<IceContext> iceContexts = Ice.processCtx(pack);
        log.info("测试结果: {}", iceContexts);
        return JacksonUtils.toJsonString(iceContexts);
    }
}
