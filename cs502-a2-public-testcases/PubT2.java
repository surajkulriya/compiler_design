class PubT2 {
    public static void main(String [] args) {
        System.out.println(new LOCPubT2().start());
    }
}
class LOCPubT2 {
    public int start () {
        int x;
        float x;
        LOC2PubT2 obj;
        obj = new LOC2PubT2();
        x = 10;
        return obj.meth1(2, 3+y);
    }

    public int meth1 (int a, int b) {
        int c;
        c = a + b;
        d = a + e;
        System.out.println(c);
        return 0;
    }
}

// Expected output (ignore comment symbols; also note the order in last two):
// Multiple declarations for x: declared type int; new type float
// Undeclared: y
// Undeclared: e
// Undeclared: d
