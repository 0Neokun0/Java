import java.util.concurrent.ArrayBlockingQueue;

class main {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> animals = new ArrayBlockingQueue<>(5);

        try {
            // Add Elements To Animals
            animals.put("Dog");
            animals.put("Cat");
            System.out.println("Array Blocking Queue : " + animals);
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}