package immutable;

public class Mutable extends Immutable {
    private int realValue;//4 then 8

    public Mutable(int value) {
        super(value);

        realValue = value;
    }

    public int getValue() {
        return realValue;
    }
    public void setValue(int newValue) {
        realValue = newValue;
    }

    public static void main(String[] arg){
        Mutable obj = new Mutable(4);
        Immutable immObj = obj;//upcasting
        System.out.println(immObj.getValue());
        obj.setValue(8);
        System.out.println(immObj.getValue());
    }
}