public class Dog extends Animal {
    
    public Dog(String name) {
        super(name); // Call the Animal constructor
    }

    @Override
    public void speak() {
        System.out.println(getName() + " barks.");
    }
}
