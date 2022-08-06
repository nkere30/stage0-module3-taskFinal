package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public static void calculateSum(int number) {
        int first, second, third, fourth;
        first = number%10;
        number /= 10;
        second = number%10;
        number /= 10;
        third = number%10;
        number /= 10;
        fourth = number%10;
        int result = first + second + third + fourth;
        System.out.println(result);
    }

    public static void main(String[] args) {
        calculateSum(123);
    }
}
