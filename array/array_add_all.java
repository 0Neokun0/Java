import java.util.ArrayList;

class Main {
    public static void main(String[] args) {

        // Create An ArrayList
        ArrayList<Integer> primeNumbers = new ArrayList<>();

        // Add Elements To ArrayList
        primeNumbers.add(3);
        primeNumbers.add(4);
        primeNumbers.add(5);
        System.out.println("Numbers : " + primeNumbers);

        // Create Another ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);

        // Add All Elements From PrimeNumbers To Numbers
        numbers.addAll(primeNumbers);
        System.out.println("Numbers: " + numbers);
    }
}