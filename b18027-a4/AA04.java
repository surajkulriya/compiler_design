class AA04 {
    public static void main (String [] args) {
        int x;
        int y;
        int z;
        boolean b;
        AA04H obj;
        x = 10;
        y = 2;
        z = 1;
        b = z < y;
        /* PRINTCONSTANTS */

        while (b) {
            /* PRINTCONSTANTS */
            z = z + z;
            y = x + y;
            obj = new AA04H();
            x = obj.foo(y);
            b = x < y;
        }

        System.out.println(x);
    }
}

class AA04H {
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
