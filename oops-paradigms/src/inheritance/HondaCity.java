package inheritance;

//Child class or derived class or Sub class
public class HondaCity extends Car{
//    String brandName;
//    String yearOfMan;
//    int cc;
//    boolean isPetrol;
    boolean hasSunRoof;
    boolean isAutoMatic;


    public HondaCity(boolean hasSunRoof, boolean isAutoMatic) {
        super("Honda", "2023",1300,true);
        System.out.println(this.getClass().getName() + " called");
        this.hasSunRoof = hasSunRoof;
        this.isAutoMatic = isAutoMatic;
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


    //toString represents object, this means it prints object's fields
    //if toString method is not overridden then it will print ClassName@HashCode
    @Override
    public String toString() {
        return "HondaCity{" +
                super.toString() +
                "hasSunRoof=" + hasSunRoof +
                ", isAutoMatic=" + isAutoMatic +
                '}';
    }
}
