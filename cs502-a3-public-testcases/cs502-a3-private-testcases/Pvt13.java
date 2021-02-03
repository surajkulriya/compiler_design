class Pvt13 {
    public static void main(String [] args) {
        System.out.println(new HelperPvt13().start());
    }
}
class HelperPvt13 {
    public int start () {
        System.out.println((this.foo()).length);
        return 0;
    }
    public int [] foo() {
        return new int [5];
    }
}
