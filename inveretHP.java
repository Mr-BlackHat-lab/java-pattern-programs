public class inveretHP {
    public static void main(String[] args) {
        int x = 4;
        for (int i = x; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
