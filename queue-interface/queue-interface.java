import java.util.Queue;
import java.util.LinkedList;

class Main {
    public static void main(String[] args) {
        // Creating Ques Using the LinkedList Class
        Queue<Integer> numbers = new LinkedList<>();

        // Offer Elements to the Queue
        numbers.offer(1);
        numbers.offer(2);
        numbers.offer(3);
        System.out.println("Queue : " + numbers);

        // Access Elements of The Queue
        int accessedNumber = numbers.peek();
        System.out.println("Accessed Element : " + accessedNumber);

        // Remove Element from the Queue
        int removedNumber = numbers.poll();
        System.out.println("Removed Element: " + removedNumber);

        System.out.println("Updated Queue: " + numbers);
    }
}