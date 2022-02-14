public class Main {

    public static void main(String[] args){

        BarkingDog dog = new BarkingDog();
        boolean wakeup = true;
        wakeup = BarkingDog.shouldWakeUp(true, -1);
        System.out.println(wakeup);
    }
}
