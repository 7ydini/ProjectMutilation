package ru.digitalspirit.unit;

import ru.digitalspirit.map.field.square.model.Cell;
import ru.digitalspirit.unit.characteristics.AttributeTypeEnum;

import java.util.Map;

public abstract class Unit {
    protected Cell unitLocation;
    protected String unitName;
    protected Boolean alive;

    protected Double remainingHealthPoints;
    protected Double remainingManaPoints;
    protected Double remainingStaminaPoints;
    protected Double maxHealthPoints;
    protected Double maxManaPoints;
    protected Double maxStaminaPoints;

    protected Integer level;

    protected Map<AttributeTypeEnum,Integer> attributeMap;

    //protected List<> unitStatus;
    //protected List<> unitPassiveSkills;
    //protected List<> unitSkills;

    public Boolean getAlive() {
        return alive;
    }

    public Cell getUnitLocation() {
        return unitLocation;
    }

    public String getUnitName() {
        return unitName;
    }

    public Double getRemainingHealthPoints() {
        return remainingHealthPoints;
    }

    public Double getRemainingManaPoints() {
        return remainingManaPoints;
    }

    public Double getRemainingStaminaPoints() {
        return remainingStaminaPoints;
    }

    public Double getMaxHealthPoints() {
        return maxHealthPoints;
    }

    public Double getMaxManaPoints() {
        return maxManaPoints;
    }

    public Double getMaxStaminaPoints() {
        return maxStaminaPoints;
    }

    public Integer getLevel() {
        return level;
    }

    public Map<AttributeTypeEnum, Integer> getAttributeMap() {
        return AttributeMap;
    }

    protected void setUnitLocation(Cell unitLocation) {
        this.unitLocation = unitLocation;
    }

    protected void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    protected void setAlive(Boolean alive) {
        this.alive = alive;
    }

    protected void setRemainingHealthPoints(Double remainingHealthPoints) {
        this.remainingHealthPoints = remainingHealthPoints;
    }

    protected void setRemainingManaPoints(Double remainingManaPoints) {
        this.remainingManaPoints = remainingManaPoints;
    }

    protected void setRemainingStaminaPoints(Double remainingStaminaPoints) {
        this.remainingStaminaPoints = remainingStaminaPoints;
    }

    protected void setMaxHealthPoints(Double maxHealthPoints) {
        this.maxHealthPoints = maxHealthPoints;
    }

    protected void setMaxManaPoints(Double maxManaPoints) {
        this.maxManaPoints = maxManaPoints;
    }

    protected void setMaxStaminaPoints(Double maxStaminaPoints) {
        this.maxStaminaPoints = maxStaminaPoints;
    }

    protected void setLevel(Integer level) {
        this.level = level;
    }

    protected void setAttributeMap(Map<AttributeTypeEnum, Integer> attributeMap) {
        AttributeMap = attributeMap;
    }
}
