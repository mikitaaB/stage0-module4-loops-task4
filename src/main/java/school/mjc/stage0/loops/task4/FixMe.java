package school.mjc.stage0.loops.task4;

public class FixMe {
    public static void main(String[] args) {
        int numberToGoUntil = 100;
        for (int i = 1; i <= numberToGoUntil; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            } else if (i == 7) {
                System.out.println("last");
                break;
            }
        }
        System.out.println("will I be printed?");
    }
}
