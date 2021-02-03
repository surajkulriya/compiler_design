class AA02 {
    public static void main (String [] args) {
        int x;
        int y;
        boolean f1;
        x = 10;
        f1 = true;
        /* PRINTCONSTANTS */

        if (f1) {		
            System.out.println(x);
            y = 20;
            /* PRINTCONSTANTS */
        }
        else {
            x = 50;
            /* PRINTCONSTANTS */
            y = 30;
            /* PRINTCONSTANTS */
            System.out.println(x);
        }

        /* PRINTCONSTANTS */
        System.out.println(x);
    }
}
