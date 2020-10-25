package test.ship;
/*Created by Andrei 10 2020*/

public class StarShip {
    /*высота*/
    public double shipHeight;

    //добавить конструктор для корабля
    public StarShip(double shipHeight) {
        this.shipHeight = shipHeight;
    }
        //возращает высоту корабля
        public double getShipHeight() {
            return this.shipHeight;
        }

}