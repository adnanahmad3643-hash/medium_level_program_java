public class CompundOperator {
    // 2.	Use of compound assignment operators (+=, -=, *=, /=)
    public static void main(String[] args) {
        int a=10;
        System.out.println("USE += "+(a+=10));// a= a+10=20;
        System.out.println("USE -= "+(a-=10));// a=a-10=10;
        System.out.println("USE *= "+(a*=10));// a=a*10=100;
         System.out.println("USE /= "+(a/=10));// a=a/10=10;
          System.out.println("USE %= "+(a%=10));// a=a%10=0;

    }
}
