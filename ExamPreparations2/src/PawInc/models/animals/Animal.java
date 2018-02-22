package PawInc.models.animals;

public abstract class Animal {
    private final String DEFAULT_CLEASING_STATUS = "UNCLEANSED";
    private String name;
    private int age;
    private String cleasingStatus;
    private String adoptionCenter;

    protected Animal(String name, int age) {
        this.setName(name);
        this.setAge(age);
        this.setCeasingStatus(DEFAULT_CLEASING_STATUS);
    }

    protected Animal(String name, int age, String adoptionCenter) {
        this(name, age);
        this.adoptionCenter = adoptionCenter;
    }

    public String getAdoptionCenter() {
        return this.adoptionCenter;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    private void setCeasingStatus(String ceasingStatus) {
        this.cleasingStatus = ceasingStatus;
    }

    public String getCeasingStatus() {
        return cleasingStatus;
    }

    public void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }
}
