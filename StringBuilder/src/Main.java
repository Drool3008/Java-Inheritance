public class Main {
    public static void main(String[] args) {
        String s = "30/03/2001";
        int i = s.indexOf("2001");
        System.out.printf("%nBirth year is : "+ s.substring(i));
        System.out.printf("%nBirth month is : "+s.substring(s.indexOf("03"),s.lastIndexOf('3')+1));
        String hello = "HELLO WORLD";
        String hello1 = "hello world";
        if(hello1.toUpperCase().equals(hello)) System.out.printf("%nboth are equal");
        else System.out.printf("%nUnequal");
        String p = String.join("/","30","08","01");
        System.out.printf("%n%s",p);
        p="300801";
        System.out.printf("%n%d",Integer.parseInt(p));
        String newDate = "30";
        newDate=newDate.concat("/");
        newDate=newDate.concat("08");
        newDate=newDate.concat("/");
        newDate=newDate.concat("2001");
        System.out.printf("%nNew Date is : %s",newDate);
        newDate=newDate.replace('/','.');
        System.out.printf("%nNew Date is : %s",newDate);
        String anotherDate = "21".concat("/").concat("01").concat("/").concat("2001");
        System.out.printf("%n%s",anotherDate);
        anotherDate = anotherDate.replace("/",".");
        System.out.printf("%n%s%n",anotherDate);
        System.out.println(anotherDate.replaceAll("/","-"));
        System.out.println("ABC".repeat(3).indent(5));

        //-----------------------------------------------------------//

        StringBuilder builder = new StringBuilder("Hello"+" "+"World");
        System.out.println(builder);
        String string = "Hello World";
        string.concat(" Bye");
        builder.append(" Bye");
        System.out.println(string.length());
        System.out.println(builder.length());
        builder.setCharAt(8,'G');
        System.out.println(builder);
        builder.reverse().setLength(3);
        System.out.println(builder);
    }
}