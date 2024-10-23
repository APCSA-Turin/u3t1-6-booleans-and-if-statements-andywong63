public class Main {
    public static void main(String[] args) {
        Parrot parrot1 = new Parrot("Lovebird", "Bill", 5);
        Parrot parrot2 = parrot1;
        parrot2.setAge(10);
        System.out.println(parrot2.getAge());
        System.out.println(parrot1.getAge());
        System.out.println(parrot1 == parrot2);

        Parrot parrot3 = new Parrot("Cockatoo", "Lisa", 12);
        parrot2 = parrot3;
        parrot3 = parrot1;
        parrot3.setName("Jeff");
        parrot1 = parrot2;
        System.out.println(parrot1.getName());
        System.out.println(parrot2.getName());
        System.out.println(parrot3.getName());
        System.out.println(parrot1 == parrot2);
        System.out.println(parrot1 == parrot3);
        System.out.println(parrot2 == parrot3);

        Rectangle rectA = new Rectangle(80, 100);
        Rectangle rectB = rectA;
        System.out.println(rectA == rectB);
        System.out.println(rectA);
        System.out.println(rectB);


        
        Dog dog1 = new Dog("Spot", 10, false);
        Dog dog2 = new Dog("Petunia", 12, true);
        Dog dog3 = new Dog("Lucky", 3, false);
        Dog dog4 = new Dog("Spot", 5, true);
        Dog dog5 = new Dog("Petunia", 12, true);
    
        System.out.println("-- Set A --");
        System.out.println(dog1 == dog2);
        System.out.println(dog1 == dog3);
        System.out.println(dog1 == dog4);
        System.out.println(dog2 == dog5);
    
        // create reference variables dog6, dog7, dog8
        Dog dog6 = dog1;  
        Dog dog7 = dog2;
        Dog dog8 = dog6;
    
        System.out.println("-- Set B --");
        System.out.println(dog1 == dog6);
        System.out.println(dog2 == dog7);
        System.out.println(dog6 == dog8);
        System.out.println(dog1 == dog8);
    
        dog1 = null;
        System.out.println("-- Set C --");
        System.out.println(dog1 == dog6);
        System.out.println(dog2 == dog7);
        System.out.println(dog6 == dog8);
        System.out.println(dog1 == dog8);
        System.out.println(dog1 == null);
        System.out.println(dog6 != dog8);    
    }
}
