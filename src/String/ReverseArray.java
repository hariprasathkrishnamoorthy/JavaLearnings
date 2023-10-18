package String;


class ReverseCharArray {
    public void reverseString(char[] s)
    {
        int length=s.length ;
        char temp=' ';
        int i=0 ;
        int j=length-1;

        if(s.length==0)
        {
            return ;
        }

        if(s.length==1)
        {
            return;
        }

        while(i<j)
        {
            temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;

        }


    }
}
public class ReverseArray {

    public static void main(String[] args) {

        ReverseCharArray rev = new ReverseCharArray();
        char[] a={'h','e','l','l','o'};
        rev.reverseString(a);
        System.out.println(a);

        a= new char[]{'h'};
        rev.reverseString(a);
        System.out.println(a);

    }
}
