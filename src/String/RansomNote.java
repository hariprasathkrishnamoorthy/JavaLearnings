package String;

class Note {
    public boolean canConstruct(String ransomNote, String magazine) {

        int MAX=256;
        int[] count=new int[MAX];
        char[] str4=ransomNote.toCharArray();
        char[] str3=magazine.toCharArray();

        for (int i=0;i<str3.length;i++)
            count[str3[i]]++;


        for (int i=0;i<str4.length;i++)
        {
            if(count[str4[i]]==0)
                return false;

            count[str4[i]]--;

        }

        return true;

    }
}







public class RansomNote {

    public static void main(String[] args) {

        Note ransome = new Note();
        String ransomenote="a";
        String magazine="b";

        System.out.println(ransome.canConstruct(ransomenote,magazine));

         ransomenote="aa";
         magazine="aab";

        System.out.println(ransome.canConstruct(ransomenote,magazine));

        ransomenote="aa";
        magazine="ab";

        System.out.println(ransome.canConstruct(ransomenote,magazine));

    }
}
