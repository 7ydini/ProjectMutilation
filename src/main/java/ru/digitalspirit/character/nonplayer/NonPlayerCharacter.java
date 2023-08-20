package ru.digitalspirit.character.nonplayer;

import ru.digitalspirit.character.Character;
import ru.digitalspirit.character.CharacterInterface;
import ru.digitalspirit.character.characteristics.AttackTypeEnum;
import ru.digitalspirit.character.characteristics.DefenceTypeEnum;

import java.util.Map;

public class NonPlayerCharacter extends Character implements CharacterInterface {
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
