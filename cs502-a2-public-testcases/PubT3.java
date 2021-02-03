class PubT3 {
    public static void main (String [] args) {
        System.out.println(new LOCPubT3().start());
    }
}

class LOCPubT3 {
    int x;
}

class LOCPubT33 extends LOCPubT3 {
    public int start() {
        int x;
        int y;
        x = 0;
        while (this.cond(x, 5)) {
            x = y + 1;
            System.out.println(z);
        }
        return 0;
    }
    public boolean cond(int a, int b) {
        PubT3 b;
        boolean ret;
        ret = true;
        System.out.println(a+b);
        return ret;
    }
}

// Expected output (ignore comment symbols):
// Multiple declarations for x: declared type int; new type int
// Uninitialized: y
// Undeclared: z
// Multiple declarations for b: declared type int; new type PubT3
