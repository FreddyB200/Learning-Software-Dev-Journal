package item.weapon;

public class MageWeapon extends Weapon {
    private int spellPower;

    public MageWeapon(int saleValue, String rarity, String name, int levelReq, int totalUpgrades, int alreadyDoneUpgrades, int spellPower) {
        super(saleValue, rarity, name, levelReq, totalUpgrades, alreadyDoneUpgrades);
        this.spellPower = spellPower;
    }

    @Override
    public void upgrade(){

    }
}


