class Pvt16 {
    public static void main (String [] args) {
        System.out.println(new HelperPvt16().start());
    }
}
class HelperPvt16 {
    public int start() {
        int x;
        int y;
        x = (this.a()) + (this.b());
        System.out.println(x);
        y = (this.a()) * (this.b());
        if (x < y)
            System.out.println(y);
        else 
            System.out.println(x);
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
