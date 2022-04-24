class Main {
    public static void main(String[] args) {

        // Create 3 Strings
        String first = "java programming";
        String second = "java programming";
        String third = "python programming";

        // Compare First and Second Strings
        boolean result1 = first.equals(second);
        System.out.println("String first and second are equal : " + result1);

        // Compare first and thrid strings
        boolean result2 = first.equals(third);
        System.out.println("Strings first and thrid are equal : " + result2);

        // Compare second and thrid strings
        boolean result3 = second.equals(third);
        System.out.println("Strings second and thrid are equal : " + result3);
    }
}