public class TypePromotion {
    public static void main(String args[]) {
        char a = 'a';
        char b = 'b';
        // Characters will be printed in there integer form by type casting it forcely
        System.out.println((int) a);
        System.out.println((int) b);
        System.out.println(b - a);
        // It will be printed as same as written unit we force it to change it type
        System.out.println(a);
        System.out.println(b);
    }
}
