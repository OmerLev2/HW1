public class Assignment01Q02 {
    // Pi approxiamtion
    public static void main(String[] args) {

        double actualPi = Math.PI;
        double approxPi = 0;

        int n = Integer.parseInt(args[0]);
        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            sum += (1.0 / (2 * i - 1)) * (Math.pow(-1, i + 1));
        }

        approxPi = 4 * sum;
        System.out.println(approxPi + " " + actualPi);
    }
}
