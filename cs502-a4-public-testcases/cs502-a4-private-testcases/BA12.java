class BA12 {
    public static void main (String [] args) {
        int x;
        int y;
        int z;
        boolean b;
        BA12H obj1;
        BA12H obj2;
        obj1 = new BA12H();
        obj2 = new BA12H();
        x = 10;
        y = obj1.foo(x);
        y = obj2.bar(x, y);
        z = obj2.foo(x);
        /* PRINTCONSTANTS */
        System.out.println(z);
    }
}
class BA12H {
    int v;
    public int foo(int p) {
        int r;
        /* PRINTCONSTANTS */
        r = v + p;
        /* PRINTCONSTANTS */
        return r;
    }
    public int bar(int p, int q) {
        /* PRINTCONSTANTS */
        v = p + q;
        /* PRINTCONSTANTS */
        return v;
    }
}
