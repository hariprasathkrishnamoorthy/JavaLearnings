package String;

//Check if Numbers Are Ascending in a Sentence
//https://leetcode.com/problems/check-if-numbers-are-ascending-in-a-sentence/description/



public class NumberAscCheck {

    public boolean areNumbersAscending(String s)
    {
        int prev =0;
        String[] sent = s.split(" ");

        for(String i: sent)
        {
            if(Character.isDigit(i.charAt(0)) )
            {
                i=i.replaceAll("[^0-9]", "");
                int num = Integer.parseInt(i);
                if(num <= prev)
                    return false;
                else
                    prev = num;
            }
        }
        return true;
    }




    public static void main(String[] args)
    {

        NumberAscCheck pb = new NumberAscCheck();
        System.out.println( pb.areNumbersAscending("1 box has 3 blue 4 red 6 green and 12 yellow marbles"));
        System.out.println( pb.areNumbersAscending("sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s"));
        System.out.println( pb.areNumbersAscending("sunset is at 7 49 pm overnight lows will be in the low T50T and 60 s"));
    }




}




