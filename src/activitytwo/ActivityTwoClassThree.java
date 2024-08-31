
package activitytwo;

import java.util.HashSet;
import java.util.Set;

public class ActivityTwoClassThree extends ActivityTwoClassTwo {
     public ActivityTwoClassThree(int Size){
        super(Size);
    }
    public void removeDuplicates(){
        Set <Double> unique = new HashSet<>();
        int newTop = -1;
        boolean hasDuplicate = false;
        
        for (int i = 0; i <= top; i++){
            if (unique.contains(Stacks[i])) {
            System.out.println("DUPLICATE DETECTED: "+Stacks[i]);
            }else{
             unique.add(Stacks[i]);
            Stacks[++newTop] = Stacks[i];
            }
        }
            top = newTop;
        if (hasDuplicate == false){
            System.out.println("DUPLICATE REMOVED!");
        }
    }
}

