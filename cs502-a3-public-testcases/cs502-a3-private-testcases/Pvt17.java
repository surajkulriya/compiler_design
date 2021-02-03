class Pvt17 {
    public static void main (String [] args) {
        System.out.println(new HelperPvt17().start());
    }
}
class HelperPvt17 {
    public int start() {
        boolean x;
        x = (((this.a()) + (this.b()))*(this.b())) < (this.a());
        if (x)
            System.out.println(1);
        else
            System.out.println(3);
        return 0;
    }
    public int a() {
        System.out.println(1);
        return 0;
    }
    public int b() {
        System.out.println(2);
        return 0;
    }
}
