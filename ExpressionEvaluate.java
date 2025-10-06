class ExpressionEvaluate{
    // 16.	Evaluate (a + b) * c / d type expression
    public static void main(String[] args) {
        int a=10,b=30,c=20,d=5;
        int result=(a+b)*c/d;
        // step 1: a+b=40
        // step 2: c/d= 4
        // step 3: 40*4=160;

        System.out.println(result);

    }
}