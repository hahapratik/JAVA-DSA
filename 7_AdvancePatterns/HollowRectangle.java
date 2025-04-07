public class HollowRectangle {
public static void hollow_rect(int Rows, int Cols){
    for(int i = 1; i<=Rows; i++){
        for(int j = 1; j<= Cols; j++){
            if(i == 1|| i== Rows || j == 1 || j == Cols){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }}
    public static void main(String[] args) {
        hollow_rect(4, 5);
    }
}
