import java.util.Scanner;

public class Class {
    private int accountNumber;
    private int accountBalance;
    private String customerName;
    private String customerEmail;
    private String phoneNumber;
    public int getAccountNumber() {
        return accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getCustomerEmail() {
        return customerEmail;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setAccountNumber(int accountNumber) {
        if(accountNumber > 0 )
        {
            this.accountNumber = accountNumber;
            return;
        }
        Scanner scan = new Scanner(System.in);
        int d = 0;
        boolean loopbreak = true;
        do {
            try {
                d = Integer.parseInt(scan.nextLine());
                if (d <= 0) System.out.println("Please enter a valid Number");
                else loopbreak = false;
            }
            catch (NumberFormatException n)
            {
                System.out.println("Please enter a valid Number");
            }
        }while(loopbreak);
        this.accountNumber = d;
    }
    public void setAccountBalance(int accountBalance) {
        if(accountBalance >= 0 )
        {
            this.accountBalance = accountBalance;
            return;
        }
        Scanner scan = new Scanner(System.in);
        int d = 0;
        boolean loopbreak = true;
        do {
            try {
                d = Integer.parseInt(scan.nextLine());
                if (d < 0) System.out.println("Please enter a valid Number");
                else loopbreak = false;
            }
            catch (NumberFormatException n)
            {
                System.out.println("Please enter a valid Number");
            }
        }while(loopbreak);
        this.accountBalance = d;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void withdraw()
    {
        Scanner scan = new Scanner(System.in);
        int d =0;
        System.out.println("Enter amount to be withdrawn : ");
        boolean loopbreak = true;
        do {
            try
            {
                d = Integer.parseInt(scan.nextLine());
                if(d>=0) loopbreak = false;
                else System.out.println("Please enter valid Number");
            }
            catch (NumberFormatException b)
            {
                System.out.println("Please enter valid Number");
            }
        }while(loopbreak);

        int currBalance = accountBalance;
        if(currBalance - d < 0)
        {
            System.out.println("Insufficient funds");
            return;
        }
        accountBalance -=d;
        System.out.println("Updated account balance is : "+accountBalance);
    }
    public void deposit()
    {
        Scanner scan = new Scanner(System.in);
        boolean loopbreak = true;
        int d = 0;
        System.out.println("Enter amount to be deposited : ");
        do {
            try
            {
                d = Integer.parseInt(scan.nextLine());
                if(d<0) System.out.println("Please enter valid Number");
                else loopbreak = false;
            }
            catch (NumberFormatException b)
            {
                System.out.println("Please enter valid Number");
            }
        }while(loopbreak);
        accountBalance+=d;
        System.out.println("Updated account balance is : "+accountBalance);
    }
    public void display()
    {
        System.out.println("Name : "+this.customerName);
        System.out.println("Email : "+this.customerEmail);
        System.out.println("Acc.No : "+this.accountNumber);
        System.out.println("Contact.No : "+this.phoneNumber);
        System.out.println("Acc.Bal : "+this.accountBalance);
    }
}
