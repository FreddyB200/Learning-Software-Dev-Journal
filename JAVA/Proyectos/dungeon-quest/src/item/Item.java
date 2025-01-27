package item;

public abstract class Item {
    private String name;
    private String rarity;
    private int saleValue;
    private int levelReq;

    public Item(int saleValue, String rarity, String name, int levelReq) {
        this.saleValue = saleValue;
        this.rarity = rarity;
        this.name = name;
        this.levelReq = levelReq;
    }

    public void sell(){
        //implementation here
    }


    public boolean isEquipped(){
        return false;
    }

    //GETTERS AND SETTERS

    //sale value
    public void setSaleValue(int saleValue) {
        this.saleValue = saleValue;
    }
    public int getSaleValue() {
        return saleValue;
    }

    //rarity
    public void setRarity(String rarity) {
        this.rarity = rarity;
    }
    public String getRarity() {
        return rarity;
    }

    //name
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    //level reqs
    public void setLevelReq(int levelReq) {
        this.levelReq = levelReq;
    }
    public int getLevelReq() {
        return levelReq;
    }










}

