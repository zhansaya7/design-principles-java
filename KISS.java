public class KISS {

    void printPositive(int[] numbers) {
        if (numbers == null) return;

        for (int n : numbers) {
            if (n > 0) System.out.println(n);
        }
    }

    int divide(int a, int b) {
        return b == 0 ? 0 : a / b;
    }
}
