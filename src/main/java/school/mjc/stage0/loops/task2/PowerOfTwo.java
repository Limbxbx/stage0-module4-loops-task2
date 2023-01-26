package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0) {
            System.out.println("Too much power");
            return;
        }
        int base = 2;
        int result = 1;
        int i = 0;
        while (i <= power) {
            System.out.println(base + "^" + i + " = " + result);
            i++;
            result *= base;
        }
    }
}
