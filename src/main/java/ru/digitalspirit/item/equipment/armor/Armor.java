package ru.digitalspirit.item.equipment.armor;

import ru.digitalspirit.item.Item;
import ru.digitalspirit.item.equipment.Equipment;
import ru.digitalspirit.unit.characteristics.DefenceTypeEnum;

import java.util.Map;

public class Armor extends Equipment {
    private Map<DefenceTypeEnum,Double> DefenceMap;
    private ArmorTypeEnum armorType;
}
