package item.helmet;

public class MageHelmet extends Helmet {
    private double spellPower;

    public MageHelmet(int saleValue, String rarity, String name, int levelReq, int alreadyDoneUpgrades, int hp, int totalUpgrades, double spellPower) {
        super(saleValue, rarity, name, levelReq, alreadyDoneUpgrades, hp, totalUpgrades);
        this.spellPower = spellPower;
    }

    @Override
    public void upgrade(){

    }
}
