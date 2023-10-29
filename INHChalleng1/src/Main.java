public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Max","30/08/2001","30/09/2023");
        System.out.println(employee1);
        System.out.println("Age is : " + employee1.getAge());
        System.out.println("Pay is : " + employee1.collectPay());
        Employee employee2 = new Employee("Peter" , "19/08/1990","21/01/2023");
        System.out.println(employee2);
        System.out.println("Age is : " + employee2.getAge());
        System.out.println("Pay is : " + employee2.collectPay());

        SalariedEmployee salariedEmployee1 = new SalariedEmployee("George","12/09/2010","25/10/2023",300000);
        System.out.println(salariedEmployee1);

        salariedEmployee1.retire();
        System.out.println(salariedEmployee1);
        System.out.println("paycheck is : " +salariedEmployee1.collectPay());

        HourlyEmployee hourlyEmployee1 = new HourlyEmployee("Pitcher","30/03/2000","27/09/2023",200);
        System.out.println(hourlyEmployee1);
        System.out.println("paycheck is : "+hourlyEmployee1.collectPay());
    }
}