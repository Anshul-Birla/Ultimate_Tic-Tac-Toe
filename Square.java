import javafx.scene.Node;
import java.util.*;
/**
 * Write a description of class Square here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Square
{
    private SquareGraphics mySquare;
    private int input;
    
    /**
     * Constructor for objects of class Square
     */
    public Square()
    {
        mySquare = new SquareGraphics(this);
        input = 1;
    }
    
    
    public void clicked()
    {
        //call PlayerStatus class method to switch players
    }
    
    public Node getGraphics()
    {
        return mySquare;
    }
    
    public int getInput()
    {
        return input;
    }
    
    public void setInput(int n)
    {
        input = n;
    }
}
