class BinarySearch {
    public static void main(String[] a) {
        BS mtTmp2;
        int mtTmp3;
        int mtTmp1;
        mtTmp2 = new BS();
        mtTmp3 = 20;
        mtTmp1 = mtTmp2.Start(mtTmp3);
        System.out.println(mtTmp1);
    }
}
class BS {
    int[] number;
    int size;
    public int Start(int sz) {
        int aux01;
        int aux02;
        BS mtTmp5;
        int mtTmp4;
        BS mtTmp7;
        int mtTmp6;
        BS mtTmp9;
        int mtTmp10;
        boolean mtTmp8;
        int mtTmp11;
        int mtTmp12;
        BS mtTmp14;
        int mtTmp15;
        boolean mtTmp13;
        int mtTmp16;
        int mtTmp17;
        BS mtTmp19;
        int mtTmp20;
        boolean mtTmp18;
        int mtTmp21;
        int mtTmp22;
        BS mtTmp24;
        int mtTmp25;
        boolean mtTmp23;
        int mtTmp26;
        int mtTmp27;
        BS mtTmp29;
        int mtTmp30;
        boolean mtTmp28;
        int mtTmp31;
        int mtTmp32;
        BS mtTmp34;
        int mtTmp35;
        boolean mtTmp33;
        int mtTmp36;
        int mtTmp37;
        BS mtTmp39;
        int mtTmp40;
        boolean mtTmp38;
        int mtTmp41;
        int mtTmp42;
        BS mtTmp44;
        int mtTmp45;
        boolean mtTmp43;
        int mtTmp46;
        int mtTmp47;
        int mtTmp48;
        mtTmp5 = this;
        mtTmp4 = mtTmp5.Init(sz);
        aux01 = mtTmp4;
        mtTmp7 = this;
        mtTmp6 = mtTmp7.Print();
        aux02 = mtTmp6;
        mtTmp9 = this;
        mtTmp10 = 8;
        mtTmp8 = mtTmp9.Search(mtTmp10);
        if(mtTmp8) {
            mtTmp11 = 1;
            System.out.println(mtTmp11);
        } else {
            mtTmp12 = 0;
            System.out.println(mtTmp12);
        }
        mtTmp14 = this;
        mtTmp15 = 19;
        mtTmp13 = mtTmp14.Search(mtTmp15);
        if(mtTmp13) {
            mtTmp16 = 1;
            System.out.println(mtTmp16);
        } else {
            mtTmp17 = 0;
            System.out.println(mtTmp17);
        }
        mtTmp19 = this;
        mtTmp20 = 20;
        mtTmp18 = mtTmp19.Search(mtTmp20);
        if(mtTmp18) {
            mtTmp21 = 1;
            System.out.println(mtTmp21);
        } else {
            mtTmp22 = 0;
            System.out.println(mtTmp22);
        }
        mtTmp24 = this;
        mtTmp25 = 21;
        mtTmp23 = mtTmp24.Search(mtTmp25);
        if(mtTmp23) {
            mtTmp26 = 1;
            System.out.println(mtTmp26);
        } else {
            mtTmp27 = 0;
            System.out.println(mtTmp27);
        }
        mtTmp29 = this;
        mtTmp30 = 37;
        mtTmp28 = mtTmp29.Search(mtTmp30);
        if(mtTmp28) {
            mtTmp31 = 1;
            System.out.println(mtTmp31);
        } else {
            mtTmp32 = 0;
            System.out.println(mtTmp32);
        }
        mtTmp34 = this;
        mtTmp35 = 38;
        mtTmp33 = mtTmp34.Search(mtTmp35);
        if(mtTmp33) {
            mtTmp36 = 1;
            System.out.println(mtTmp36);
        } else {
            mtTmp37 = 0;
            System.out.println(mtTmp37);
        }
        mtTmp39 = this;
        mtTmp40 = 39;
        mtTmp38 = mtTmp39.Search(mtTmp40);
        if(mtTmp38) {
            mtTmp41 = 1;
            System.out.println(mtTmp41);
        } else {
            mtTmp42 = 0;
            System.out.println(mtTmp42);
        }
        mtTmp44 = this;
        mtTmp45 = 50;
        mtTmp43 = mtTmp44.Search(mtTmp45);
        if(mtTmp43) {
            mtTmp46 = 1;
            System.out.println(mtTmp46);
        } else {
            mtTmp47 = 0;
            System.out.println(mtTmp47);
        }
        mtTmp48 = 999;
        return mtTmp48;
    }
    public boolean Search(int num) {
        boolean  bs01;
        int right;
        int left;
        boolean  var_cont;
        int medium;
        int aux01;
        int nt;
        int mtTmp49;
        boolean mtTmp50;
        int mtTmp51;
        int mtTmp52;
        int mtTmp53;
        int mtTmp54;
        boolean mtTmp55;
        int mtTmp56;
        BS mtTmp58;
        int mtTmp57;
        int mtTmp59;
        boolean mtTmp60;
        int mtTmp61;
        int mtTmp62;
        int mtTmp63;
        int mtTmp64;
        BS mtTmp66;
        boolean mtTmp65;
        boolean mtTmp67;
        boolean mtTmp68;
        boolean mtTmp69;
        boolean mtTmp70;
        int mtTmp71;
        BS mtTmp73;
        boolean mtTmp72;
        boolean mtTmp74;
        boolean mtTmp75;
        mtTmp49 = 0;
        aux01 = mtTmp49;
        mtTmp50 = false;
        bs01 = mtTmp50;
        mtTmp51 = number.length;
        right = mtTmp51;
        mtTmp53 = 1;
        mtTmp52 = right - mtTmp53;
        right = mtTmp52;
        mtTmp54 = 0;
        left = mtTmp54;
        mtTmp55 = true;
        var_cont = mtTmp55;
        while(var_cont) {
            {
            mtTmp56 = left + right;
            medium = mtTmp56;
            mtTmp58 = this;
            mtTmp57 = mtTmp58.Div(medium);
            medium = mtTmp57;
            mtTmp59 = number[medium];
            aux01 = mtTmp59;
            mtTmp60 = num < aux01;
            if(mtTmp60) {
                mtTmp62 = 1;
                mtTmp61 = medium - mtTmp62;
                right = mtTmp61;
            } else {
                mtTmp64 = 1;
                mtTmp63 = medium + mtTmp64;
                left = mtTmp63;
            }
            mtTmp66 = this;
            mtTmp65 = mtTmp66.Compare(aux01,num);
            if(mtTmp65) {
                mtTmp67 = false;
                var_cont = mtTmp67;
            } else {
                mtTmp68 = true;
                var_cont = mtTmp68;
            }
            mtTmp69 = right < left;
            if(mtTmp69) {
                mtTmp70 = false;
                var_cont = mtTmp70;
            } else {
                mtTmp71 = 0;
                nt = mtTmp71;
            }
            }
                    }
        mtTmp73 = this;
        mtTmp72 = mtTmp73.Compare(aux01,num);
        if(mtTmp72) {
            mtTmp74 = true;
            bs01 = mtTmp74;
        } else {
            mtTmp75 = false;
            bs01 = mtTmp75;
        }
        return bs01;
    }
    public int Div(int num) {
        int count01;
        int count02;
        int aux03;
        int mtTmp76;
        int mtTmp77;
        int mtTmp78;
        int mtTmp79;
        boolean mtTmp80;
        int mtTmp81;
        int mtTmp82;
        int mtTmp83;
        int mtTmp84;
        mtTmp76 = 0;
        count01 = mtTmp76;
        mtTmp77 = 0;
        count02 = mtTmp77;
        mtTmp79 = 1;
        mtTmp78 = num - mtTmp79;
        aux03 = mtTmp78;
        mtTmp80 = count02 < aux03;
        while(mtTmp80) {
            {
            mtTmp82 = 1;
            mtTmp81 = count01 + mtTmp82;
            count01 = mtTmp81;
            mtTmp84 = 2;
            mtTmp83 = count02 + mtTmp84;
            count02 = mtTmp83;
            }
            mtTmp80 = count02 < aux03;
        }
        return count01;
    }
    public boolean Compare(int num1, int num2) {
        boolean  retval;
        int aux02;
        boolean mtTmp85;
        int mtTmp86;
        int mtTmp87;
        boolean mtTmp88;
        boolean mtTmp89;
        boolean mtTmp90;
        boolean mtTmp91;
        boolean mtTmp92;
        boolean mtTmp93;
        mtTmp85 = false;
        retval = mtTmp85;
        mtTmp87 = 1;
        mtTmp86 = num2 + mtTmp87;
        aux02 = mtTmp86;
        mtTmp88 = num1 < num2;
        if(mtTmp88) {
            mtTmp89 = false;
            retval = mtTmp89;
        } else {
            mtTmp91 = num1 < aux02;
            mtTmp90 = !mtTmp91;
            if(mtTmp90) {
                mtTmp92 = false;
                retval = mtTmp92;
            } else {
                mtTmp93 = true;
                retval = mtTmp93;
            }
        }
        return retval;
    }
    public int Print() {
        int j;
        int mtTmp94;
        boolean mtTmp95;
        int mtTmp96;
        int mtTmp97;
        int mtTmp98;
        int mtTmp99;
        int mtTmp100;
        int mtTmp101;
        mtTmp94 = 1;
        j = mtTmp94;
        mtTmp96 = size;
        mtTmp95 = j < mtTmp96;
        while(mtTmp95) {
            {
            mtTmp97 = number[j];
            System.out.println(mtTmp97);
            mtTmp99 = 1;
            mtTmp98 = j + mtTmp99;
            j = mtTmp98;
            }
            mtTmp96 = size;
mtTmp95 = j < mtTmp96;
        }
        mtTmp100 = 99999;
        System.out.println(mtTmp100);
        mtTmp101 = 0;
        return mtTmp101;
    }
    public int Init(int sz) {
        int j;
        int k;
        int aux02;
        int aux01;
        int[] mtTmp102;
        int mtTmp103;
        int mtTmp104;
        int mtTmp105;
        boolean mtTmp106;
        int mtTmp107;
        int mtTmp108;
        int mtTmp109;
        int mtTmp110;
        int mtTmp111;
        int mtTmp112;
        int mtTmp113;
        int mtTmp114;
        int mtTmp115;
        int mtTmp116;
        int mtTmp117;
        size = sz;
        mtTmp102 = new int[sz];
        number = mtTmp102;
        mtTmp103 = 1;
        j = mtTmp103;
        mtTmp105 = 1;
        mtTmp104 = size + mtTmp105;
        k = mtTmp104;
        mtTmp107 = size;
        mtTmp106 = j < mtTmp107;
        while(mtTmp106) {
            {
            mtTmp109 = 2;
            mtTmp108 = mtTmp109 * j;
            aux01 = mtTmp108;
            mtTmp111 = 3;
            mtTmp110 = k - mtTmp111;
            aux02 = mtTmp110;
            mtTmp112 = aux01 + aux02;
            number[j] = mtTmp112;
            mtTmp114 = 1;
            mtTmp113 = j + mtTmp114;
            j = mtTmp113;
            mtTmp116 = 1;
            mtTmp115 = k - mtTmp116;
            k = mtTmp115;
            }
            mtTmp107 = size;
mtTmp106 = j < mtTmp107;
        }
        mtTmp117 = 0;
        return mtTmp117;
    }
}
