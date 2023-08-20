package ru.digitalspirit.item.equipment;

import ru.digitalspirit.item.Item;
import ru.digitalspirit.item.ItemInterface;
import ru.digitalspirit.character.characteristics.AttributeTypeEnum;

import java.util.Map;

public abstract class Equipment extends Item implements ItemInterface {
    private Map<AttributeTypeEnum,Integer> RequiredAttributeMap;
    private Integer RequiredLevel;
    private EquipmentTypeEnum equipmentType;
}
