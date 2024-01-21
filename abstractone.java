abstract class A {
    abstract int sum1(int a, int b);
    abstract void show();
}

class B extends A {

    @Override
    int sum1(int a, int b) {
        return a + b;
    }

    @Override
    void show() {
        System.out.println("pratik");
    }
}

class abstractone {
    public static void main(String[] args) {
        B b = new B();
        b.show();
        System.out.println(b.sum1(3, 5)); // Output: 8
    }
}
