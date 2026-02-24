package seventh_class;

interface Greeting {
    void sayHello();
}


public class AnonymousExMain{
    public static void main(String[] args) {
        Greeting greet = new Greeting() {
            public void sayHello() {
                System.out.println("Hello, Greeting from me");
            }
        };
        greet.sayHello();
    }
}
