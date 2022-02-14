public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes (int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
        long MegaBytesAndKiloBytes = kiloBytes / 1024;
            System.out.println(kiloBytes + " KB = "
                    + MegaBytesAndKiloBytes + " MB "
                    + "and " + kiloBytes % 1024 + " KB" );
        }
    }
}
