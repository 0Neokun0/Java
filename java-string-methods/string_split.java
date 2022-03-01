class Main {
    public static void main(String[] args) {
        String text = "Java is difficult language";

        // Split String From Space
        String[] result = text.split(" ");

        System.out.println("result = ");
        for (String str: result) {
            System.out.print(str + "-");
        }
    }
}