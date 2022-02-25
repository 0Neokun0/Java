class Main {

    // Create a Method
    public int addNumbers ( int a, int b ) 
    {
        int sum = a + b;
        // Return Value
        return sum;
    }

    public static void main (String[] args)
    {
        int num1 = 10;
        int num2 = 10;

        // Create An Object of Main
        Main obj = new Main();
        // Calling Method
        int result = obj.addNumbers ( num1, num2 );
        System.out.println( "Sum is : " + result);
    }
}