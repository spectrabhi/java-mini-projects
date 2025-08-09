public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog("Buddy");
        Animal myCat = new Cat("Whiskers");

        myDog.speak(); // Outputs: Buddy barks.
        myCat.speak(); // Outputs: Whiskers meows.
    }
}
