public class Main {
    static void main(String[] args) {
        print("hello");

        Car hyundai = new Car(1.2F, "Blue" );
        hyundai.goCar();
        print("my car color =" + " " + hyundai.color);
    }

    private static void print(String info) {
        System.out.printf(info);
    }
}