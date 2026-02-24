// -  Design a class University that contains an inner class Department. University has fields: universityName, location ;Department has fields: deptName, hodName ;
// The inner class should access and display the outer class data.
// Create an object of the inner class from the outer class.
package Day7;

public class University {
  String universityName;
  String location;

  public University(String universityName, String location) {
    this.universityName = universityName;
    this.location = location;
  }

  class Department {
    String deptName;
    String hodName;

    public Department(String deptName, String hodName) {
      this.deptName = deptName;
      this.hodName = hodName;
    }

    public void display() {
      System.out.println("University Name: " + universityName);
      System.out.println("Location: " + location);
      System.out.println("Department Name: " + deptName);
      System.out.println("HOD Name: " + hodName);
    }
  }

  public static void main(String[] args) {
    University uni = new University("ABC University", "New York");
    University.Department dept = uni.new Department("Computer Science", "Dr. Smith");
    dept.display();
  }
}