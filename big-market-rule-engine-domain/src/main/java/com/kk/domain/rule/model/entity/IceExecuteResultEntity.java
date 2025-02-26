package com.kk.domain.rule.model.entity;

import com.kk.domain.rule.model.vo.IceExecuteResultRuleVO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Ice规则执行结果实体 （塞入roam）
 *
 * @author limoukun
 * @since 2025/2/24
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class IceExecuteResultEntity {

    /** 拦截规则 */
    private String rule;
    /** 拦截规则描述 */
    private String ruleDesc;
    /** 是否是奖品ID（否则是积分） */
    private Boolean isAward = true;
    /** 奖品ID */
    private Integer awardId;
    /** 积分 */
    private Double amount;
}
