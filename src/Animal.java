public class Animal {
    private String name;
    private int age;
    private String habitat;
    private AnimalCategory type;

    public Animal(String name, int age, String habitat, AnimalCategory type) {
        this.name = name;
        this.age = age;
        this.habitat = habitat;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public AnimalCategory getType() {
        return type;
    }

    public void setType(AnimalCategory type) {
        this.type = type;
    }
}
