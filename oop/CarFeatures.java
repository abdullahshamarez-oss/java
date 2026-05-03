class CarFeatures {

    String carModel;
    String carColor;
    int carNo;
    String carBrand;
    String carType;

    // Behavior 1
    public void displayCar() {
        System.out.println("===== Car Features =====");
        System.out.println("Car Model: " + carModel);
        System.out.println("Car Color: " + carColor);
        System.out.println("Car Number: " + carNo);
        System.out.println("Car Brand: " + carBrand);
        System.out.println("Category: " + carType);
        System.out.println();
    }

    // Behavior 2
    public void startCar() {
        System.out.println(carBrand + " car is starting...");
    }

    // Behavior 3
    public void stopCar() {
        System.out.println(carBrand + " car is stopping...");
        System.out.println();
    }

    public static void main(String[] args) {

        // Object 1
        CarFeatures car1 = new CarFeatures();
        car1.carModel = "C-Class";
        car1.carColor = "Black";
        car1.carNo = 34343;
        car1.carBrand = "Mercedes";
        car1.carType = "Hybrid";

        // Object 2
        CarFeatures car2 = new CarFeatures();
        car2.carModel = "Civic";
        car2.carColor = "White";
        car2.carNo = 56789;
        car2.carBrand = "Honda";
        car2.carType = "Petrol";

        // Object 3
        CarFeatures car3 = new CarFeatures();
        car3.carModel = "Corolla";
        car3.carColor = "Silver";
        car3.carNo = 11223;
        car3.carBrand = "Toyota";
        car3.carType = "Diesel";

        // Using behaviors
        car1.displayCar();
        car1.startCar();
        car1.stopCar();

        car2.displayCar();
        car2.startCar();
        car2.stopCar();

        car3.displayCar();
        car3.startCar();
        car3.stopCar();
    }
}