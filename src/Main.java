import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {





    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        String data = "[{\"PatientName\":\"KELZZZLER, CHARLIE\",\"MRN\":\"HLC00014615201\",\"HchbStage\":\"OBTAIN PAYOR SOURCE VERIFICATION\",\"ArrivedDate\":\"08/10/2023 04:28 PM\",\"QueueAddedTime\":\"08/17/2023 10:00 PM\",\"TransactionStartTime\":\"08/17/2023 10:00 PM\",\"TransactionEndTime\":\"08/18/2023 04:03 PM\",\"WaystarCoverageStatus\":\"Active Coverage\",\"Status\":\"Success\",\"Notes\":\"\",\"UniqueID\":\"KELZZZLER, CHARLIE_HLC00014615201_08/10/2023 04:28 PM\",\"PayorSource\":\"UNITED HEALTHCARE MCR ADVANTAGE FFS\"},{\"PatientName\":\"DUAZZZRTE, BENNY\",\"MRN\":\"HKD00015500901\",\"HchbStage\":\"REVERIFY PAYOR SOURCE INFORMATION\",\"ArrivedDate\":\"08/04/2023 04:30 AM\",\"QueueAddedTime\":\"08/17/2023 10:00 PM\",\"TransactionStartTime\":\"08/17/2023 10:03 PM\",\"TransactionEndTime\":\"08/18/2023 04:07 PM\",\"WaystarCoverageStatus\":\"Active Coverage\",\"Status\":\"Success\",\"Notes\":\"\",\"UniqueID\":\"DUAZZZRTE, BENNY_HKD00015500901_08/04/2023 04:30 AM\",\"PayorSource\":\"UNITED HEALTHCARE MCR ADVANTAGE FFS\"}]";

        Pattern pattern = Pattern.compile("\"MRN\":\"(.*?)\"");
        Matcher matcher = pattern.matcher(data);

        while (matcher.find()) {
            String mrn = matcher.group(1);
            System.out.println(mrn);
        }

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }
    }
}
