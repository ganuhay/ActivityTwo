
package activitytwo;

public class ActivityTwoClassTwo extends ActivityTwoClassOne  {
   public ActivityTwoClassTwo (int Size){
        super (Size);
    } 
    public void countElements(){
        if (!isEmpty()) {
            int count = top + 1;
            System.out.println("Elements in stack: " + count);
        }
        
        else {
            System.out.println("Stack is empty!");  
        }
    }
    
}
