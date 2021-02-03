class Pvt9 {
    public static void main(String [] args) {
        System.out.println(new HelperPvt9().start());
    }
}
class HelperPvt9 {
    public int start () {
        int x;
        Helper2Pvt9 obj;
        obj = new Helper2Pvt9();
        x = 10;
        return obj.meth1(2, 3+x);
    }
}
class Helper2Pvt9 {
    public int meth1 (int a, int b) {
        int c;
        c = a + b;
        System.out.println(c);
        return 0;
    }
}
