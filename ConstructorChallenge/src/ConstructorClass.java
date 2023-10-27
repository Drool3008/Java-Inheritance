public class ConstructorClass {
    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailId() {
        return emailId;
    }

    private String name;
    private int creditLimit;
    private String emailId;

    public ConstructorClass(String name, int creditLimit, String emailId) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailId = emailId;
    }
    public ConstructorClass(String name, String emailId) {
        this(name,4000,emailId);
    }
    public ConstructorClass() {
        this("Default Name",4000,"example@email.com");
    }
}
