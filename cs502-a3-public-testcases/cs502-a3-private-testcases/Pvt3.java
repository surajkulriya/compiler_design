class Pvt3 {
    public static void main (String [] args) {
        System.out.println(new HelperPvt3().start());
    }
}
class HelperPvt3 {
    public int start() {
        int [] arr;
        arr = new int [5];
        arr[2] = 10;
        return arr[2];
    }
}
