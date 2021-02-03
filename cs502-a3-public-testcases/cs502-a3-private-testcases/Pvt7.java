class Pvt7 {
    public static void main(String [] args) {
        System.out.println(new HelperPvt7().start());
    }
}
class HelperPvt7 {
    public int start () {
        int a;
        int b;
        a = 10;
        b = 20;
        System.out.println(a+(b*(a-b)));
        return 0;
    }
}
