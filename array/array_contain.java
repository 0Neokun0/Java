import java.util.ArrayList;

class Main {
    public static void main(String[] args) {

        // Create an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // Insert Element To The ArrayList
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("Number ArrayList : " + numbers);

        // Checks If 3 Is Present In The ArrayList
        System.out.print("Is 3 Present In The ArrayList : ");
        System.out.println(numbers.contains(3));

        // Checks If 1 is Present In The ArrayList
        System.out.print("Is 1 Present in the arraylist: ");
        System.out.println(numbers.contains(1));
    }
}