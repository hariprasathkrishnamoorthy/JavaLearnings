package String;

public class Atoi {

    public static void main(String[] args) {

        Solutionatoi s = new Solutionatoi();
       int res= s.myAtoi("9223372036854775808");
        System.out.println(res);

    }


}


class Solutionatoi {
    public int myAtoi(String s)
    {
        s = s.trim();

        // Step 2: Determine the sign
        if (s.isEmpty()) {
            return 0; // If the string is empty, return 0
        }
        int sign = 1;
        int i = 0;
        if (s.charAt(0) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(0) == '+') {
            i++;
        }

        // Step 3: Read and convert the digits
        long result = 0; // Using long to handle potential overflow
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');
            i++;
        }
        result=result;

        // Step 4: Clamp the result within the 32-bit range
        if(result<Integer.MIN_VALUE)
        {
            result =Integer.MIN_VALUE;
        }
        if(result>Integer.MAX_VALUE)
        {
            result =Integer.MAX_VALUE;
        }


        // result = Math.min(Math.max(result * sign, Integer.MIN_VALUE), Integer.MAX_VALUE);

        return (int) result;

    }
}