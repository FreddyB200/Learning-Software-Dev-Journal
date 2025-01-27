package item.weapon;

import item.Item;


public abstract class Weapon extends Item {
    private String category = "Weapon";
    private int totalUpgrades;
    private int alreadyDoneUpgrades = 0;

    public Weapon(int saleValue, String rarity, String name, int levelReq, int totalUpgrades, int alreadyDoneUpgrades) {
        super(saleValue, rarity, name, levelReq);
        this.totalUpgrades = totalUpgrades;
        this.alreadyDoneUpgrades = alreadyDoneUpgrades;
    }

    public abstract void upgrade();


    //getters and setters

    public int getAlreadyDoneUpgrades() {
        return alreadyDoneUpgrades;
    }
    public void setAlreadyDoneUpgrades(int alreadyDoneUpgrades) {
        this.alreadyDoneUpgrades = alreadyDoneUpgrades;
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
