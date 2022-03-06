import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        // Create An ArrayList
        ArrayList<String> languages = new ArrayList<>();

        // Insert Element To The ArrayList
        languages.add("Java");
        languages.add("Python");

        System.out.println("ArrayList : " + languages);

        // Insert Element At Position 0
        languages.add(0, "C");
        System.out.println("Updated ArrayList : " + languages);
    }
}