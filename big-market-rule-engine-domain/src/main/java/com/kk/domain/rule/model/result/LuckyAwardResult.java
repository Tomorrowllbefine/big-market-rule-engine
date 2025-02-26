package com.kk.domain.rule.model.result;

import com.ice.core.context.IceRoam;
import com.ice.core.leaf.roam.BaseLeafRoamResult;
import com.kk.domain.rule.model.entity.IceExecuteResultEntity;
import com.kk.domain.rule.model.vo.IceExecuteResultRuleVO;

/**
 * Raffle责任链 - 默认兜底抽奖逻辑 - 执行节点
 *
 * @author limoukun
 * @since 2025/1/19
 **/
public class LuckyAwardResult extends BaseLeafRoamResult {
    @Override
    protected boolean doRoamResult(IceRoam roam) {
        System.out.println("执行默认兜底抽奖逻辑....");

        IceExecuteResultEntity resultEntity = IceExecuteResultEntity.builder()
                .rule(IceExecuteResultRuleVO.RULE_DEFAULT.getRuleName())
                .ruleDesc(IceExecuteResultRuleVO.RULE_DEFAULT.getRuleDesc())
                .build();
        roam.put("executeResult", resultEntity);
        return true;
    }
}
