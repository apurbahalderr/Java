package Day9;

    // 1. Aim of the program - Write a program in Java using multi-threading which will display
    //  a counter value within a specified range with a gap of 5 milliseconds after setting it’s name as given by the user.
	// 	Input : Name of the thread - First
	// 		Lower range of counter - 10
	// 		Upper range of counter - 15
	// 	Output : Thread - First
	// 		Counter - 10 	11	12	13	14	15

import java.util.Scanner;


class Count extends Thread {
    private String name;
    private int lowerRange;
    private int upperRange;

    public Count(String name, int lowerRange, int upperRange) {
        this.name = name;
        this.lowerRange = lowerRange;
        this.upperRange = upperRange;
    }

    @Override
    public void run() {
        System.out.println("Thread - " + name);
        System.out.print("Counter - ");
        for (int i = lowerRange; i <= upperRange; i++) {
            System.out.print(i + " ");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}

public class CountThread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the thread: ");
        String threadName = sc.nextLine();
        System.out.print("Enter the lower range of counter: ");
        int lowerRange = sc.nextInt();
        System.out.print("Enter the upper range of counter: ");
        int upperRange = sc.nextInt();
        sc.close();

        Count countThread = new Count(threadName, lowerRange, upperRange);
        countThread.start();
    }

}
