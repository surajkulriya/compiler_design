class AA03 {
    public static void main (String [] args) {
        int x;
        int y;
        boolean b;
        x = 10;
        y = 20;

        b = false;
        if (b) {		
            x = 20;
            b = true;
        }
        else {
            y = 30;
        }

        /* PRINTCONSTANTS */
        System.out.println(x);
    }
}
