package item.armor;

public class WarriorArmor extends Armor {
    private int physicalPower;

    public WarriorArmor(int saleValue, String name, String rarity, int levelReq, int totalUpgrades, int alreadyDoneUpgrades, int hp, int physicalPower) {
        super(saleValue, rarity, name, levelReq, totalUpgrades, alreadyDoneUpgrades, hp);
        this.physicalPower = physicalPower;
    }

    @Override
    public void upgrade(){

    }
}
