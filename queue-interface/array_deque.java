import java.util.Deque;
import java.util.ArrayDeque;

class Main {

    public static void main(String[] args) {
        // Creating Deque Using The ArrayDeque Class
        Deque<Integer> numbers = new ArrayDeque<>();

        // Add Elements To The Deque
        numbers.offer(1);
        numbers.offerLast(2);
        numbers.offerFirst(3);
        System.out.println("Deque : " + numbers);

        // Access Elements Of The Deque
        int firstElement = numbers.peekFirst();
        System.out.println("First Element : " + firstElement);

        int lastElement = numbers.peekLast();
        System.out.println("Last Element : " + lastElement);

        // Remove Elements From The Deque
        int removedNumber1 = numbers.pollFirst();
        System.out.println("Removed First ELement: " + removedNumber1);

        int removedNumber2 = numbers.pollLast();
        System.out.println("Removed Last Element : " + removedNumber2);

        System.out.println("Updated Deque: " + numbers);
    }
}