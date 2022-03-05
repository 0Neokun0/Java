class Main {
    public static void main(String[] args) {
        String str1 = "+a-+b";

        // Replace "+" with "#" using replaceAll()
        // Need To Escape "+"
        System.out.println(str1.replaceAll("\\+", "#"));

        // Replace "+" with "#" using replace()
        System.out.println(str1.replace("+", "#"));
    }
}