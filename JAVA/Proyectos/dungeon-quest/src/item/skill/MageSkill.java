package item.skill;

import item.Item;

public class MageSkill extends Skill {
    private double spellMultiplier;

    //sobrecargando construnctores
    public MageSkill(int saleValue, String rarity, String name, int levelReq, String description, double spellMultiplier) {
        super(saleValue, rarity, name, levelReq, description);
        this.spellMultiplier = spellMultiplier;
    }

    //getters and setters
    public double getSpellMultiplier() {
        return spellMultiplier;
    }

    public void setSpellMultiplier(double spellMultiplier) {
        this.spellMultiplier = spellMultiplier;
    }
}
