public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Перевозка груза по морю");
    }
}
