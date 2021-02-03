class Pvt10 {
    public static void main(String [] args) {
        System.out.println(new HelperPvt10().start());
    }
}
class HelperPvt10 {
    public int start () {
        int x;
        x = 10;
        System.out.println((((this.meth1(2+x)).meth2()).meth3()).meth4());
        return 0;
    }
    public HelperPvt10 meth1(int a) {
        return this;	
    }
    public HelperPvt10 meth2() {
        return this;
    }
    public HelperPvt10 meth3() {
        return this;
    }
    public int meth4() {
        int x;
        x = 10;
        return x;
    }
}
