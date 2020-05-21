package lesson2;

public class User<I extends Number> {

    I id;

    public User(I id) {
        this.id = id;
    }

    public <T extends Number> void print(T s) {
        System.out.println(s);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                '}';
    }
}
