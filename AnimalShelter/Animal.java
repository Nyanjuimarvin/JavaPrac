public class Animal {

    private int age;
    private String name;
    private String speciesName;
    private boolean isHealthy;
    private String favoriteFood;
    private double Weight;
    private char tagCharacter;

    public Animal(int animalAge, String animalName, String species, boolean animalHealth, String favFood, double animalWeight, char tagChar) {
        this.age = animalAge;
        this.name = animalName;
        this.speciesName = species;
        this.isHealthy = animalHealth;
        this.favoriteFood = favFood;
        this.Weight = animalWeight;
        this.tagCharacter = tagChar;
    }
    

    public void setAge(int animalAge) {
        this.age = animalAge;
    }

    public int getAge() {
        return age;
    }

    public void setName(String animalName) {
        this.name = animalName;
    }

    public String getName() {
        return name;
    }

    public void setSpeciesName(String species) {
        this.speciesName = species;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public void setHealthy(boolean animalHealth) {
        this.isHealthy = animalHealth;
    }

    public boolean getHealthy() {
        return isHealthy;
    }

    public void setFavoriteFood(String favFood) {
        this.favoriteFood = favFood;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setWeight(double animalWeight) {
        this.Weight = animalWeight;
    }

    public double getWeight() {
        return Weight;
    }

    public void setTagCharacter(char tagChar) {
        this.tagCharacter = tagChar;
    }

    public char getTagCharacter() {
        return tagCharacter;
    }


    public String health(boolean healthCheck) {
        if (healthCheck) {
            return "is very Healthy and loves to play";
        }
        return "has some complications and requires extra love and care";
    }

    public void printDetails() {
        System.out.println("**************************************************************************");
        System.out.printf("Meet %s. %s is a loving %s %n", getName(), getName(), getSpeciesName());
        System.out.printf("%s " + health(isHealthy), getName());
        System.out.printf("\n%s's favorite food is %s and they weigh %f Kgs%n", getName(), getFavoriteFood(), getWeight());
        System.out.printf("You can come visit him in section %c in our Shelter%n", getTagCharacter());
    }
}