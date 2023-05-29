package ru.digitalspirit.item.equipment;

import ru.digitalspirit.item.Item;
import ru.digitalspirit.item.ItemInterface;
import ru.digitalspirit.unit.characteristics.AttackTypeEnum;
import ru.digitalspirit.unit.characteristics.AttributeTypeEnum;
import ru.digitalspirit.unit.characteristics.DefenceTypeEnum;

import java.util.Map;

public class Equipment extends Item implements ItemInterface {
    private Map<AttackTypeEnum,Double> AttackMap;
    private Map<DefenceTypeEnum,Double> DefenceMap;
    private Map<AttributeTypeEnum,Integer> AttributeMap;
    private EquipmentTypeEnum equipmentType;
}
