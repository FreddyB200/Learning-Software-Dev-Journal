package item.weapon;

public class WarriorWeapon extends Weapon {
    private int physicalPower;

    public WarriorWeapon(int saleValue, String rarity, String name, int levelReq, int totalUpgrades, int alreadyDoneUpgrades, int physicalPower) {
        super(saleValue, rarity, name, levelReq, totalUpgrades, alreadyDoneUpgrades);
        this.physicalPower = physicalPower;
    }

    @Override
    public void upgrade(){

    }
}
