public class Inner_Outer {
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.test();
    }
}

//Aim of the program: Write a java program to illustrate the concept of inner class. Create a class Outer with
//data member x; the class contains one Inner class which has one display method() to display the value of x.

class Outer{
    int x;
    void test(){
        Inner inner = new Inner();
        inner.display();
    }
    Outer(){
        x = 10;
    }
    class Inner{
        void display(){
            System.out.println("Value of x: " + x);
        }
    }
}
