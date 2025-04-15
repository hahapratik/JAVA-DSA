public class PassingArrayAsArgunment {
    // Method to update the elements of the array
    public static void update(int marks[]) {
        // Loop through each element of the array
        for (int i = 0; i < marks.length; i++) // Most important 
        {
            // Increment each element of the array by 1
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        // Initialize an array with some values
        int marks[] = { 12, 13, 14 };
        
        // Call the update method to modify the array
        update(marks);
        
        // Loop through the updated array to print its elements
        for (int i = 0; i < marks.length; i++) {
            // Print each element of the array followed by a space
            System.out.print(marks[i] + " ");
        }
    }
}
