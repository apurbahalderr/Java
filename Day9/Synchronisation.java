package ninth_class;

// 2. Aim of the program -Write a program in java which will display the working of two threads in synchronization.
// Input: I love RUST very much
// Output: 
// Thread 1 - I
// Thread 1 - love
// Thread 1 - RUST 
// Thread 1 - very
// Thread 1 - much
// Thread 2 - I
// Thread 2 - love
// Thread 2 - RUST
// Thread 2 - very
// Thread 2 - much      


class MyThread implements Runnable {
    private final Synchronisation synchronisation;
    private final String[] words;
    private final String threadName;

    MyThread(Synchronisation synchronisation, String[] words, String threadName) {
        this.synchronisation = synchronisation;
        this.words = words;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        synchronisation.displayWords(words, threadName);
    }
}

public class Synchronisation {
    synchronized void displayWords(String[] words, String threadName) {
        for (String word : words) {
            System.out.println(threadName + " - " + word);
        }
    }

    public static void main(String[] args) {
        String input = "I love RUST very much";
        String[] words = input.split(" ");

        Synchronisation obj = new Synchronisation();

        Thread t1 = new Thread(new MyThread(obj, words, "Thread 1"));
        Thread t2 = new Thread(new MyThread(obj, words, "Thread 2"));


        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Main thread interrupted");
        }
    }
}
