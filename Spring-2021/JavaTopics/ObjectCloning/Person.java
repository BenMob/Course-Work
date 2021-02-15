package ObjectCloning;

public class Person implements Cloneable{
    private String firstName = null;
    private String lastName = null;
    private int age = 0;

    public Person(){}
    public Person(String fName, String lName, int age){
        this.firstName = fName;
        this.lastName = lName;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public String getFirstName() {
        return firstName;
    }

    public Person setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Person setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public int getAge() {
        return this.age;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }
}