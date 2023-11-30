

public class fibo{
    public static void main(String[] args) {
        int divident=60;
        int diviser=36;
        while(divident%diviser!=0){
         int rem= divident%diviser;
         divident=diviser;
         diviser=rem;

        }
          System.out.println(diviser);        
    }

}