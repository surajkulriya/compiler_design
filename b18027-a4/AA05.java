class AA05 {
    public static void main (String [] args) {
        int x;
        int y;
        int z;
        boolean b;
        AA05H obj;
        x = 10;
        y = 2;
        z = 1;
        b = z < y;
        /* PRINTCONSTANTS */

        while (b) {
            z = z + z;
            y = x + y;
            obj = new AA05H();
            x = obj.foo(y);
            b = x < y;
            /* PRINTCONSTANTS */
        }

        System.out.println(x);
    }
}

class AA05H {
    int v;
    public int foo(int p) {
        int d;
        d = 100;
        /* PRINTCONSTANTS */
        v = p + v;
        /* PRINTCONSTANTS */
        return d;
    }
}
