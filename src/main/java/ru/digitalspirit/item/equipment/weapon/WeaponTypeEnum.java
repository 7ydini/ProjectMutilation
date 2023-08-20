package ru.digitalspirit.item.equipment.weapon;

public enum WeaponTypeEnum {
    DAGGER(false),
    AX(false),
    SWORD(false),
    HAMMER(false),
    GREAT_AX(true),
    GREAT_SWORD(true),
    GREAT_HAMMER(true),
    POLEARM(true),
    BOW(true),
    CROSSBOW(true);

    private Boolean twoHanded;

    WeaponTypeEnum(Boolean twoHanded) {
        this.twoHanded = twoHanded;
    }

    public Boolean getTwoHanded() {
        return twoHanded;
    }

    public void setTwoHanded(Boolean twoHanded) {
        this.twoHanded = twoHanded;
    }
}
