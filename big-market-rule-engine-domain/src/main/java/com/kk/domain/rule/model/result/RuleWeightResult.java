package com.kk.domain.rule.model.result;

import com.ice.core.context.IceRoam;
import com.ice.core.leaf.roam.BaseLeafRoamResult;

/**
 * Raffle责任链 - 权重规则 - 执行节点
 *
 * @author limoukun
 * @since 2025/1/19
 **/
public class RuleWeightResult extends BaseLeafRoamResult {
    @Override
    protected boolean doRoamResult(IceRoam roam) {
        System.out.println("执行权重接管逻辑...");

        return true;
    }
}
