import test.ship.StarShip;

public class FirstTest {

    public static void main(String[] args) {
        //создаю экземпляр класса корабля
        StarShip ship = new StarShip( 253.25);
        displayHeight(ship);
    }

    public static void displayHeight(StarShip ship) {
        System.out.println("Высота корабля составляет: " + ship.getShipHeight());
    }


}
