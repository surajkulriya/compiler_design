class MoreThan4 {
    public static void main(String[] a) {
        MT4 mtTmp2;
        int mtTmp3;
        int mtTmp4;
        int mtTmp5;
        int mtTmp6;
        int mtTmp7;
        int mtTmp8;
        int mtTmp1;
        mtTmp2 = new MT4();
        mtTmp3 = 1;
        mtTmp4 = 2;
        mtTmp5 = 3;
        mtTmp6 = 4;
        mtTmp7 = 5;
        mtTmp8 = 6;
        mtTmp1 = mtTmp2.Start(mtTmp3,mtTmp4,mtTmp5,mtTmp6,mtTmp7,mtTmp8);
        System.out.println(mtTmp1);
    }
}
class MT4 {
    public int Start(int p1, int p2, int p3, int p4, int p5, int p6) {
        int aux;
        MT4 mtTmp10;
        int mtTmp9;
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);
        mtTmp10 = this;
        mtTmp9 = mtTmp10.Change(p6,p5,p4,p3,p2,p1);
        aux = mtTmp9;
        return aux;
    }
    public int Change(int p1, int p2, int p3, int p4, int p5, int p6) {
        int mtTmp11;
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);
        mtTmp11 = 0;
        return mtTmp11;
    }
}
