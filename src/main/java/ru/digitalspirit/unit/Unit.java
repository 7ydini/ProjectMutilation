package ru.digitalspirit.unit;

import ru.digitalspirit.ability.AbilityInterface;
import ru.digitalspirit.map.field.Node.model.Cell;
import ru.digitalspirit.unit.characteristics.AttributeTypeEnum;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class Unit implements UnitInterface{
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
    protected List<AbilityInterface> unitAbility;

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
        return attributeMap;
    }

    public List<AbilityInterface> getUnitAbility() {
        return unitAbility;
    }

    public List<AbilityInterface> getPossibleAbilityToUse() { ///////////// Возможно нужно выдавать некий индификатор или вынести использовние и проверки вне песонажа(что будет странно);
        List<AbilityInterface> possibleAbility = new ArrayList<>();
        for(AbilityInterface ability: unitAbility){
            if(ability.checkAbilityUsage(this)){
                possibleAbility.add(ability);
            }
        }
        return possibleAbility;
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
        this.attributeMap = attributeMap;
    }

    protected void setUnitAbility(List<AbilityInterface> unitAbility) {
        this.unitAbility = unitAbility;
    }
}
