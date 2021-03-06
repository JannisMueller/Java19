import ovn.Vehicle;

import java.util.Locale;


public class OOPExample {

    public static void main(String[] args) {
        //https://sv.wikipedia.org/wiki/ISO_639
        //https://sv.wikipedia.org/wiki/ISO_3166
        Locale.setDefault(new Locale("sv", "SE"));
        //Locale.setDefault(new Locale("en", "US"));

        Vehicle v1 = new Vehicle("Ford Galaxy", 7, 50, 20.0f);
        Vehicle v2 = new Vehicle("Subaru WRX", 4, 40, 15.0f, true);
        Vehicle v3 = new Vehicle("Subaru WRX", 4, 40, 15.0f, true);

        System.out.format("Mpg: %.1f", v3.getMpg());


//
//        polymorphism.Circle c1 = new polymorphism.Circle(1.0);
//
//        System.out.println(c1.isFilled());
//        System.out.println(c1.getRadius());

//
//
//
//
//        Rectangle rectangle = new Rectangle(10,10,"Name");
//
//        Rectangle rectangle1 = new Rectangle();
//
//        rectangle1.setHeight(20);
//
//        System.out.println(rectangle.getHeight());
//        System.out.println(rectangle1.getHeight());
//


    }
}
