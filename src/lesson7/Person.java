package lesson7;

public class Person extends A{
    private String name;
    @ValidateInt(min = 0, max = 100, defaultValue = 25)
    private int age;
    private int anotherInt;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        Validator.validateInt(this.getClass(), this);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void methodToTestArray(String[] mas) {
        for (String ma : mas) {
            System.out.println(ma);
        }
    }

    public void methodToTestVarArgs(String m, String... mas) {
        for (String ma : mas) {
            System.out.println(ma);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
