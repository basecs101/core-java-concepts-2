package inheritance;

import java.util.Arrays;

//Parent clas or Base class or Super class
/*
Inheritance reduces duplicate code  and basic properties of similar classes can be extracted in a common
class that we will call as base class. All similar classes will extend/inherit the base class.
 */
public class Car {
    String brandName;
    String yearOfMan;
    int cc;
    boolean isPetrol;
    Door[] doors;


    public Car(){
        System.out.println(this.getClass().getName() + " called");
    }

    public Car(String brandName, String yearOfMan, int cc, boolean isPetrol) {
        System.out.println(this.getClass().getName() + " called");
        this.brandName = brandName;
        this.yearOfMan = yearOfMan;
        this.cc = cc;
        this.isPetrol = isPetrol;
    }

    public Car(String brandName, String yearOfMan, int cc, boolean isPetrol, Door[] doors) {
        this.brandName = brandName;
        this.yearOfMan = yearOfMan;
        this.cc = cc;
        this.isPetrol = isPetrol;
        this.doors = doors;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getYearOfMan() {
        return yearOfMan;
    }

    public void setYearOfMan(String yearOfMan) {
        this.yearOfMan = yearOfMan;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public boolean isPetrol() {
        return isPetrol;
    }

    public void setPetrol(boolean petrol) {
        isPetrol = petrol;
    }

    public Door[] getDoors() {
        return doors;
    }

    public void setDoors(Door[] doors) {
        this.doors = doors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brandName='" + brandName + '\'' +
                ", yearOfMan='" + yearOfMan + '\'' +
                ", cc=" + cc +
                ", isPetrol=" + isPetrol +
                ", doors=" + Arrays.toString(doors) +
                '}';
    }
}
