import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Relational {
    // 3.	Use of relational operators ==,!=,<,>,<=,>=..;
    public static void main(String[] args)throws IOException {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("ENTER FIRST NUMBER ");
        int first=Integer.parseInt(br.readLine());
        System.out.print("ENTER SECOND NUMBER ");
        int second=Integer.parseInt(br.readLine());
        if (first==second)
        System.out.println("BOTH ARE EQUAL ");
        if (first!=second)
        System.out.println("BOTH ARE DIFFRENT ");
          if (first<second)
          System.out.println("FIRST IS LESSER THAN SECOND");
            if (first>second)
            System.out.println("FIRST IS GRETER THEN SECOND");
              if (first<=second)
              System.out.println("FIRST IS LESSER THAN OR EQAUL SECOND ");
              if (first>=second)
              System.out.println("FIRST IS GREATER THAN OR EQAUL SECOND ");
    }
}
