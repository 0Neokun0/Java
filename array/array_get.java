import java.util.ArrayList;
class Main {
    public static void main(String[] args) {

        // Create An ArrayList
        ArrayList<String> languages = new ArrayList<>();

        // Insert Element To The ArrayList
        languages.add("JavaScript");
        languages.add("Java");
        languages.add("Python");
        System.out.println("Programming Languages: " + languages);

        // Access Element At Index 1
        String element = languages.get(1);
        System.out.println("Element at Index 1 : " + element);
    }
}