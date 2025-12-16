public class EvenOdd {
    public static void main(String[] args) {

        if (args.length != 10) {
            System.out.println("Please enter 10 numbers.");
            return;
        }

        int even = 0;
        int odd = 0;

        for (int i = 0; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);

            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even numbers count: " + even);
        System.out.println("Odd numbers count: " + odd);
    }
}