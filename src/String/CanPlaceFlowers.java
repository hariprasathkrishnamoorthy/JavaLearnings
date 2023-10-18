package String;

class Canplaceflowerbed {
    public boolean canPlace(int[] flowerbed, int n) {

        if(n==0)
            return true;

        if(flowerbed.length==1)
        {
            if( flowerbed[0]==0)
                return true;

            return false;

        }


        if(flowerbed[0]==0 && flowerbed[1]==0)
        {
            flowerbed[0]=1;
            n--;

        }

        for(int i=1 ; i<flowerbed.length-1; i++) {
            if(flowerbed[i-1]==0 && flowerbed[i+1]==0 && flowerbed[i]!=1)
            {
                flowerbed[i] = 1;
                n--;
            }

        }

        if(flowerbed[flowerbed.length-1]==0 && flowerbed[flowerbed.length-2]==0)
        {
            flowerbed[flowerbed.length-1]=1;
            n--;

        }



        if(n<=0)
            return true;


        return false;
    }
}

public class CanPlaceFlowers
{

    public static void main(String[] args) {

        Canplaceflowerbed sol = new Canplaceflowerbed();

        int[] a ={0,0,1,0,0};

        System.out.println(sol.canPlace(a,1));

    }




}
