import java.util.ArrayList;

class Main {
    public static void main(String[] args) {

        // Create An ArrayList
        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("JavaScript");
        languages.add("Python");
        System.out.println("Programming Languages : " + languages);

        // Remove All ELements
        languages.clear();
        System.out.println("ArrayList After clear(): " + languages);
    }
}