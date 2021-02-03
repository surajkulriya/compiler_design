class Pvt11 {
    public static void main(String [] args) {
        System.out.println(new HelperPvt11().start());
    }
}
class HelperPvt11 {
    public int start () {
        int [] arr;
        int x;
        x = 10;
        arr = new int [0 + x];
        arr[0] = 1;
        x = arr[0];
        return x;
    }
}
