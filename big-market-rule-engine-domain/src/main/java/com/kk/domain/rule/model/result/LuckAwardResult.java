package com.kk.domain.rule.model.result;

import com.ice.core.context.IceRoam;
import com.ice.core.leaf.roam.BaseLeafRoamResult;

public class LuckAwardResult extends BaseLeafRoamResult {
    @Override
    protected boolean doRoamResult(IceRoam roam) {
        return false;
    }
}
