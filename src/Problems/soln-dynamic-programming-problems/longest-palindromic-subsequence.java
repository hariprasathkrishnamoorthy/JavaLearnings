package Problems.soln /**
 @author Farheen Bano
  
 References-
 https://www.geeksforgeeks.org/longest-palindromic-subsequence-dp-12/
 https://leetcode.com/problems/longest-palindromic-subsequence/

 NOTE: Variation of Longest Common Subsequence
*/ 

//------------------------------------------------------------------------------
//Tabulation Approach

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {    
    public int longestPalindromeSubseq(String s) {
        String reverse_s=new StringBuilder(s).reverse().toString();
        return longestCommonSubsequence(s,reverse_s);
    }
    
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        char[] str1=text1.toCharArray();
        char[] str2=text2.toCharArray();
        
        int dp[][]=new int[n+1][m+1];

        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                if(i==0 || j==0)
                    dp[i][j]=0;
                else if(str1[i-1]==str2[j-1])
                    dp[i][j]=1+dp[i-1][j-1];
                
                else 
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
            }
        }
        return dp[n][m];
    }
}
