package ru.digitalspirit.unit.nonPlayerCharacter;

import ru.digitalspirit.unit.Unit;
import ru.digitalspirit.unit.UnitInterface;
import ru.digitalspirit.unit.characteristics.AttackTypeEnum;
import ru.digitalspirit.unit.characteristics.DefenceTypeEnum;

import java.util.Map;

public class NonPlayerCharacter extends Unit implements UnitInterface {
    private Integer rewardLevelPoints;

    private NonPlayerCharacterType nonPlayerCharacterType;

    private Map<AttackTypeEnum,Double> AttackMap;
    private Map<DefenceTypeEnum,Double> DefenceMap;

    public Integer getRewardLevelPoints() {
        return rewardLevelPoints;
    }

    protected void setRewardLevelPoints(Integer rewardLevelPoints) {
        this.rewardLevelPoints = rewardLevelPoints;
    }
}
