class PubT1 {
    public static void main (String [] args) {
        System.out.println(new LOCPubT15().start());
    }
}
class LOCPubT1 {
    public int start() {
        int a;
        int b;
        a = 10;
        b = 20;
        if (a <= b)
            System.out.println(b);
        else
            System.out.println(a);
        return 0;
    }
}

// Expected Output: Yay, Garfield can eat your program!
