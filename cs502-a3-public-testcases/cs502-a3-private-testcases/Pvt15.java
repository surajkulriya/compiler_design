class Pvt15 {
    public static void main (String [] args) {
        System.out.println(new HelperPvt15().start());
    }
}
class HelperPvt15 {
    public int start() {
        return this.foo(this.a(), this.b(), this.c());
    }
    public int a() {
        System.out.println(1);
        return 0;
    }
    public int b() {
        System.out.println(2);
        return 0;
    }
    public int c() {
        System.out.println(3);
        return 0;
    }
    public int foo(int a, int b, int c) {
        return 0;
    }
}
