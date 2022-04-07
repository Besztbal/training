package stringtype;

public class StringTypeMain {

    public static void main(String[] args) {

        String prefix = "Hello";

        String name = "John Doe";

        String message= prefix +" "+ name;

        message += 444;

        boolean b =message.equals("Hello John Doe");

        boolean c =message.equals("Hello John Doe444");


        System.out.println(message);
        System.out.println(b);
        System.out.println(c);

        String s1="";
        String s2="";

        String s=s1+s2;

        System.out.println(s.length());

        String sample = "Abcde";
        System.out.println(sample.length());
        System.out.println(sample.substring(0, 1) + ", " + sample.substring(2, 3));
        System.out.println(sample.substring(0, 2));




    }
}
