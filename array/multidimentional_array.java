class Main 
{
    public static void main(String[] args) {
        
        // Creating a 2d Array
        int[][] array = 
        {
            {1, 2, 3},
            {4, 5, 6, 9},
            {7},
        };

        // Calculater The Length Of Each Row
        System.out.println("Length of row 1 : " + array[0].length);
        System.out.println("Length of row 2 : " + array[1].length);
        System.out.println("Length of row 3 : " + array[2].length);
    }
}