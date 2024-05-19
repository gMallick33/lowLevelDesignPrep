public class VehicleFactory {
    static Vehicle getVehicleObject(String typeOfVehicle) {
        if("BIKE".equals(typeOfVehicle)) {
            return new Bike();
        }
        else return new NullObject();
    }
}
