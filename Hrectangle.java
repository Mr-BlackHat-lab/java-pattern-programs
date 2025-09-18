public class Hrectangle {
    public static void main(String[] args) {
        int y = 4;
        int x = 5;
        for (int i = 1; i <= y; i++) {
            for(int j = 1; j <= x; j++){
                if (i== 1|| j==1 || i==y || j==x ) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
