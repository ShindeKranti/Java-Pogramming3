public class Even100to150 {
    public static void main(String args[]) {

        int i;

        for (i = 100; i <= 150; i++) {

            if (i % 2 == 0) {
                System.out.println(i + " is Even");
            }
            else if (i % 2 != 0) {
                System.out.println(i + " is Odd");
            }
        }
    }
}