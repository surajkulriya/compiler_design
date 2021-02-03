class BA09 {
    public static void main (String [] args) {
        int x;
        int y;
        int z;
        boolean m;
        BA09H o;
        x = 10;
        y = 20;
        z = x + y;
        o = new BA09H();
        m = x < y;
        /* PRINTCONSTANTS */
        if (m) {
            z = o.foo();
            /* PRINTCONSTANTS */
        } else {
            z = x + y;
            /* PRINTCONSTANTS */
        }
        /* PRINTCONSTANTS */
        System.out.println(x);
    }
}
class BA09H {
    public int foo() {
        int z;
        z = 10;
        /* PRINTCONSTANTS */
        return z;
    }
}
