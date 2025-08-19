class TestFinal {
    // final variable
    final int number = 10;

    void changeValue() {
        // Trying to change final variable
        // number = 20;  // ❌ Compile-time error
        System.out.println("Number = " + number);
    }

    public static void main(String[] args) {
        TestFinal obj = new TestFinal();
        obj.changeValue();
    }
}
