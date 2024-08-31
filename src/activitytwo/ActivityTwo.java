
package activitytwo;

import java.util.Scanner;

public class ActivityTwo {

  
    public static void main(String[] args) {
 
        Scanner s = new Scanner(System.in);
        
        int stacksize;
        boolean condition = false;
        
        System.out.print("Set size of stack: ");
        stacksize = s.nextInt();
        
        ActivityTwoClassFive Stack = new ActivityTwoClassFive(stacksize);
        System.out.println("Current size of stack: " +stacksize);
       
        while(!condition) {
            
            System.out.println("Choose number of what you want to do");
            System.out.println("0.Exit ");
            System.out.println("1.Push an element input");
            System.out.println("2.Pop an element input");
            System.out.println("3.Peek at top stack input");
            System.out.println("4.Peek at bottom stack input");
            System.out.println("5.Loop through stack input");
            System.out.println("6.Remove all duplicates input");
            System.out.println("7.Count all elements");
            System.out.println("8.Add stack to another stack");
            System.out.println("9.Peek other stack");
            System.out.print("Input: ");
            int choice = s.nextInt();
            
            switch (choice) {
                case 0:
                    System.out.println("WELL DONE!");
                    condition = true;   
                    break;
                case 1:
                    System.out.println("Push data to Stack: ");
                    double push = s.nextDouble();
                    Stack.push(push);
                    break;
                case 2:
                    System.out.println("Popped this element: " 
                            + Stack.pop());
                    break;
                case 3:
                    System.out.println("Peeked at the top: " 
                            + Stack.peek());
                    break;
                case 4:
                    System.out.println("Peeked at the bottom: "
                            + "" + Stack.bottomElement());
                    break;
                case 5:
                    Stack.loopStack();
                    break;
                case 6:
                    Stack.removeDuplicates();
                    break;
                case 7:
                    Stack.countElements();
                    break;
                case 8:
                    Stack.stackStack();
                    break;
                case 9:
                    Stack.loopNewStack();
                    break;
                default:
                    System.out.println("ERROR");
                    condition = false;
                    break;
            }
        }
        
    }
    
}