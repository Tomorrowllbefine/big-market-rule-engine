package com.kk.domain.rule.model.flow;

import com.ice.core.context.IceRoam;
import com.ice.core.leaf.roam.BaseLeafRoamFlow;

public class AwardStockFlow extends BaseLeafRoamFlow {

    @Override
    protected boolean doRoamFlow(IceRoam roam) {
        return false;
    }
}
