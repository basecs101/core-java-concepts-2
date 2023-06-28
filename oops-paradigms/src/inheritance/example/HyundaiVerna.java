package inheritance.example;

//extends -> Is A Relationship

//Child class or derived class or Sub class
public class HyundaiVerna extends Car{
//    String brandName;
//    String yearOfMan;
//    int cc;
//    boolean isPetrol;
    boolean hasSunRoof;
    boolean isAutoMatic;

    public HyundaiVerna(boolean hasSunRoof, boolean isAutoMatic) {
        super();
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

    @Override
    public String toString() {
        return "HyundaiVerna{" +
                super.toString() +
                "hasSunRoof=" + hasSunRoof +
                ", isAutoMatic=" + isAutoMatic +
                '}';
    }
}
