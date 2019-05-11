
/**
 * Write a description of class MiniArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MiniArray
{
    private int [][] miniTicTac; 
    
    public MiniArray()
    {
      miniTicTac = new int [3][3];
      
      for (int row = 0; row < miniTicTac.length; row++)
        for(int col = 0; col < miniTicTac[0].length; col++)
            miniTicTac[row][col] = -1;
    }
    
    //x and y are the INDEXES of the cell the player has moved
    //player is 1 if "X" has moved, and 0 is "O" has moved 
    public void doMove(int x, int y, int player)
    {
        miniTicTac[x][y] = player;
    }
    
    public int checkWon()
    {
        
        
        
    }
    
    private int checkRow()
    {
        int x = 0;
        for(int i =0; i<3; i++)
        {
             x = miniTicTac[i][0] + miniTicTac[i][1] + miniTicTac[i][2];
             if(x == 0 || x == 3)
                return x;
            }
        
        return -1;
    }
    
    private int checkCol()
    {
        int x = 0;
        for(int i =0; i<3; i++)
        {
             x = miniTicTac[0][i] + miniTicTac[1][i] + miniTicTac[2][i];
             if(x == 0 || x == 3)
                return x;
            }
        
        return -1;  
        
        
    }
    
    
}
