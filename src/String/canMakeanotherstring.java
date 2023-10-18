package String;

public class canMakeanotherstring {

        public static boolean canConvert(String s, String t) {
            int sLength = s.length();
            int tLength = t.length();

            if (sLength != tLength) {
                return false; // If lengths are different, it's not possible.
            }

            int[] sCount = new int[26]; // Count of each lowercase character in s.
            int questionMarksInS = 0; // Count of '?' characters in s.

            for (int i = 0; i < sLength; i++)
            {
                sCount[t.toCharArray()[i] - 'a']++;
            }


            for (int i = 0; i < sLength; i++)
            {
                if (s.toCharArray()[i] != '?')
                    sCount[s.toCharArray()[i] - 'a']--;
                else
                    questionMarksInS++;
            }

            for (int i = 0; i < 26; i++)
            {
                if (sCount[i] < 0)
                {
                    return false;
                }
            }

            return true;
    }

    public static void main(String[] args) {
        String s = "???n";
        String t = "aman";

        if (canConvert(s, t)) {
            System.out.println("You can convert 's' into 't'.");
        } else {
            System.out.println("You cannot convert 's' into 't'.");
        }
    }
}
