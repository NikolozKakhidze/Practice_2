public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Fido", 3, "Home", AnimalCategory.MAMMAL, "Golden Retriever");
        myDog.bark();
        myDog.playWith(); 

        Parrot myParrot = new Parrot("Polly", 2, "Jungle", AnimalCategory.BIRD, "English");
        myParrot.playWith();
        myParrot.fly();
    }
}