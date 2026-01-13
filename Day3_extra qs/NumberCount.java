//Find the no. of occurrence of each element in a user entered list of nos.
//Input:  	Enter list of numbers  e.g.( 15 25 15 11 25 32 15 32)
//Output: 	Occurrence of 15=3
//Occurrence of 25=2
//Occurrence of 11=1
//Occurrence of 32=2

//I am implementing the hash tables concept for this problem using arrays

import java.util.Scanner;

public class NumberCount {

    static final int TABLE_SIZE = 20;
    static int[] keys = new int[TABLE_SIZE];
    static int[] freq = new int[TABLE_SIZE];

    static void initialize() {
        for (int i = 0; i < TABLE_SIZE; i++) {
            keys[i] = -1;
            freq[i] = 0;
        }
    }

    static void insert(int value) {
        int index = value % TABLE_SIZE;

        while (keys[index] != -1 && keys[index] != value) {
            index = (index + 1) % TABLE_SIZE; // Linear probing
        }

        if (keys[index] == -1) {
            keys[index] = value;
            freq[index] = 1;
        } else {
            freq[index]++;
        }
    }

    static void display() {
        for (int i = 0; i < TABLE_SIZE; i++) {
            if (keys[i] != -1) {
                System.out.println("Occurrence of " + keys[i] + " = " + freq[i]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        initialize();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            insert(value);
        }

        display();
        sc.close();
    }
}

