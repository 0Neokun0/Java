class Main {

    int i;

    // Constructo with no Parameter
    private Main() {
        i = 5;
        System.out.println("Constructor is Called ");
    }

    public static void main(String[] args) {

        // Calling the Constructor without any parameter
        Main obj = new Main();
        System.out.println("Value of i : " + obj.i);
    }
}