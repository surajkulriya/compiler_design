class BA10 {
    public static void main (String [] args) {
        int x;
        int y;
        int z;
        int w;
        int r;
        boolean m;
        boolean b;
        /* PRINTCONSTANTS */
        x = 10;
        /* PRINTCONSTANTS */
        y = 20;
        /* PRINTCONSTANTS */
        b = x < y;
        m = !b;
        /* PRINTCONSTANTS */
        while (b) {
            if (b) {
                w = 10;
                /* PRINTCONSTANTS */
                if (m) {
                    w = 20;
                    /* PRINTCONSTANTS */
                } else {
                    /* PRINTCONSTANTS */
                    w = 30;
                }
            } else {
                w = 20;
                /* PRINTCONSTANTS */
            }
            /* PRINTCONSTANTS */
            b = y < w;
            /* PRINTCONSTANTS */
        }
        z = 0;
        r = z - w;
        /* PRINTCONSTANTS */
        System.out.println(z);
    }
}
