package com.kk.domain.rule.model.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 执行规则引擎 拦截规则 枚举
 *
 * @author limoukun
 * @since 2025/2/24
 **/
@Getter
@AllArgsConstructor
public enum IceExecuteResultRuleVO {

    RULE_BLACKLIST("rule_blacklist", "黑名单规则"),
    RULE_WEIGHT("rule_weight", "权重规则"),
    RULE_DEFAULT("rule_default", "默认抽奖规则"),
    RULE_LOCK("rule_lock", "次数锁规则"),
    RULE_STOCK("rule_stock", "库存规则"),
    RULE_LUCK_AWARD("rule_luck_award", "兜底奖励")
    ;

    private final String ruleName;
    private final String ruleDesc;
}
