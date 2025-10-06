import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class AllArithmeticOperator{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("ENTER FIRST NUMBER ");
        int first=Integer.parseInt(br.readLine());
        System.out.print("ENTER SECOND NUMBER ");
        int second=Integer.parseInt(br.readLine());
        System.out.println("ADD "+(first+second));
             System.out.println("SUB "+(first-second));
                  System.out.println("DIVISION "+(first/second));
                       System.out.println("MODULE "+(first%second));
                            System.out.println("MULTIPLY "+(first*second));
    }
}