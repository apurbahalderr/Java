import java.util.Scanner;

class StudentDetails {
    private static int roll;
    private String name;
    private double cgpa;

    StudentDetails(String name, double cgpa){
        roll += 1;
        this.name = name;
        this.cgpa = cgpa;
    }

    @Override
    public String toString(){
        return "Roll: " + roll + ", Name: " + name + ", CGPA: " + cgpa;
    }

}


public class StudentDetailsMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of students: ");
        int n = sc.nextInt();
        sc.nextLine();
        StudentDetails[] students = new StudentDetails[n];

        for(int i = 0; i < n; i++){
            System.out.println("Enter name and cgpa of student" + (i + 1));
            String name = sc.nextLine();
            double cgpa = sc.nextDouble();
            sc.nextLine();
            students[i] = new StudentDetails(name, cgpa);
        }

        sc.close();

        for(int i = 0; i < n; i++){
            System.out.println(students[i]);
        }
    }
}
