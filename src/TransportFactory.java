public class TransportFactory {
    public static Transport createTransport(String transportType) {
        return switch (transportType) {
            case "Truck" -> new Truck();
            case "Ship" -> new Ship();
            case "Plane" -> new Plane();
            default -> throw new IllegalArgumentException("Invalid transport type: " + transportType);
        };
    }
    public static void main(String[] args) {
        Transport truck = TransportFactory.createTransport("Truck");
        truck.deliver();

        Transport ship = TransportFactory.createTransport("Ship");
        ship.deliver();

        Transport plane = TransportFactory.createTransport("Plane");
        plane.deliver(); 
    }}
