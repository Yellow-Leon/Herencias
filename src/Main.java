import org.ies.animal.Perro;
import org.ies.forms.Circle;
import org.ies.vehicles.Car;
import org.ies.vehicles.Truck;
import org.ies.vehicles.Vehicle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car = new Car(12 , "J1J0", 3 , "10");
        car.move();
    }
}