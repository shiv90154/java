class Operation {
    int data = 50;

    void change(int data) {
        data = data + 100; // yeh change sirf local variable mein hoga
    }

    public static void main(String args[]) {
        Operation op = new Operation();
        System.out.println("change se pehle: " + op.data); // Output: 50
        op.change(500);
        System.out.println("change ke baad: " + op.data); // Output: 50
    }
}
