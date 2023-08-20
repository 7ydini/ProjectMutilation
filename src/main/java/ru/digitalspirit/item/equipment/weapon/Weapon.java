package ru.digitalspirit.item.equipment.weapon;

import ru.digitalspirit.item.equipment.Equipment;
import ru.digitalspirit.character.characteristics.AttackTypeEnum;

import java.util.Map;

public class Weapon extends Equipment {
    private Map<AttackTypeEnum,Double> AttackMap;
    private WeaponTypeEnum weaponType;
}
