public class InumPyramid {
    public static void main(String[] args) {
        int x = 5;
        for (int i = x; i >= 1; i--) {
            for(int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }
}
