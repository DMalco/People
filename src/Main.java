// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)
    {
        Person p = new Person("Dave", 35);

        System.out.println(p.toString());
        p.greeting();

        Scouser s = new Scouser("Sinbad", 55);
        System.out.println(s.toString());
        s.greeting();

        Geordie g = new Geordie("Alan", 60);
        System.out.println(g.toString());
        g.greeting();


    }
}
