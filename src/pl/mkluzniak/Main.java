package pl.mkluzniak;

public class Main {

    public static void main(String[] args) {
        // object = an instance of class that may contain attributes and methods
        // example: (phones, desk, computer, coffee cup)

        Car myCar1 = new Car(); //declaration of car1 in main class
        Car myCar2 = new Car(); //declaration of car2 in main class

        System.out.println(myCar1.make); //every car will be the same, because is use the same car class
        System.out.println(myCar1.model);
        System.out.println();
        System.out.println(myCar2.make);
        System.out.println(myCar2.model);

//        myCar.drive(); //calling for method of class car
//        myCar.brake();

    }
}
