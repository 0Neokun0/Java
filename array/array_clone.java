import java.util.ArrayList;

class Main {
    public static void main(String[] args){

        // Create an arraylist
        ArrayList<Integer> prime = new ArrayList<>();
        prime.add(2);
        prime.add(3);
        prime.add(5);
        System.out.println("Prime Number: " + prime);

        // Print the return value of clone()
        System.out.println("Return value of clone(): " + prime.clone());
    }
}