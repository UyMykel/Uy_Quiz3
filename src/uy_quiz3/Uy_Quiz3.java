
package uy_quiz3;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class Uy_Quiz3 {
    
    private Uy_Quiz3 next;
    private int data;
    private int priority;
    static int MAX = 10;
    
    private class priorityqueuearray {
    
    int priority;
    int data;
    }
    
    private priorityqueuearray front;
    
    
    
    
    private void insertion (int item, int priority) {
       Uy_Quiz3 node = new Uy_Quiz3();
       node.data = item;
       node.priority = priority;
       node.next = null;
       
       if (front==null || priority <= front.priority) {
          
          
       
       }
        
        
        
        
            
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
