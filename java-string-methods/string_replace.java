class Main {
    public static void main(String[] args) {
        String str1 = "abc cba";
        String str2 = "C++ Programming";

        // All Occurrences of 'a' is replaced with 'z'
        System.out.println(str1.replace('a', 'z')); // zba cbz

        // All Occurrences of 'L' is replaced with 'J'
        System.out.println("Lava".replace('L', 'J')); // Java

        // Character Not In The String
        System.out.println("Hello".replace('4', 'J')); // Hello

        // All Occurences of "C++" is replaced with "Java"
        System.out.println(str2.replace("C++", "Java")); // Java Programming

        // All Occurences of "aa" is replaced with "zz"\
        System.out.println("aa bb aa zz".replace("aa", "zz")); // zz bb zz zz

        // Substring not in The String
        System.out.println("Java".replace("C++", "C")); // Java

    }
}