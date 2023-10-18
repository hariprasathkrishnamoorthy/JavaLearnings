package String;

//Check if All A's Appears Before All B's
//https://leetcode.com/problems/check-if-all-as-appears-before-all-bs/description/


public class BeforeB {

    public boolean checkString(String s)
    {
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)=='b'&&s.charAt(i+1)=='a')
                return false;
        }
        return true;


    }


    public static void main(String[] args)
    {

        BeforeB pb = new BeforeB();
        System.out.println( pb.checkString("aabb"));
        System.out.println( pb.checkString("aabbaa"));
        System.out.println( pb.checkString("aaba"));

    }



}
