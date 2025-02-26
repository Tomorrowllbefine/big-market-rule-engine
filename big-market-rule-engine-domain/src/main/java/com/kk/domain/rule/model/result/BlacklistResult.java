package com.kk.domain.rule.model.result;

import com.ice.core.context.IceRoam;
import com.ice.core.leaf.roam.BaseLeafRoamResult;
import com.kk.domain.rule.model.entity.IceExecuteResultEntity;
import com.kk.domain.rule.model.flow.BlacklistFlow;
import com.kk.domain.rule.model.vo.IceExecuteResultRuleVO;
import lombok.extern.slf4j.Slf4j;

/**
 * Raffle责任链 - 黑名单规则 - 执行节点
 *
 * @author limoukun
 * @since 2025/1/19
 **/
@Slf4j
public class BlacklistResult extends BaseLeafRoamResult {

    /** 黑名单默认积分0.1 */
    // todo 待配置
    private double defaultValue;

    @Override
    protected boolean doRoamResult(IceRoam roam) {

        log.info("执行黑名单接管逻辑...");

        // 填入执行结果
        IceExecuteResultEntity resultEntity = IceExecuteResultEntity.builder()
                .rule(IceExecuteResultRuleVO.RULE_BLACKLIST.getRuleName())
                .ruleDesc(IceExecuteResultRuleVO.RULE_BLACKLIST.getRuleDesc())
                .isAward(Boolean.FALSE)
                .amount(defaultValue)
                .build();
        roam.put("executeResult", resultEntity);
        return true;
    }
}
