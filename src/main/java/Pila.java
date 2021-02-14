import java.util.Vector;

public class Pila 
{
    private Vector elementi = new Vector();
    
    public void push(Object b)
    {
        elementi.addElement(b);
    }
    
    public Object pop()
    {
        int size = elementi.size();
        Object b = null;
        
        if(size > 0)
        {
            b = elementi.elementAt(size - 1);
            elementi.removeElementAt(size - 1);
        }
        return b;
    }
    
    public Object top()
    {
        int size = elementi.size();
        Object b = null;
        
         if(size > 0)
        {
            b = elementi.elementAt(size - 1);
        }
         return b;
    }
    
    public boolean vuota()
    {
        if(elementi.size() > 0)
            return false;
        else
            return true;
    }
    
    public int size()
    {
        return elementi.size();
    }
}

