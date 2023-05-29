package ru.digitalspirit.unit.hero;

import ru.digitalspirit.item.ItemInterface;
import ru.digitalspirit.item.equipment.Equipment;
import ru.digitalspirit.unit.Unit;
import ru.digitalspirit.unit.UnitInterface;
import ru.digitalspirit.unit.characteristics.AttributeTypeEnum;

import java.util.List;
import java.util.Map;

public class Hero extends Unit implements UnitInterface {
    private Integer nextLevelPoints;
    private Integer levelPoints;
    private Integer freePoints;

    private Map<ItemInterface,Integer> inventory;
    private List<Equipment> equipment;

    public Integer getNextLevelPoints() {
        return nextLevelPoints;
    }

    public Integer getLevelPoints() {
        return levelPoints;
    }

    public Integer getFreePoints() {
        return freePoints;
    }

    public void upLevelPoints(Integer points){
        this.levelPoints += points;
        if(levelPoints >= nextLevelPoints){
            Integer nextLevelUpgradePoints = 500; //Временно! Позже нужно вынести в ?конфиг.
            this.levelPoints -= nextLevelPoints;
            this.level++;
            this.freePoints++;
            this.nextLevelPoints += nextLevelUpgradePoints;
        }
    }

    public void upAttribute (AttributeTypeEnum attributeType,Integer upAttributeCount){
        if(upAttributeCount>=0 && upAttributeCount<=this.freePoints){
            this.attributeMap.replace(attributeType,this.attributeMap.get(attributeType) + upAttributeCount);
            this.freePoints -= upAttributeCount;
        }
    }

    protected void setNextLevelPoints(Integer nextLevelPoints) {
        this.nextLevelPoints = nextLevelPoints;
    }

    protected void setLevelPoints(Integer levelPoints) {
        this.levelPoints = levelPoints;
    }

    protected void setFreePoints(Integer freePoints) {
        this.freePoints = freePoints;
    }
}