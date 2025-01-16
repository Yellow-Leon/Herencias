import org.ies.animal.Perro;
import org.ies.vehicles.Car;
import org.ies.vehicles.Truck;
import org.ies.vehicles.Vehicle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car car = new Car(5, "J1J0", 4, "101");
        Truck truck = new Truck(0,"0P3NJ41M3", 8);

        truck.move();
        truck.showInfo();
        truck.move();
        truck.showInfo();
    }
}