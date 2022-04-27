import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner myobject = new Scanner(System.in);
        System.out.println("Enter username : ");

        String username = myobject.nextLine();
        System.out.println("Username is : " + username);
    }
}