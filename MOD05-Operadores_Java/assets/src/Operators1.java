class Operators1 {
    public static void main(String[] args) {
        int a = 7;
        int b = 4;
        int c = a++ + ++b;
        int d = --a + --b + c--;
        int e = a + +b + -c + d--;
        int sum = a + b + c + d + e;
        System.out.println("Suma: " + sum);
    }
}