class Pvt5 {
    public static void main (String [] args) {
        System.out.println(new HelperPvt5().start());
    }
}
class HelperPvt5 {
    public int start() {
        int a;
        a = 0;
        while (a < 5) {
            System.out.println(a);
            a = a + 1;
        }
        return 0;
    }
}
