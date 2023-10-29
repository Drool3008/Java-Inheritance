public class Fish extends Animal{

    private int backFins;
    private int gills;

    public Fish(String type, double weight, int backFins, int gills) {
        super(type, "small", weight);
        this.backFins = backFins;
        this.gills = gills;
    }

    private void moveBackFins()
    {
        System.out.println("Moving Backfins");
    }
    private void moveMuscles()
    {
        System.out.println("Moving Muscles");
    }
    public void move(String speed)
    {
        super.move(speed);
        moveMuscles();
        if(speed == "fast")
        {
            moveBackFins();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "backFins=" + backFins +
                ", gills=" + gills +
                "} " + super.toString();
    }
}
