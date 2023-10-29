public class Dog extends Animal{

    private String earShape;
    private String tailShape;
    public Dog() {
        super("Mutt","Big",50);
    }

    public Dog(String type,double weight)
    {
        this(type,"small",weight,"Perky","Curled");
    }
    public Dog(String type, String size, double weight, String earShape, String tailShape) {
        super(type, weight<15?"small":(weight < 30?"medium":"large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        if(speed == "slow")
        {
            wagTail();
            walk();
        }
        else
        {
            run();
            bark();
        }
        System.out.println();
    }
    private void bark()
    {
        System.out.println("Woof! ");
    }
    private void walk()
    {
        System.out.println("Dog walks! ");
    }
    private void run()
    {
        System.out.println("Dog runs! ");
    }
    private void wagTail()
    {
        System.out.println("Dog wags tail! ");
    }
    public void makeSomeNoise()
    {
        if(type == "Wolf")
        {
            System.out.println("Ow woooo!");
        }
        bark();
        System.out.println();
    }

}
