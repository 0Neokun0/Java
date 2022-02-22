class Main 
{
    public static void main(String[] args) {
        
        // For Loop
        for ( int i = 1; i <= 10; ++i )
        {

            // If Value Of i is between 4 and 9
            // Continue Is Executed
            if ( i > 4 && i < 9)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}