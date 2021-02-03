class QuickSort {
    public static void main(String[] a) {
        QS mtTmp2;
        int mtTmp3;
        int mtTmp1;
        mtTmp2 = new QS();
        mtTmp3 = 10;
        mtTmp1 = mtTmp2.Start(mtTmp3);
        System.out.println(mtTmp1);
    }
}
class QS {
    int[] number;
    int size;
    public int Start(int sz) {
        int aux01;
        QS mtTmp5;
        int mtTmp4;
        QS mtTmp7;
        int mtTmp6;
        int mtTmp8;
        int mtTmp9;
        int mtTmp10;
        QS mtTmp12;
        int mtTmp13;
        int mtTmp11;
        QS mtTmp15;
        int mtTmp14;
        int mtTmp16;
        mtTmp5 = this;
        mtTmp4 = mtTmp5.Init(sz);
        aux01 = mtTmp4;
        mtTmp7 = this;
        mtTmp6 = mtTmp7.Print();
        aux01 = mtTmp6;
        mtTmp8 = 9999;
        System.out.println(mtTmp8);
        mtTmp10 = 1;
        mtTmp9 = size - mtTmp10;
        aux01 = mtTmp9;
        mtTmp12 = this;
        mtTmp13 = 0;
        mtTmp11 = mtTmp12.Sort(mtTmp13,aux01);
        aux01 = mtTmp11;
        mtTmp15 = this;
        mtTmp14 = mtTmp15.Print();
        aux01 = mtTmp14;
        mtTmp16 = 0;
        return mtTmp16;
    }
    public int Sort(int left, int right) {
        int v;
        int i;
        int j;
        int nt;
        int t;
        boolean  cont01;
        boolean  cont02;
        int aux03;
        int mtTmp17;
        boolean mtTmp18;
        int mtTmp19;
        int mtTmp20;
        int mtTmp21;
        boolean mtTmp22;
        boolean mtTmp23;
        int mtTmp24;
        int mtTmp25;
        int mtTmp26;
        boolean mtTmp27;
        boolean mtTmp28;
        boolean mtTmp29;
        boolean mtTmp30;
        boolean mtTmp31;
        int mtTmp32;
        int mtTmp33;
        int mtTmp34;
        boolean mtTmp35;
        boolean mtTmp36;
        boolean mtTmp37;
        boolean mtTmp38;
        int mtTmp39;
        int mtTmp40;
        boolean mtTmp41;
        int mtTmp42;
        int mtTmp43;
        boolean mtTmp44;
        boolean mtTmp45;
        int mtTmp46;
        int mtTmp47;
        QS mtTmp49;
        int mtTmp50;
        int mtTmp51;
        int mtTmp48;
        QS mtTmp53;
        int mtTmp54;
        int mtTmp55;
        int mtTmp52;
        int mtTmp56;
        int mtTmp57;
        mtTmp17 = 0;
        t = mtTmp17;
        mtTmp18 = left < right;
        if(mtTmp18) {
            {
            mtTmp19 = number[right];
            v = mtTmp19;
            mtTmp21 = 1;
            mtTmp20 = left - mtTmp21;
            i = mtTmp20;
            j = right;
            mtTmp22 = true;
            cont01 = mtTmp22;
            while(cont01) {
                {
                mtTmp23 = true;
                cont02 = mtTmp23;
                while(cont02) {
                    {
                    mtTmp25 = 1;
                    mtTmp24 = i + mtTmp25;
                    i = mtTmp24;
                    mtTmp26 = number[i];
                    aux03 = mtTmp26;
                    mtTmp28 = aux03 < v;
                    mtTmp27 = !mtTmp28;
                    if(mtTmp27) {
                        mtTmp29 = false;
                        cont02 = mtTmp29;
                    } else {
                        mtTmp30 = true;
                        cont02 = mtTmp30;
                    }
                    }
                                    }
                mtTmp31 = true;
                cont02 = mtTmp31;
                while(cont02) {
                    {
                    mtTmp33 = 1;
                    mtTmp32 = j - mtTmp33;
                    j = mtTmp32;
                    mtTmp34 = number[j];
                    aux03 = mtTmp34;
                    mtTmp36 = v < aux03;
                    mtTmp35 = !mtTmp36;
                    if(mtTmp35) {
                        mtTmp37 = false;
                        cont02 = mtTmp37;
                    } else {
                        mtTmp38 = true;
                        cont02 = mtTmp38;
                    }
                    }
                                    }
                mtTmp39 = number[i];
                t = mtTmp39;
                mtTmp40 = number[j];
                number[i] = mtTmp40;
                number[j] = t;
                mtTmp43 = 1;
                mtTmp42 = i + mtTmp43;
                mtTmp41 = j < mtTmp42;
                if(mtTmp41) {
                    mtTmp44 = false;
                    cont01 = mtTmp44;
                } else {
                    mtTmp45 = true;
                    cont01 = mtTmp45;
                }
                }
                            }
            mtTmp46 = number[i];
            number[j] = mtTmp46;
            mtTmp47 = number[right];
            number[i] = mtTmp47;
            number[right] = t;
            mtTmp49 = this;
            mtTmp51 = 1;
            mtTmp50 = i - mtTmp51;
            mtTmp48 = mtTmp49.Sort(left,mtTmp50);
            nt = mtTmp48;
            mtTmp53 = this;
            mtTmp55 = 1;
            mtTmp54 = i + mtTmp55;
            mtTmp52 = mtTmp53.Sort(mtTmp54,right);
            nt = mtTmp52;
            }
        } else {
            mtTmp56 = 0;
            nt = mtTmp56;
        }
        mtTmp57 = 0;
        return mtTmp57;
    }
    public int Print() {
        int j;
        int mtTmp58;
        boolean mtTmp59;
        int mtTmp60;
        int mtTmp61;
        int mtTmp62;
        int mtTmp63;
        int mtTmp64;
        mtTmp58 = 0;
        j = mtTmp58;
        mtTmp60 = size;
        mtTmp59 = j < mtTmp60;
        while(mtTmp59) {
            {
            mtTmp61 = number[j];
            System.out.println(mtTmp61);
            mtTmp63 = 1;
            mtTmp62 = j + mtTmp63;
            j = mtTmp62;
            }
            mtTmp60 = size;
mtTmp59 = j < mtTmp60;
        }
        mtTmp64 = 0;
        return mtTmp64;
    }
    public int Init(int sz) {
        int[] mtTmp65;
        int mtTmp66;
        int mtTmp67;
        int mtTmp68;
        int mtTmp69;
        int mtTmp70;
        int mtTmp71;
        int mtTmp72;
        int mtTmp73;
        int mtTmp74;
        int mtTmp75;
        int mtTmp76;
        int mtTmp77;
        int mtTmp78;
        int mtTmp79;
        int mtTmp80;
        int mtTmp81;
        int mtTmp82;
        int mtTmp83;
        int mtTmp84;
        int mtTmp85;
        int mtTmp86;
        size = sz;
        mtTmp65 = new int[sz];
        number = mtTmp65;
        mtTmp66 = 0;
        mtTmp67 = 20;
        number[mtTmp66] = mtTmp67;
        mtTmp68 = 1;
        mtTmp69 = 7;
        number[mtTmp68] = mtTmp69;
        mtTmp70 = 2;
        mtTmp71 = 12;
        number[mtTmp70] = mtTmp71;
        mtTmp72 = 3;
        mtTmp73 = 18;
        number[mtTmp72] = mtTmp73;
        mtTmp74 = 4;
        mtTmp75 = 2;
        number[mtTmp74] = mtTmp75;
        mtTmp76 = 5;
        mtTmp77 = 11;
        number[mtTmp76] = mtTmp77;
        mtTmp78 = 6;
        mtTmp79 = 6;
        number[mtTmp78] = mtTmp79;
        mtTmp80 = 7;
        mtTmp81 = 9;
        number[mtTmp80] = mtTmp81;
        mtTmp82 = 8;
        mtTmp83 = 19;
        number[mtTmp82] = mtTmp83;
        mtTmp84 = 9;
        mtTmp85 = 5;
        number[mtTmp84] = mtTmp85;
        mtTmp86 = 0;
        return mtTmp86;
    }
}
