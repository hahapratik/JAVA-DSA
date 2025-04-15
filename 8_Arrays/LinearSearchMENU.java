public class LinearSearchMENU {
    public static int linearSearch(String menu[], String key){
        for(int i = 0; i<menu.length; i++){
            if(menu[i] == key){
                return i; 
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String menu[] = {"Dhosa", "Idli", "Panner", "Chicken Masala", "Mutton", "Mushroom"};
         String key = "Mushroom";
         int index = linearSearch(menu, key);
         if(index == -1){
            System.out.println("Item Not Found");
         }else{
            System.out.println("Item is at Counter No : " +index);
         }
    }

}
