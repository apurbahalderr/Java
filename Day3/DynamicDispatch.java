public class DynamicDispatch {
  public static void main(String[] args){
    Apple obj;
    obj = new Apple();
    obj.show();
    obj = new Banana();
    obj.show();
    obj = new Cherry();
    obj.show();
  }
}

class Apple{
    void show(){
        System.out.println("This is apple");
    }
}

class Banana extends Apple{
    void show(){
        System.out.println("This is Banana");
    }
}

class Cherry extends Apple{
    void show(){
        System.out.println("This is Cherry");
    }
}

/*

3.Aim of the program : Write a program in Java having three classes Apple, Banana and Cherry. Class Banana and Cherry are inherited from class Apple and each class have their own member function show() . Using Dynamic Method Dispatch concept display all the show() method of each class. 
Input:  Mention show function of each class. 
Output: Display show function of each class accordingly.
*/
