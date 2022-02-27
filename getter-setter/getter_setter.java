class Main {
    String name;

    // Setter Method
    void setName( String name ) {
        this.name = name;
    }

    // Getter method
    String getName() {
        return this.name;
    }

    public static void main( String[] args ) {
        Main obj = new Main();

        // Calling the Setter And The Getter Method
        obj.setName("Java-This");
        System.out.println("obj-name: " + obj.getName());
    }
}