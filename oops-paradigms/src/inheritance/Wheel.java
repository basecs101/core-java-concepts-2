package inheritance;

public class Wheel {
    int size;
    String brandName;
    boolean isAlloyWheel;

    @Override
    public String toString() {
        return "Wheel{" +
                "size=" + size +
                ", brandName='" + brandName + '\'' +
                ", isAlloyWheel=" + isAlloyWheel +
                '}';
    }
}
