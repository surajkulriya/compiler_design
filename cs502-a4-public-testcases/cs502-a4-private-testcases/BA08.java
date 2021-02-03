class BA08 {
    public static void main (String [] args) {
        int x;
        int z;
        BA08H o;
        x = 10;
        o = new BA08H();
        /* PRINTCONSTANTS */
        z = o.foo(x);
        System.out.println(x);
    }
}

class BA08H {
    public int foo(int p) {
        int z;
        int r;
        r = 10;
        /* PRINTCONSTANTS */
        z = p + r;
        /* PRINTCONSTANTS */
        p = 20;
        /* PRINTCONSTANTS */
        z = p + r;
        /* PRINTCONSTANTS */
        return z;
    }
}
