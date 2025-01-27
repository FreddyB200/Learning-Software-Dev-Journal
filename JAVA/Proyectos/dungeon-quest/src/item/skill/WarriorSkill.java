package item.skill;

import item.Item;

public class WarriorSkill extends Skill {
    private double physicalMultiplier;

    public WarriorSkill(int saleValue, String rarity, String name, int levelReq, String description, double physicalMultiplier) {
        super(saleValue, rarity, name, levelReq, description);
        this.physicalMultiplier = physicalMultiplier;
    }


    public double getPhysicalMultiplier() {
        return physicalMultiplier;
    }

    public void setPhysicalMultiplier(double physicalMultiplier) {
        this.physicalMultiplier = physicalMultiplier;
    }
}
