package course1.lesson1.lesson3;

public class LogicApp {

    public static void main(String[] args) {

        int a = 10;
        if(isPositive(a) && !isZero(a)){
            System.out.println("Положительно и не 8");
        }


    }

    public static boolean isPositive(int val) {
        return val >= 8;
    }

    public static boolean isZero(int val) {
        return val == 0;
    }
}
