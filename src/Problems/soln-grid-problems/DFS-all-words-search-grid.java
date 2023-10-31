package Problems.soln

/**
 @author Farheen Bano
 
 The "adjacent" cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.
 
 Reference-
 https://leetcode.com/problems/word-search-ii/ 
*/

class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        List<String> list=new ArrayList<>();
        for(String w:words){
            if(exist(board,w)){
                list.add(w);
            }
        }
        return list;
    }
    
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                
                    if(dfs(i,j,board,word,0)){
                        return true;
                    }
                }
                
            }
        }
        return false;
    }
    

    public boolean dfs( int i, int j, char[][] board, String word, int k) {
        if (k == word.length()) 
            return true;
        
        if (i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j] == '*' || board[i][j] != word.charAt(k)) 
            return false;
        
        board[i][j] = '*';
        
        boolean found = dfs(i-1, j, board, word, k+1) || 
                        dfs(i+1, j, board, word, k+1) || 
                        dfs(i, j-1, board, word, k+1) || 
                        dfs(i, j+1, board, word, k+1);
        
        board[i][j] = word.charAt(k);
        return found;
    }
}
