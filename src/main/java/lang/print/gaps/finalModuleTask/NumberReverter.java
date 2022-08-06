package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public static void revert(int number) {
        int first, second, third;
        first = number %10;
        number /= 10;
        second = number %10;
        number /= 10;
        third = number%10;
        int result = first * 100 + second * 10 + third;
        System.out.println(result);
    }

    public static void main(String[] args) {
        revert(489);
    }
}
