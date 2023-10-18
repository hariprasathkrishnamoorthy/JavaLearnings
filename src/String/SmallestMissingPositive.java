package String;

import java.util.Arrays;

class MissingPositive {
    public int firstMissingPositive(int[] nums)
    {

        Arrays.sort(nums);
        int ans = 1;
        for (int num : nums) {
            if (num == ans)
                ans++;

        }
        return ans;




    }
}

public class SmallestMissingPositive {

    public static void main(String[] args) {

        MissingPositive  mp = new MissingPositive();
        int[] num = {8,7,2,3,4,8,5};
        System.out.println(mp.firstMissingPositive(num));


    }
}
