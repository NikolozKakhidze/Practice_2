public class Parrot extends Animal implements Pet, Bird {
    private String language;

    public Parrot(String name, int age, String habitat, AnimalCategory type, String language) {
        super(name, age, habitat, type);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public void playWith() {
        System.out.println(getName() + " parrot can Speak like a human");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " parrot flies");
    }
}
