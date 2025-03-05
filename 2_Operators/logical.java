public class logical {
    public static void main(String[] args) {
        
        // There are 3 types of logical operators
        // 1. Logical AND
        // 2. Logical OR
        // 3. Logical NOT

        // In Logical AND Opperatore if both of the condition is TRUE then only the
        // condition will be TRUE otherwise it will be FALSE

        System.out.println((5 < 10) && (10 < 12)); // This one is the only true one couse it have both the options right
        System.out.println((5 < 10) && (10 > 12));
        System.out.println((5 > 10) && (10 > 12));
        System.out.println((5 < 10) && (10 > 12));

        // In Logical OR Opperatore if both of the condition is FALSE then only the
        // condition will be FALSE otherwise it will be TRUE

        System.out.println((5 > 10) || (10 > 12)); // This one is the only FALSE one couse it have both the options WRONG
        System.out.println((5 < 10) || (10 > 12));
        System.out.println((5 > 10) || (10 < 12));
        System.out.println((5 < 10) || (10 > 12));

        // In Logical NOT Opperatore The Opperatore will change the statement completly opposite of it 
        // if the statement is TRUE it will change it into FALSE and same as if the conition is FALSE it will change it into TRUE 

        System.out.println((10>5)); // As you see that the condition is TRUE but after we apply the NOT ! in it it will print false 
        System.out.println(!(10>5)); 

    }
}
