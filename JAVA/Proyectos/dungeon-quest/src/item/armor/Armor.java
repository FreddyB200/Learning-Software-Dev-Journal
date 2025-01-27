package item.armor;

import item.Item;

public abstract class Armor extends Item {

    private String category = "Armor";
    private int totalUpgrades;
    private int alreadyDoneUpgrades = 0;
    private int hp;

    public Armor(int saleValue, String rarity, String name, int levelReq, int totalUpgrades, int alreadyDoneUpgrades, int hp) {
        super(saleValue, rarity, name, levelReq);
        this.totalUpgrades = totalUpgrades;
        this.alreadyDoneUpgrades = alreadyDoneUpgrades;
        this.hp = hp;
    }

    public abstract void upgrade();

    //getters and setters
    public int getAlreadyDoneUpgrades() {
        return alreadyDoneUpgrades;
    }
    public void setAlreadyDoneUpgrades(int alreadyDoneUpgrades) {
        this.alreadyDoneUpgrades = alreadyDoneUpgrades;
    }

    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getTotalUpgrades() {
        return totalUpgrades;
    }
    public void setTotalUpgrades(int totalUpgrades) {
        this.totalUpgrades = totalUpgrades;
    }

    public String getCategory() {
        return category;
    }
}