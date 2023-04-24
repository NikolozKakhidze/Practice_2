public class Dog extends Animal implements Pet {
    private String breed;

    public Dog(String name, int age, String habitat, AnimalCategory type, String breed) {
        super(name, age, habitat, type);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void playWith() {
        System.out.println(getName() + "dog barks");
    }

    public void bark() {
    }
}
