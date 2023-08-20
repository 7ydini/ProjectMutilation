package ru.digitalspirit.ability;

import ru.digitalspirit.map.field.Node.model.Cell;
import ru.digitalspirit.unit.UnitInterface;

import java.util.List;

public interface AbilityInterface {
    public Boolean checkAbilityUsage(UnitInterface unit);

    public List<Cell> getPossibleTargets(UnitInterface unit);

    public Integer getMaxCountTargets();

    public AbilityEnum getAbilityId();

    public void useAbility(List<Cell> cellTarget, UnitInterface unitInterface);
}
