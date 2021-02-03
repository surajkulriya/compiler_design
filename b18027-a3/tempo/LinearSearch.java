class LinearSearch {
    public static void main(String[] a) {
        LS mtTmp2;
        int mtTmp3;
        int mtTmp1;
        mtTmp2 = new LS();
        mtTmp3 = 10;
        mtTmp1 = mtTmp2.Start(mtTmp3);
        System.out.println(mtTmp1);
    }
}
class LS {
    int[] number;
    int size;
    public int Start(int sz) {
        int aux01;
        int aux02;
        LS mtTmp5;
        int mtTmp4;
        LS mtTmp7;
        int mtTmp6;
        int mtTmp8;
        LS mtTmp10;
        int mtTmp11;
        int mtTmp9;
        LS mtTmp13;
        int mtTmp14;
        int mtTmp12;
        LS mtTmp16;
        int mtTmp17;
        int mtTmp15;
        LS mtTmp19;
        int mtTmp20;
        int mtTmp18;
        int mtTmp21;
        mtTmp5 = this;
        mtTmp4 = mtTmp5.Init(sz);
        aux01 = mtTmp4;
        mtTmp7 = this;
        mtTmp6 = mtTmp7.Print();
        aux02 = mtTmp6;
        mtTmp8 = 9999;
        System.out.println(mtTmp8);
        mtTmp10 = this;
        mtTmp11 = 8;
        mtTmp9 = mtTmp10.Search(mtTmp11);
        System.out.println(mtTmp9);
        mtTmp13 = this;
        mtTmp14 = 12;
        mtTmp12 = mtTmp13.Search(mtTmp14);
        System.out.println(mtTmp12);
        mtTmp16 = this;
        mtTmp17 = 17;
        mtTmp15 = mtTmp16.Search(mtTmp17);
        System.out.println(mtTmp15);
        mtTmp19 = this;
        mtTmp20 = 50;
        mtTmp18 = mtTmp19.Search(mtTmp20);
        System.out.println(mtTmp18);
        mtTmp21 = 55;
        return mtTmp21;
    }
    public int Print() {
        int j;
        int mtTmp22;
        boolean mtTmp23;
        int mtTmp24;
        int mtTmp25;
        int mtTmp26;
        int mtTmp27;
        int mtTmp28;
        mtTmp22 = 1;
        j = mtTmp22;
        mtTmp24 = size;
        mtTmp23 = j < mtTmp24;
        while(mtTmp23) {
            {
            mtTmp25 = number[j];
            System.out.println(mtTmp25);
            mtTmp27 = 1;
            mtTmp26 = j + mtTmp27;
            j = mtTmp26;
            }
            mtTmp24 = size;
mtTmp23 = j < mtTmp24;
        }
        mtTmp28 = 0;
        return mtTmp28;
    }
    public int Search(int num) {
        int j;
        boolean  ls01;
        int ifound;
        int aux01;
        int aux02;
        int nt;
        int mtTmp29;
        boolean mtTmp30;
        int mtTmp31;
        boolean mtTmp32;
        int mtTmp33;
        int mtTmp34;
        int mtTmp35;
        int mtTmp36;
        boolean mtTmp37;
        int mtTmp38;
        boolean mtTmp39;
        boolean mtTmp40;
        int mtTmp41;
        boolean mtTmp42;
        int mtTmp43;
        int mtTmp44;
        int mtTmp45;
        mtTmp29 = 1;
        j = mtTmp29;
        mtTmp30 = false;
        ls01 = mtTmp30;
        mtTmp31 = 0;
        ifound = mtTmp31;
        mtTmp33 = size;
        mtTmp32 = j < mtTmp33;
        while(mtTmp32) {
            {
            mtTmp34 = number[j];
            aux01 = mtTmp34;
            mtTmp36 = 1;
            mtTmp35 = num + mtTmp36;
            aux02 = mtTmp35;
            mtTmp37 = aux01 < num;
            if(mtTmp37) {
                mtTmp38 = 0;
                nt = mtTmp38;
            } else {
                mtTmp40 = aux01 < aux02;
                mtTmp39 = !mtTmp40;
                if(mtTmp39) {
                    mtTmp41 = 0;
                    nt = mtTmp41;
                } else {
                    {
                    mtTmp42 = true;
                    ls01 = mtTmp42;
                    mtTmp43 = 1;
                    ifound = mtTmp43;
                    j = size;
                    }
                }
            }
            mtTmp45 = 1;
            mtTmp44 = j + mtTmp45;
            j = mtTmp44;
            }
            mtTmp33 = size;
mtTmp32 = j < mtTmp33;
        }
        return ifound;
    }
    public int Init(int sz) {
        int j;
        int k;
        int aux01;
        int aux02;
        int[] mtTmp46;
        int mtTmp47;
        int mtTmp48;
        int mtTmp49;
        boolean mtTmp50;
        int mtTmp51;
        int mtTmp52;
        int mtTmp53;
        int mtTmp54;
        int mtTmp55;
        int mtTmp56;
        int mtTmp57;
        int mtTmp58;
        int mtTmp59;
        int mtTmp60;
        int mtTmp61;
        size = sz;
        mtTmp46 = new int[sz];
        number = mtTmp46;
        mtTmp47 = 1;
        j = mtTmp47;
        mtTmp49 = 1;
        mtTmp48 = size + mtTmp49;
        k = mtTmp48;
        mtTmp51 = size;
        mtTmp50 = j < mtTmp51;
        while(mtTmp50) {
            {
            mtTmp53 = 2;
            mtTmp52 = mtTmp53 * j;
            aux01 = mtTmp52;
            mtTmp55 = 3;
            mtTmp54 = k - mtTmp55;
            aux02 = mtTmp54;
            mtTmp56 = aux01 + aux02;
            number[j] = mtTmp56;
            mtTmp58 = 1;
            mtTmp57 = j + mtTmp58;
            j = mtTmp57;
            mtTmp60 = 1;
            mtTmp59 = k - mtTmp60;
            k = mtTmp59;
            }
            mtTmp51 = size;
mtTmp50 = j < mtTmp51;
        }
        mtTmp61 = 0;
        return mtTmp61;
    }
}
