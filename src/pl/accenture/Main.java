package pl.accenture;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        SportCar sportCar = new SportCar();
        Vehicle vechSportCar = new SportCar();
        // pierwszy sposób
    //    SportCar sc = (SportCar) vechSportCar;
     //   sc.go();
        // drugi sposób
      //  ((SportCar) vechSportCar).go();

        Vehicle[] vehicles = {vehicle, car, sportCar};
        Boolean czyZdanejklasy = true;
        for (Vehicle ve : vehicles) {
            if (ve instanceof Vehicle) {
                ve.go();
            }  if (ve instanceof Car ) {

                ve.go();
                ve.turbo();
            } if ( ve instanceof  SportCar) {
                ve.turbo();
                ve.go();
            }

            }
        }
    }
