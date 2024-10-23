public class Dog {
    private String name;
    private int age;
    private boolean isSleeping;

    public Dog(String dogName, int dogAge, boolean sleeping) {
        name = dogName;
        age = dogAge;
        isSleeping = sleeping;
    }

    public boolean asleep() {
        return isSleeping;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}