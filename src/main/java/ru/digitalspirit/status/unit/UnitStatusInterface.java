package ru.digitalspirit.status.unit;

import ru.digitalspirit.character.CharacterInterface;

public interface UnitStatusInterface {
    public TriggerTypeEnum getActionTrigger();

    public void updateStatus();

    public void action(CharacterInterface unitInterface);
}
