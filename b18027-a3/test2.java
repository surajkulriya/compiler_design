class TA7 {
    public static void main (String [] args) {
		
        System.out.println(new LOCTAC7().start());
    }
}
class LOCTA7 {
	int r;
	public int start(){
		int a;
		int b;
		a=5;b=7;
		return a+b;
	}
}

class LOCTAC7 extends LOCTA7 {
    int r;
    public int getR() {
        r = 10;
        return r;
    }
}

class LOCTACC7 extends LOCTAC7 {
    int s;
    int t;
    public int getR() {
        int r;
        s = 10;
        t = 20;
        r = s + t;
        return r;
    }
}