package item.helmet;

public class WarriorHelmet extends Helmet {
    private double physicalPower;

    public WarriorHelmet(int saleValue, String rarity, String name, int levelReq, int alreadyDoneUpgrades, int hp, int totalUpgrades, double physicalPower) {
        super(saleValue, rarity, name, levelReq, alreadyDoneUpgrades, hp, totalUpgrades);
        this.physicalPower = physicalPower;
    }

    @Override
    public void upgrade(){

    }
}
