package item.helmet;

import item.Item;

public abstract class Helmet extends Item {

    private String category = "Helmet";
    private int totalUpgrades;
    private int alreadyDoneUpgrades = 0;
    private int hp;

    public Helmet(int saleValue, String rarity, String name, int levelReq, int alreadyDoneUpgrades, int hp, int totalUpgrades) {
        super(saleValue, rarity, name, levelReq);
        this.alreadyDoneUpgrades = alreadyDoneUpgrades;
        this.hp = hp;
        this.totalUpgrades = totalUpgrades;
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