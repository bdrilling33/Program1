public class Program1 {
    public static void main(String[] args) {

        Pet peta = new Pet();
        peta.setName("Libby");
        peta.setAge(5);
        peta.setSpecies("dog");
        peta.setWeight(80.9);

        Pet petb = new Pet();
        petb.setAge(10);
        petb.setName("Hurley");
        petb.setSpecies("lizard");
        petb.setWeight(1.2);

        Pet petc = new Pet();
        petc.setAge(4);
        petc.setName("Tiny");
        petc.setSpecies("cat");
        petc.setWeight(15.5);

        System.out.println("You have the following pets:");
        peta.display();
        petb.display();
        petc.display();

    }

    }

class  Pet {

    private String name;
    private String species;
    private int age;
    private double weight;

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    // getters

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public void display() {
        System.out.println("A " + getAge() + " year old " + getSpecies() + " named " + getName()
                + " that weights " + getWeight() + " pounds.");
    }
}