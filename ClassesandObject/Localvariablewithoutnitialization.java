class TestThis {
    int value = 10;

    void showValue() {
        int value = 20; // local variable
        System.out.println("Local: " + value);
        System.out.println("Instance: " + this.value);
    }

    public static void main(String[] args) {
        new TestThis().showValue();
    }
}
