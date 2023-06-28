package inheritance.example;

import java.util.Arrays;

//extends/inheritance -> Is A Relationship -> HondaCity Is A Car
//composition -> Has A Relationship -> HondaCity Has A Wheel
//Child class or derived class or Sub class
public class HondaCity extends Car{
//    String brandName;
//    String yearOfMan;
//    int cc;
//    boolean isPetrol;
    boolean hasSunRoof;
    boolean isAutoMatic;

    Wheel[] wheels;


    public HondaCity(boolean hasSunRoof, boolean isAutoMatic) {
        super("Honda", "2023",1300,true);
        System.out.println(this.getClass().getName() + " called");
        this.hasSunRoof = hasSunRoof;
        this.isAutoMatic = isAutoMatic;
    }

    public HondaCity(String brandName, String yearOfMan, int cc,
                     boolean isPetrol, boolean hasSunRoof,
                     boolean isAutoMatic, Wheel[] wheels) {
        super(brandName, yearOfMan, cc, isPetrol);
        this.hasSunRoof = hasSunRoof;
        this.isAutoMatic = isAutoMatic;
        this.wheels = wheels;
    }

    public boolean isHasSunRoof() {
        return hasSunRoof;
    }

    public void setHasSunRoof(boolean hasSunRoof) {
        this.hasSunRoof = hasSunRoof;
    }

    public boolean isAutoMatic() {
        return isAutoMatic;
    }

    public void setAutoMatic(boolean autoMatic) {
        isAutoMatic = autoMatic;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    //toString represents object, this means it prints object's fields
    //if toString method is not overridden then it will print ClassName@HashCode


    @Override
    public String toString() {
        return "HondaCity{" +
                "hasSunRoof=" + hasSunRoof +
                ", isAutoMatic=" + isAutoMatic +
                ", wheels=" + Arrays.toString(wheels) +
                "} " + super.toString();
    }
}
