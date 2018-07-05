
package interview;
import java.util.Scanner;

public class Interview {
    
    public static void swapping1(int x, int y){
        System.out.println("x is : " + x);
        System.out.println("y is : " + y);
        
        x = y - x;
        y = y - x;
        x = x + y;
        
        System.out.println("x is : " + x);
        System.out.println("y is : " + y);
    }
    public static void swapping2(int a, int b){
        System.out.println("a is : " + a);
        System.out.println("b is : " + b);
        
        a = a^b;
        b = a^b;
        a = a^b;
        
        System.out.println("a is : " + a);
        System.out.println("b is : " + b);
    }
    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int x = input.nextInt();
       int y = input.nextInt();
       swapping1(x, y);
       int a = input.nextInt();
       int b = input.nextInt();
       swapping2(a, b);
    }
}
