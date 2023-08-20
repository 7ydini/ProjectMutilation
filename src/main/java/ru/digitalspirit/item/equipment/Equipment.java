package ru.digitalspirit.item.equipment;

import ru.digitalspirit.item.Item;
import ru.digitalspirit.item.ItemInterface;
import ru.digitalspirit.unit.characteristics.AttackTypeEnum;
import ru.digitalspirit.unit.characteristics.AttributeTypeEnum;
import ru.digitalspirit.unit.characteristics.DefenceTypeEnum;

import java.util.Map;

public abstract class Equipment extends Item implements ItemInterface {
    private Map<AttributeTypeEnum,Integer> RequiredAttributeMap;
    private Integer RequiredLevel;
    private EquipmentTypeEnum equipmentType;
}
