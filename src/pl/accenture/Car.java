package pl.accenture;



public class Car extends Vehicle {
    public Car() {
    }

    @Override
    void go() {

        System.out.println("Metoda z klasy Car ");
    }
    void horn(){
        System.out.println("Beep beep");
    }
}
