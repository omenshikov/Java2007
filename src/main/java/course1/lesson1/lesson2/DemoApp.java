package course1.lesson1.lesson2;

public class DemoApp {

    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i > 2) {
                    System.out.print("0 ");
                } else {
                System.out.print("* ");
                }
            }
            System.out.println();

        }

    }
}
