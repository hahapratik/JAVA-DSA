public class logical {
    public static void main(String[] args) {
        
        // There are 3 types of logical operators
        // 1. Logical AND
        // 2. Logical OR
        // 3. Logical NOT

        // In Logical AND Opperatore if both of the condition is true then only the
        // condition will be true otherwise it will be false
        System.out.println((5 < 10) && (10 < 12)); // This one is the only true one couse it have both the options right
        System.out.println((5 < 10) && (10 > 12));
        System.out.println((5 > 10) && (10 > 12));
        System.out.println((5 < 10) && (10 > 12));
    }
}
