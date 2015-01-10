package imooc.java.learning;

/**
 * Created by fhk on 2015-01-10.
 */
public class Car extends Tool {

    public Car() {
        super();
    }
    public Car(String Name, String Way, int Number) {
        this.Name = Name;
        this.Way = Way;
        this.Number = Number;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Name='" + Name + '\'' +
                ", Way='" + Way + '\'' +
                ", Number=" + Number +
                '}';
    }
}
