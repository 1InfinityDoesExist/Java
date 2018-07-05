
package interview;
import java.util.Scanner;

public class Interview {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input  = new Scanner(System.in);
        int n = input.nextInt();
        int ans = numZeros(n);
        System.out.println(ans);
    }

    public static int numZeros(int n) {
        int count = 0;
        if(n < 0){
            System.out.println("Not Valid bro!!!");
            return 0;
        }
        for(int iter = 5; n/iter > 0; iter *= 5){
            count += n/iter;
        }
        return count;
    }
    
}
