package mutable;

public class Address {
    int lineNum;
    String streetName;
    String city;
    long pinCode;

    public Address(int lineNum, String streetName, String city, long pinCode) {
        this.lineNum = lineNum;
        this.streetName = streetName;
        this.city = city;
        this.pinCode = pinCode;
    }

    public int getLineNum() {
        return lineNum;
    }

    public void setLineNum(int lineNum) {
        this.lineNum = lineNum;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getPinCode() {
        return pinCode;
    }

    public void setPinCode(long pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "lineNum=" + lineNum +
                ", streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }
}
