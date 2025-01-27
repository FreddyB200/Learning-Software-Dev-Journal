package item.skill;

import item.Item;

public abstract class Skill  extends Item  {
    private String category = "Skill";
    private String description;

    public Skill(int saleValue, String rarity, String name, int levelReq, String description) {
        super(saleValue, rarity, name, levelReq);
        this.description = description;
    }


    public void activate(){

    }

    //getters and setters


    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}


