package com.kk.domain.rule.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.kk.domain.rule.model.entity.IceRuleFactorEntity;

import java.util.Map;

/**
 * 规则执行服务接口
 * 
 * @author limoukun
 * @since 2025/2/15 
 **/
public interface IRuleExecute {

    String execute(IceRuleFactorEntity iceRuleFactor) throws JsonProcessingException;
}
