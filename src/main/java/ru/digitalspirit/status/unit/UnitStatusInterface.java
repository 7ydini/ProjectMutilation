package ru.digitalspirit.status.unit;

import ru.digitalspirit.unit.UnitInterface;

public interface UnitStatusInterface {
    public TriggerTypeEnum getActionTrigger();

    public void updateStatus();

    public void action(UnitInterface unitInterface);
}
