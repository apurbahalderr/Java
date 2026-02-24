//Define two packages as – General and Marketing. In General package define a class ‘employee’  with data members as empid(protected), ename(private) and a public method as earnings() which calculate total earnings as
//	earnings         basic + DA (80% of basic) + HRA (15% of basic)


package Day7.General;

public class employee {
    protected int empid;
    private String empname;
    public employee(int empid, String empname) {
        this.empid = empid;
        this.empname = empname;
    }
    public double earnings(double basic) {
        double da = 0.8 * basic;
        double hra = 0.15 * basic;
        return basic + da + hra;
    }
}
