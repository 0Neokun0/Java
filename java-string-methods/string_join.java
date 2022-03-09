class Main {
    public static void main(String[] args) {
        String str1 = "That";
        String str2 = "Which";
        String str3 = "is Not.";

        // Join Strings with Space Between Them
        String joinedStr = String.join(" ", str1 , str2 , str3);
        System.out.println(joinedStr);
    }
}