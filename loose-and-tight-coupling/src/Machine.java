//This machine class is implementing features of IMachine Interface
//This class is only responsible for methods of IMachine Interface.
public class Machine implements IMachine {
    @Override
    public void powerOn() {
        System.out.printf("Powering on Machine!!!");
    }

    @Override
    public void powerOff() {
        System.out.println("Powering Off Machine!!!");
    }
    //This method is added Machine class.
    public void reboot() {
        System.out.println("Rebooting Machine!!!");
    }
}