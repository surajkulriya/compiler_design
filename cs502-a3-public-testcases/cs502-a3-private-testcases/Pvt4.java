class Pvt4 {
    public static void main (String [] args) {
        System.out.println(new HelperPvt4().start());
    }
}
class HelperPvt4 {
    public int start() {
        int a;
        int b;
        a = 10;
        b = 20;
        if (a < b)
            System.out.println(b);
        else
            System.out.println(a);
        return 0;
    }
}
