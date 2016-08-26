
/**
 * Write a description of class SimpleCalc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SimpleCalc
{
    // instance variables - replace the example below with your own
    private int n1;
    private int n2;
    
    public SimpleCalc(int x, int y)
    {
        n1 = x;
        n2 = y;
    }
    public int add() {
        return x + y;
    }
    public int subtract() {
        return x - y;
    }
    public int mult() {
        return x * y;
    }
    public int div() {
        return x / y;
    }
    public boolean isGreater() {
        if(x > y) return true;
        else return false;
    }
}
