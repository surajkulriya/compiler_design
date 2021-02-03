class Pvt12 {
    public static void main(String [] args) {
        System.out.println(new HelperPvt12().start());
    }
}
class HelperPvt12 {
    public int start () {
        boolean x;
        x = true;
        if (!x)
            System.out.println(1);
        else
            System.out.println(2);
        return 0;
    }
}
