import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Logical {
    // 4.	Use of logical operators (&&, ||, !)
    public static void main(String[] args) throws IOException {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("ENTER FIRST NUMBER ");
        int first=Integer.parseInt(br.readLine());
        System.out.print("ENTER SECOND NUMBER ");
        int second=Integer.parseInt(br.readLine());
     if (first>10 && second>10)
        System.out.println("BOTH CONDITION ARE TRUE COMPULSARY...");
         if (first>10 || second>10)
         System.out.println("IF  ANY CONDTION IS  TRUE");
         System.out.println(!(first>second));// IF CONDITION IS TRUE THEN OUTPUT FALSE..
  

        
    }
}
