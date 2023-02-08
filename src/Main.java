import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // pojmenování proměnných
        String nameAndSurname;
        LocalDate dateOfBirth;
        int numberOfNegotiateContract;
        double soldedWeight;
        String town;
        String licensePlate;
        double consumption;
        String ipAdress;

        soldedWeight = 2000;
        numberOfNegotiateContract = 2;

        double averageWeight = soldedWeight/numberOfNegotiateContract;

        System.out.println("Average weight per one contract is 1000 ton.");
    }
}