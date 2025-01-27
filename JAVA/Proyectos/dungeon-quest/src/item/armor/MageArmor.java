package item.armor;

public class MageArmor extends Armor {
    private int spellPower;

    public MageArmor(int saleValue, String name, String rarity, int levelReq, int totalUpgrades, int alreadyDoneUpgrades, int hp, int spellPower) {
        super(saleValue, rarity, name, levelReq, totalUpgrades, alreadyDoneUpgrades, hp);
        this.spellPower = spellPower;
    }

    @Override
    public  void upgrade(){

    }
}
