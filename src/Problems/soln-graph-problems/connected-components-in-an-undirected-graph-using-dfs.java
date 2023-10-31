package Problems.soln /**
 @author Farheen Bano
  
 Reference-
 https://www.geeksforgeeks.org/connected-components-in-an-undirected-graph/
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    static boolean[] visited;
    static ArrayList<Integer>[] adj_list;

    public static int makeConnected(int n, int[][] connections) {
        adj_list=new ArrayList[n];
        visited=new boolean[n];
        
        //form adjacency list for undirected graph        
        for(int i=0;i<n;i++)
            adj_list[i]=new ArrayList<>();        
        for(int edge[]:connections){
            adj_list[edge[0]].add(edge[1]);
            adj_list[edge[1]].add(edge[0]);
        }
        
        int count=0;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                count++;
                dfs(i);
            }
        }
        return count;
    }    
    
    public static void dfs(int node){
        visited[node]=true;
        for(int adj_node:adj_list[node]){
            if(!visited[adj_node])
                dfs(adj_node);
        }
    }

    public static void main(String args[] ) throws Exception {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int e=sc.nextInt();
       int[][] connections=new int[e][2];
       for(int i=0;i<e;i++){
           connections[i][0]=sc.nextInt();
           connections[i][1]=sc.nextInt();
       } 
        System.out.println(makeConnected(n,connections));

    }
}
