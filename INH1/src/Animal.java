public class Animal {
    String type;
    String size;
    double weight;

    public Animal() {
    }

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }
    public void move(String speed)
    {
        System.out.println(type + " moves " + speed);
    }
    public void makeSomeNoise()
    {
        System.out.println(type + " makes some kind of noise ");
    }
}
