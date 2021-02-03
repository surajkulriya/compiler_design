class BA07 {
    public static void main (String [] args) {
        int x;
        int y;
        int z;
        int w;
        BA07H o;
        x = 10;
        y = 20;
        z = x * y;
        w = z;
        o = new BA07H();
        /* PRINTCONSTANTS */
        z = o.foo();
        /* PRINTCONSTANTS */
        System.out.println(x);
    }
}

class BA07H {
    public int foo() {
        int z;
        z = 10;
        return z;
    }
}
