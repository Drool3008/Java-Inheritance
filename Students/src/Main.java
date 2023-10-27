public class Main {
    public static void main(String[] args) {
        for(int i =1;i<=5;i++)
        {
            Student s = new Student(
                    switch (i)
                    {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "John";
                        case 4 -> "Newton";
                        case 5 -> "George";
                        default -> "Tim";
                    },
                    Integer.parseInt("1191038" + i),
                    Integer.parseInt("30080"+i),
                    switch (i)
                    {
                        case 1 -> "Java";
                        case 2 -> "C++";
                        case 3 -> "JS";
                        case 4 -> "Python";
                        case 5 -> "Go";
                        default -> "Invalid";
                    });
            System.out.println(s);
        }
        LPAStudent l = new LPAStudent("Anne",11910389,300801,"C++");
        LPAStudent m = new LPAStudent("Frank",11910380,300802,"Python");
        System.out.println(m.classList());
        System.out.println(l.name());
//        m.classList("C++"); Not allowed

    }
}