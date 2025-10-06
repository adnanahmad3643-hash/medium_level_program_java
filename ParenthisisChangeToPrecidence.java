public class ParenthisisChangeToPrecidence {
    // 20.	Use of parentheses to change precedence.
    public static void main(String[] args) {
        int wp=10+2*20/5;
        /*
         step 1: 2*20=40
         step 2: 40/5=8
         step 3: 8+10=18
         */
        System.out.println(wp);
        //  WITH PARANTHESIS...
        int value=(10+2)*20/5;
        /*
         step 1: 10+2=12
         step 2: 12*20=240
         step 3: 240/5=48
         */
        System.out.println(value);
    }
}
