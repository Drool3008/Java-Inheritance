public class SalariedEmployee extends Employee {
    double annualSalary;
    boolean isRetired;

    @Override
    public double collectPay() {
        double paycheck = annualSalary / 26;
        double adjustedPay = (isRetired)?(0.9)*paycheck:paycheck;
        return (int)adjustedPay;
    }
    public void retire()
    {
        isRetired = true;
        terminate("29/10/20023");
    }
    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

}
