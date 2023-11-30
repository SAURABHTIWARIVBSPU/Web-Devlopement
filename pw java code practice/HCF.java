public class HCF {
    public static void main(String[] args) {
   int divident=90;
   int diviser=45;
for(;divident%diviser!=0;){
    int remainder=divident%diviser;
    divident=diviser;
    diviser=remainder;
   }
   System.out.println(diviser);
}
}