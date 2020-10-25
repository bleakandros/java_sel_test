public class FirstTest {

    public static void main(String[] args) {
        helloTest();
        helloTest( "username");
        System.out.println(helloTest("Значение 1", " Значение 2"));
    }

    /*демо методов*/
    //1 метод без параметров
    public static void helloTest() {
        System.out.println("We are hire! Hello!");

    }
    //2 метод с параметром
    public static void helloTest (String value) {
        System.out.println("We are hire! Hello! " + value);
    }
    //3 метод с возвратом значения
    public static String helloTest (String value1, String value2) {
              return "We are hire! Hello! " + value1 + "," + value2;
    }


}
