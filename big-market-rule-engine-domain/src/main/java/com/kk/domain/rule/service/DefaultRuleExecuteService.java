package com.kk.domain.rule.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.kk.domain.rule.model.entity.IceRuleFactorEntity;

/**
 * 规则执行服务 - 默认实现
 *
 * @author limoukun
 * @since 2025/2/15
 **/
public class DefaultRuleExecuteService implements IRuleExecute{

    @Override
    public String execute(IceRuleFactorEntity iceRuleFactor) throws JsonProcessingException {
        return "功能还在构建中...";
    }
}
