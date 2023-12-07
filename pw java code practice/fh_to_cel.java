import java.util.Scanner;
public class fh_to_cel{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int minf=sc.nextInt();
        int maxf=sc.nextInt();
        int steps=sc.nextInt();
        for(int i=minf; i<=maxf; i=i+steps)
        {
double c =(int) (5.0/9)* (i-32) ;
System.out.println(i+ "\t" + c);
        }
    }
    
}