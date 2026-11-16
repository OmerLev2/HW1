public class Assignment01Q01 {
    public static void main(String[] args) {
        // Q1: ASCII mod 5

        for (String str : args) {
            
            char first = str.charAt(0);
            if (first % 5 == 0) {
                System.out.println(first);
            }
        }
    }
}
