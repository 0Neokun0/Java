package java.constuctor;
class Main 
{
    private String name;

    // Constructor
    Main()
    {
        System.out.println("Constructor Called : ");
        name = "0Neokun0";
    }

    public static void main (String[] args)
    {
        // Constructor is Invoked While
        // Creating an object of the Main Class
        Main obj = new Main();
        System.out.println("The name is " + obj.name);
    }
}