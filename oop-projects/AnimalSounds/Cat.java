public class Cat extends Animal {
    
    public Cat(String name) {
        super(name); // Call the Animal constructor
    }

    @Override
    public void speak() {
        System.out.println(getName() + " meows.");
    }
}
