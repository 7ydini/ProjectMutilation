package ru.digitalspirit.ability;

import ru.digitalspirit.map.field.Node.model.Cell;
import ru.digitalspirit.character.CharacterInterface;

import java.util.List;

public interface AbilityInterface {
    public Boolean checkAbilityUsage(CharacterInterface unit);

    public List<Cell> getPossibleTargets(CharacterInterface unit);

    public Integer getMaxCountTargets();

    public AbilityEnum getAbilityId();

    public void useAbility(List<Cell> cellTarget, CharacterInterface unitInterface);
}
