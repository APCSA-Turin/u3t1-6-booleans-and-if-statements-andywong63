package do_now;

public class Main {
    public static void main(String[] args) {

        // primitives
        int num1 = 10;
        int num2 = num1;
        System.out.println(num1);
        System.out.println(num2);

        num1 = 15;
        System.out.println(num1);
        System.out.println(num2);

        // objects
        Parrot parrot1 = new Parrot("Toucan", "Sam", 15);
        Parrot parrot2 = parrot1;
        System.out.println(parrot1.info());
        System.out.println(parrot2.info());

        parrot1.setAge(20);
        parrot2.setName("Mary");
        System.out.println(parrot1.info());
        System.out.println(parrot2.info());
    }
}
