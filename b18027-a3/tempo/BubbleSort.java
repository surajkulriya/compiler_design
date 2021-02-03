class BubbleSort {
    public static void main(String[] a) {
        BBS mtTmp2;
        int mtTmp3;
        int mtTmp1;
        mtTmp2 = new BBS();
        mtTmp3 = 10;
        mtTmp1 = mtTmp2.Start(mtTmp3);
        System.out.println(mtTmp1);
    }
}
class BBS {
    int[] number;
    int size;
    public int Start(int sz) {
        int aux01;
        BBS mtTmp5;
        int mtTmp4;
        BBS mtTmp7;
        int mtTmp6;
        int mtTmp8;
        BBS mtTmp10;
        int mtTmp9;
        BBS mtTmp12;
        int mtTmp11;
        int mtTmp13;
        mtTmp5 = this;
        mtTmp4 = mtTmp5.Init(sz);
        aux01 = mtTmp4;
        mtTmp7 = this;
        mtTmp6 = mtTmp7.Print();
        aux01 = mtTmp6;
        mtTmp8 = 99999;
        System.out.println(mtTmp8);
        mtTmp10 = this;
        mtTmp9 = mtTmp10.Sort();
        aux01 = mtTmp9;
        mtTmp12 = this;
        mtTmp11 = mtTmp12.Print();
        aux01 = mtTmp11;
        mtTmp13 = 0;
        return mtTmp13;
    }
    public int Sort() {
        int nt;
        int i;
        int aux02;
        int aux04;
        int aux05;
        int aux06;
        int aux07;
        int j;
        int t;
        int mtTmp14;
        int mtTmp15;
        int mtTmp16;
        int mtTmp17;
        int mtTmp18;
        boolean mtTmp19;
        int mtTmp20;
        boolean mtTmp21;
        int mtTmp22;
        int mtTmp23;
        int mtTmp24;
        int mtTmp25;
        int mtTmp26;
        int mtTmp27;
        boolean mtTmp28;
        int mtTmp29;
        int mtTmp30;
        int mtTmp31;
        int mtTmp32;
        int mtTmp33;
        int mtTmp34;
        int mtTmp35;
        int mtTmp36;
        int mtTmp37;
        int mtTmp38;
        mtTmp15 = 1;
        mtTmp14 = size - mtTmp15;
        i = mtTmp14;
        mtTmp17 = 0;
        mtTmp18 = 1;
        mtTmp16 = mtTmp17 - mtTmp18;
        aux02 = mtTmp16;
        mtTmp19 = aux02 < i;
        while(mtTmp19) {
            {
            mtTmp20 = 1;
            j = mtTmp20;
            mtTmp23 = 1;
            mtTmp22 = i + mtTmp23;
            mtTmp21 = j < mtTmp22;
            while(mtTmp21) {
                {
                mtTmp25 = 1;
                mtTmp24 = j - mtTmp25;
                aux07 = mtTmp24;
                mtTmp26 = number[aux07];
                aux04 = mtTmp26;
                mtTmp27 = number[j];
                aux05 = mtTmp27;
                mtTmp28 = aux05 < aux04;
                if(mtTmp28) {
                    {
                    mtTmp30 = 1;
                    mtTmp29 = j - mtTmp30;
                    aux06 = mtTmp29;
                    mtTmp31 = number[aux06];
                    t = mtTmp31;
                    mtTmp32 = number[j];
                    number[aux06] = mtTmp32;
                    number[j] = t;
                    }
                } else {
                    mtTmp33 = 0;
                    nt = mtTmp33;
                }
                mtTmp35 = 1;
                mtTmp34 = j + mtTmp35;
                j = mtTmp34;
                }
                mtTmp23 = 1;
mtTmp22 = i + mtTmp23;
mtTmp21 = j < mtTmp22;
            }
            mtTmp37 = 1;
            mtTmp36 = i - mtTmp37;
            i = mtTmp36;
            }
            mtTmp19 = aux02 < i;
        }
        mtTmp38 = 0;
        return mtTmp38;
    }
    public int Print() {
        int j;
        int mtTmp39;
        boolean mtTmp40;
        int mtTmp41;
        int mtTmp42;
        int mtTmp43;
        int mtTmp44;
        int mtTmp45;
        mtTmp39 = 0;
        j = mtTmp39;
        mtTmp41 = size;
        mtTmp40 = j < mtTmp41;
        while(mtTmp40) {
            {
            mtTmp42 = number[j];
            System.out.println(mtTmp42);
            mtTmp44 = 1;
            mtTmp43 = j + mtTmp44;
            j = mtTmp43;
            }
            mtTmp41 = size;
mtTmp40 = j < mtTmp41;
        }
        mtTmp45 = 0;
        return mtTmp45;
    }
    public int Init(int sz) {
        int[] mtTmp46;
        int mtTmp47;
        int mtTmp48;
        int mtTmp49;
        int mtTmp50;
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
        int mtTmp62;
        int mtTmp63;
        int mtTmp64;
        int mtTmp65;
        int mtTmp66;
        int mtTmp67;
        size = sz;
        mtTmp46 = new int[sz];
        number = mtTmp46;
        mtTmp47 = 0;
        mtTmp48 = 20;
        number[mtTmp47] = mtTmp48;
        mtTmp49 = 1;
        mtTmp50 = 7;
        number[mtTmp49] = mtTmp50;
        mtTmp51 = 2;
        mtTmp52 = 12;
        number[mtTmp51] = mtTmp52;
        mtTmp53 = 3;
        mtTmp54 = 18;
        number[mtTmp53] = mtTmp54;
        mtTmp55 = 4;
        mtTmp56 = 2;
        number[mtTmp55] = mtTmp56;
        mtTmp57 = 5;
        mtTmp58 = 11;
        number[mtTmp57] = mtTmp58;
        mtTmp59 = 6;
        mtTmp60 = 6;
        number[mtTmp59] = mtTmp60;
        mtTmp61 = 7;
        mtTmp62 = 9;
        number[mtTmp61] = mtTmp62;
        mtTmp63 = 8;
        mtTmp64 = 19;
        number[mtTmp63] = mtTmp64;
        mtTmp65 = 9;
        mtTmp66 = 5;
        number[mtTmp65] = mtTmp66;
        mtTmp67 = 0;
        return mtTmp67;
    }
}
