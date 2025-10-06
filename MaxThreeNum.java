import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MaxThreeNum {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("ENTER FIRST NUMBER ");
        int first=Integer.parseInt(br.readLine());
        System.out.println("ENTER SECOND NUMBER ");
        int second=Integer.parseInt(br.readLine());
        System.out.println("ENTER THIRD NUMBER ");
        int third=Integer.parseInt(br.readLine());
        int result=(first>second)? 
        ((first>third)? first:third):((second>third)? second:third);
        System.out.println("MAXIMUM NUMBER IS = "+result);
    }
}
