import java.util.Scanner;

public class inverse_of_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
    int pos=1;
    int sum=0;
    while (n>0) {
 
        int rem=n%10;
        sum= sum+pos*(int)Math.pow(10, rem-1); 
         pos++;
         n=n/10;

    }
    System.out.println(sum);

        
    }
}
