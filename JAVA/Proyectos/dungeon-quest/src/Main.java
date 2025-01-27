import inventory.Inventory;
import item.armor.MageArmor;
import item.armor.WarriorArmor;
import item.helmet.Helmet;
import item.helmet.WarriorHelmet;
import item.skill.MageSkill;
import item.skill.Skill;
import item.skill.WarriorSkill;
import item.weapon.MageWeapon;
import item.weapon.WarriorWeapon;
import item.weapon.Weapon;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        WarriorWeapon weapon = new WarriorWeapon(9999,"muy raroo","katana",1,10,10,15000);
        WarriorHelmet helmet = new WarriorHelmet(999,"commom","akuma war helm",1,5,1200,20, 1200);
        WarriorSkill skill = new WarriorSkill(1212,"uncommon","pjantom forces",12,"una habilidad muy chula xd",1.25);
        WarriorArmor armor = new WarriorArmor(12, "akuma chest", "commom",1111,10,1000,10,1200);
        MageArmor armor2 = new MageArmor(12,"nombre","3213",123,123,123,123,123);

        inventory.addItem(weapon, weapon.getCategory());
        inventory.addItem(armor, armor.getCategory());
        inventory.addItem(helmet, helmet.getCategory());
        inventory.addItem(skill, skill.getCategory());
        inventory.addItem(armor2, armor2.getCategory());
        System.out.println("Items before removal by index:"+"\n");
        inventory.listItems();
        inventory.removeItem(weapon, weapon.getCategory());
        System.out.println("Items after removal by index:"+"\n");
        inventory.listItems();
        inventory.removeItem(armor2, armor2.getCategory());
        inventory.listItems();





    }
}
