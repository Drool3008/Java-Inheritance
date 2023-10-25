public class Car{
    private String carName;
    private String carModel = "XY-ZZ";
    private String carColor = "blue";
    private int carDoor = 4;
    private boolean carConvertible = false;

    public void describeCar()
    {
        System.out.println("Car name is : "+carName);
        System.out.println("Car model is : "+carModel);
        System.out.println("Car color is : "+carColor);
        System.out.println("Number of doors are : "+carDoor);
        System.out.println((carConvertible ? "Convertible":"Not convertible"));
    }

    public void setCarName(String carName) {
        if(carName == null)
        {
            this.carName = "Unknown";
            return;
        }
        String lowercaseMake = carName.toLowerCase();
        switch(lowercaseMake)
        {
            case "holden" , "tata" , "tesla" , "bajaj" -> this.carName = carName;
            default -> {
                this.carName ="Unsupported";
            }
        }
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public void setCarDoor(int carDoor) {
        this.carDoor = carDoor;
    }

    public void setCarConvertible(boolean carConvertible) {
        this.carConvertible = carConvertible;
    }

    public String getCarName() {
        return carName;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getCarColor() {
        return carColor;
    }

    public int getCarDoor() {
        return carDoor;
    }

    public boolean isCarConvertible() {
        return carConvertible;
    }
}