import java.util.ArrayList;

public class InventorySystem {
    public static void main(String[] args) {
        ArrayList<Item> inventory = new ArrayList<>();

        // Adding custom items to the inventory
        Item healthPotion = new Item("Health Potion", "Potion", 20);
        Item sword = new Item("Sword", "Weapon", 50);
        Item shield = new Item("Shield", "Armor", 30);
        //Create More Items
        Item manaElixir = new Item( "Mana Elixir", "Dance", 44);
        Item magicStaff = new Item( "Magic Staff", "Wave", 60);
        Item helmet = new Item( "Helmet", "Rock", 40);


        inventory.add(healthPotion);
        inventory.add(sword);
        inventory.add(shield);
        inventory.add(manaElixir);
        inventory.add(magicStaff);
        inventory.add(helmet);

        // Displaying inventory items
        for (Item item : inventory) {
            System.out.println(item);

            //Update Item Values
            System.out.println();
            shield.setValue(40);

            //Remove Items
            inventory.remove(1);
        }
    }
}