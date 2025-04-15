// Class to demonstrate linear search on a menu array
public class LinearSearchMENU {

    // Method to perform linear search on a string array
    public static int linearSearch(String menu[], String key) {
        // Loop through each element in the menu array
        for (int i = 0; i < menu.length; i++) {
            // Check if the current element matches the key
            if (menu[i] == key) {
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if the key is not found
    }

    public static void main(String[] args) {
        // Initialize the menu array with food items
        String menu[] = {"Dhosa", "Idli", "Panner", "Chicken Masala", "Mutton", "Mushroom"};
        
        // Define the key to search for in the menu
        String key = "Mushroom";
        
        // Call the linearSearch method and store the result
        int index = linearSearch(menu, key);
        
        // Check if the item was found or not
        if (index == -1) {
            System.out.println("Item Not Found"); // Print if the item is not found
        } else {
            System.out.println("Item is at Counter : " + index); // Print the index if found
        }
    }
}