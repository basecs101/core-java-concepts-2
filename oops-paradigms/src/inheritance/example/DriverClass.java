package inheritance.example;

public class DriverClass {
    public static void main(String[] args) {


        HondaCity hondaCity = new HondaCity(true,true);

        Wheel wheel1 = new Wheel();
        Wheel wheel2 = new Wheel();
        Wheel wheel3 = new Wheel();
        Wheel wheel4 = new Wheel();

        Wheel[] wheels = new Wheel[]{wheel1,wheel2,wheel3,wheel4};

        HondaCity hondaCity1 = new HondaCity("Honda",
                "2023",
                1500,
                false,
                true,
                true,
                wheels
                );

        System.out.println(hondaCity.toString());
        System.out.println(hondaCity1.toString());

        HyundaiVerna hyundaiVerna = new HyundaiVerna(false, true);

        System.out.println(hyundaiVerna.toString());

        SkodaSlavia skodaSlavia = new SkodaSlavia(6);


    }
}
