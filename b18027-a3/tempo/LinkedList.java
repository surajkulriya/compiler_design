class LinkedList {
    public static void main(String[] a) {
        LL mtTmp2;
        int mtTmp1;
        mtTmp2 = new LL();
        mtTmp1 = mtTmp2.Start();
        System.out.println(mtTmp1);
    }
}
class Element {
    int Age;
    int Salary;
    boolean  Married;
    public boolean Init(int v_Age, int v_Salary, boolean v_Married) {
        boolean mtTmp3;
        Age = v_Age;
        Salary = v_Salary;
        Married = v_Married;
        mtTmp3 = true;
        return mtTmp3;
    }
    public int GetAge() {
        return Age;
    }
    public int GetSalary() {
        return Salary;
    }
    public boolean GetMarried() {
        return Married;
    }
    public boolean Equal(Element other) {
        boolean  ret_val;
        int aux01;
        int aux02;
        int nt;
        boolean mtTmp4;
        int mtTmp5;
        boolean mtTmp6;
        Element mtTmp8;
        boolean mtTmp7;
        boolean mtTmp9;
        int mtTmp10;
        boolean mtTmp11;
        Element mtTmp13;
        boolean mtTmp12;
        boolean mtTmp14;
        boolean mtTmp15;
        boolean mtTmp16;
        boolean mtTmp17;
        int mtTmp18;
        boolean mtTmp19;
        boolean mtTmp20;
        int mtTmp21;
        mtTmp4 = true;
        ret_val = mtTmp4;
        mtTmp5 = other.GetAge();
        aux01 = mtTmp5;
        mtTmp8 = this;
        mtTmp7 = mtTmp8.Compare(aux01,Age);
        mtTmp6 = !mtTmp7;
        if(mtTmp6) {
            mtTmp9 = false;
            ret_val = mtTmp9;
        } else {
            {
            mtTmp10 = other.GetSalary();
            aux02 = mtTmp10;
            mtTmp13 = this;
            mtTmp12 = mtTmp13.Compare(aux02,Salary);
            mtTmp11 = !mtTmp12;
            if(mtTmp11) {
                mtTmp14 = false;
                ret_val = mtTmp14;
            } else {
                if(Married) {
                    mtTmp16 = other.GetMarried();
                    mtTmp15 = !mtTmp16;
                    if(mtTmp15) {
                        mtTmp17 = false;
                        ret_val = mtTmp17;
                    } else {
                        mtTmp18 = 0;
                        nt = mtTmp18;
                    }
                } else {
                    mtTmp19 = other.GetMarried();
                    if(mtTmp19) {
                        mtTmp20 = false;
                        ret_val = mtTmp20;
                    } else {
                        mtTmp21 = 0;
                        nt = mtTmp21;
                    }
                }
            }
            }
        }
        return ret_val;
    }
    public boolean Compare(int num1, int num2) {
        boolean  retval;
        int aux02;
        boolean mtTmp22;
        int mtTmp23;
        int mtTmp24;
        boolean mtTmp25;
        boolean mtTmp26;
        boolean mtTmp27;
        boolean mtTmp28;
        boolean mtTmp29;
        boolean mtTmp30;
        mtTmp22 = false;
        retval = mtTmp22;
        mtTmp24 = 1;
        mtTmp23 = num2 + mtTmp24;
        aux02 = mtTmp23;
        mtTmp25 = num1 < num2;
        if(mtTmp25) {
            mtTmp26 = false;
            retval = mtTmp26;
        } else {
            mtTmp28 = num1 < aux02;
            mtTmp27 = !mtTmp28;
            if(mtTmp27) {
                mtTmp29 = false;
                retval = mtTmp29;
            } else {
                mtTmp30 = true;
                retval = mtTmp30;
            }
        }
        return retval;
    }
}
class List {
    Element elem;
    List next;
    boolean  end;
    public boolean Init() {
        boolean mtTmp31;
        boolean mtTmp32;
        mtTmp31 = true;
        end = mtTmp31;
        mtTmp32 = true;
        return mtTmp32;
    }
    public boolean InitNew(Element v_elem, List v_next, boolean v_end) {
        boolean mtTmp33;
        end = v_end;
        elem = v_elem;
        next = v_next;
        mtTmp33 = true;
        return mtTmp33;
    }
    public List Insert(Element new_elem) {
        boolean  ret_val;
        List aux03;
        List aux02;
        List mtTmp34;
        List mtTmp35;
        boolean mtTmp37;
        boolean mtTmp36;
        mtTmp34 = this;
        aux03 = mtTmp34;
        mtTmp35 = new List();
        aux02 = mtTmp35;
        mtTmp37 = false;
        mtTmp36 = aux02.InitNew(new_elem,aux03,mtTmp37);
        ret_val = mtTmp36;
        return aux02;
    }
    public boolean SetNext(List v_next) {
        boolean mtTmp38;
        next = v_next;
        mtTmp38 = true;
        return mtTmp38;
    }
    public List Delete(Element e) {
        List my_head;
        boolean  ret_val;
        boolean  aux05;
        List aux01;
        List prev;
        boolean  var_end;
        Element var_elem;
        int aux04;
        int nt;
        List mtTmp39;
        boolean mtTmp40;
        int mtTmp41;
        int mtTmp42;
        int mtTmp43;
        List mtTmp44;
        List mtTmp45;
        boolean mtTmp46;
        boolean mtTmp47;
        boolean mtTmp48;
        boolean mtTmp49;
        boolean mtTmp50;
        boolean mtTmp51;
        int mtTmp52;
        List mtTmp53;
        int mtTmp54;
        int mtTmp55;
        int mtTmp56;
        List mtTmp58;
        boolean mtTmp57;
        int mtTmp59;
        int mtTmp60;
        int mtTmp61;
        int mtTmp62;
        boolean mtTmp63;
        List mtTmp64;
        boolean mtTmp65;
        Element mtTmp66;
        int mtTmp67;
        int mtTmp68;
        mtTmp39 = this;
        my_head = mtTmp39;
        mtTmp40 = false;
        ret_val = mtTmp40;
        mtTmp42 = 0;
        mtTmp43 = 1;
        mtTmp41 = mtTmp42 - mtTmp43;
        aux04 = mtTmp41;
        mtTmp44 = this;
        aux01 = mtTmp44;
        mtTmp45 = this;
        prev = mtTmp45;
        var_end = end;
        var_elem = elem;
        mtTmp47 = !var_end;
        mtTmp48 = !ret_val;
        mtTmp46 = mtTmp47 && mtTmp48;
        while(mtTmp46) {
            {
            mtTmp49 = e.Equal(var_elem);
            if(mtTmp49) {
                {
                mtTmp50 = true;
                ret_val = mtTmp50;
                mtTmp52 = 0;
                mtTmp51 = aux04 < mtTmp52;
                if(mtTmp51) {
                    {
                    mtTmp53 = aux01.GetNext();
                    my_head = mtTmp53;
                    }
                } else {
                    {
                    mtTmp55 = 0;
                    mtTmp56 = 555;
                    mtTmp54 = mtTmp55 - mtTmp56;
                    System.out.println(mtTmp54);
                    mtTmp58 = aux01.GetNext();
                    mtTmp57 = prev.SetNext(mtTmp58);
                    aux05 = mtTmp57;
                    mtTmp60 = 0;
                    mtTmp61 = 555;
                    mtTmp59 = mtTmp60 - mtTmp61;
                    System.out.println(mtTmp59);
                    }
                }
                }
            } else {
                mtTmp62 = 0;
                nt = mtTmp62;
            }
            mtTmp63 = !ret_val;
            if(mtTmp63) {
                {
                prev = aux01;
                mtTmp64 = aux01.GetNext();
                aux01 = mtTmp64;
                mtTmp65 = aux01.GetEnd();
                var_end = mtTmp65;
                mtTmp66 = aux01.GetElem();
                var_elem = mtTmp66;
                mtTmp67 = 1;
                aux04 = mtTmp67;
                }
            } else {
                mtTmp68 = 0;
                nt = mtTmp68;
            }
            }
            mtTmp47 = !var_end;
mtTmp48 = !ret_val;
mtTmp46 = mtTmp47 && mtTmp48;
        }
        return my_head;
    }
    public int Search(Element e) {
        int int_ret_val;
        List aux01;
        Element var_elem;
        boolean  var_end;
        int nt;
        int mtTmp69;
        List mtTmp70;
        boolean mtTmp71;
        boolean mtTmp72;
        int mtTmp73;
        int mtTmp74;
        List mtTmp75;
        boolean mtTmp76;
        Element mtTmp77;
        mtTmp69 = 0;
        int_ret_val = mtTmp69;
        mtTmp70 = this;
        aux01 = mtTmp70;
        var_end = end;
        var_elem = elem;
        mtTmp71 = !var_end;
        while(mtTmp71) {
            {
            mtTmp72 = e.Equal(var_elem);
            if(mtTmp72) {
                {
                mtTmp73 = 1;
                int_ret_val = mtTmp73;
                }
            } else {
                mtTmp74 = 0;
                nt = mtTmp74;
            }
            mtTmp75 = aux01.GetNext();
            aux01 = mtTmp75;
            mtTmp76 = aux01.GetEnd();
            var_end = mtTmp76;
            mtTmp77 = aux01.GetElem();
            var_elem = mtTmp77;
            }
            mtTmp71 = !var_end;
        }
        return int_ret_val;
    }
    public boolean GetEnd() {
        return end;
    }
    public Element GetElem() {
        return elem;
    }
    public List GetNext() {
        return next;
    }
    public boolean Print() {
        List aux01;
        boolean  var_end;
        Element var_elem;
        List mtTmp78;
        boolean mtTmp79;
        int mtTmp80;
        List mtTmp81;
        boolean mtTmp82;
        Element mtTmp83;
        boolean mtTmp84;
        mtTmp78 = this;
        aux01 = mtTmp78;
        var_end = end;
        var_elem = elem;
        mtTmp79 = !var_end;
        while(mtTmp79) {
            {
            mtTmp80 = var_elem.GetAge();
            System.out.println(mtTmp80);
            mtTmp81 = aux01.GetNext();
            aux01 = mtTmp81;
            mtTmp82 = aux01.GetEnd();
            var_end = mtTmp82;
            mtTmp83 = aux01.GetElem();
            var_elem = mtTmp83;
            }
            mtTmp79 = !var_end;
        }
        mtTmp84 = true;
        return mtTmp84;
    }
}
class LL {
    public int Start() {
        List head;
        List last_elem;
        boolean  aux01;
        Element el01;
        Element el02;
        Element el03;
        List mtTmp85;
        boolean mtTmp86;
        boolean mtTmp87;
        boolean mtTmp88;
        Element mtTmp89;
        int mtTmp91;
        int mtTmp92;
        boolean mtTmp93;
        boolean mtTmp90;
        List mtTmp94;
        boolean mtTmp95;
        int mtTmp96;
        Element mtTmp97;
        int mtTmp99;
        int mtTmp100;
        boolean mtTmp101;
        boolean mtTmp98;
        List mtTmp102;
        boolean mtTmp103;
        int mtTmp104;
        Element mtTmp105;
        int mtTmp107;
        int mtTmp108;
        boolean mtTmp109;
        boolean mtTmp106;
        List mtTmp110;
        boolean mtTmp111;
        Element mtTmp112;
        int mtTmp114;
        int mtTmp115;
        boolean mtTmp116;
        boolean mtTmp113;
        int mtTmp117;
        int mtTmp118;
        int mtTmp119;
        Element mtTmp120;
        int mtTmp122;
        int mtTmp123;
        boolean mtTmp124;
        boolean mtTmp121;
        List mtTmp125;
        boolean mtTmp126;
        int mtTmp127;
        List mtTmp128;
        boolean mtTmp129;
        int mtTmp130;
        List mtTmp131;
        boolean mtTmp132;
        int mtTmp133;
        int mtTmp134;
        mtTmp85 = new List();
        last_elem = mtTmp85;
        mtTmp86 = last_elem.Init();
        aux01 = mtTmp86;
        head = last_elem;
        mtTmp87 = head.Init();
        aux01 = mtTmp87;
        mtTmp88 = head.Print();
        aux01 = mtTmp88;
        mtTmp89 = new Element();
        el01 = mtTmp89;
        mtTmp91 = 25;
        mtTmp92 = 37000;
        mtTmp93 = false;
        mtTmp90 = el01.Init(mtTmp91,mtTmp92,mtTmp93);
        aux01 = mtTmp90;
        mtTmp94 = head.Insert(el01);
        head = mtTmp94;
        mtTmp95 = head.Print();
        aux01 = mtTmp95;
        mtTmp96 = 10000000;
        System.out.println(mtTmp96);
        mtTmp97 = new Element();
        el01 = mtTmp97;
        mtTmp99 = 39;
        mtTmp100 = 42000;
        mtTmp101 = true;
        mtTmp98 = el01.Init(mtTmp99,mtTmp100,mtTmp101);
        aux01 = mtTmp98;
        el02 = el01;
        mtTmp102 = head.Insert(el01);
        head = mtTmp102;
        mtTmp103 = head.Print();
        aux01 = mtTmp103;
        mtTmp104 = 10000000;
        System.out.println(mtTmp104);
        mtTmp105 = new Element();
        el01 = mtTmp105;
        mtTmp107 = 22;
        mtTmp108 = 34000;
        mtTmp109 = false;
        mtTmp106 = el01.Init(mtTmp107,mtTmp108,mtTmp109);
        aux01 = mtTmp106;
        mtTmp110 = head.Insert(el01);
        head = mtTmp110;
        mtTmp111 = head.Print();
        aux01 = mtTmp111;
        mtTmp112 = new Element();
        el03 = mtTmp112;
        mtTmp114 = 27;
        mtTmp115 = 34000;
        mtTmp116 = false;
        mtTmp113 = el03.Init(mtTmp114,mtTmp115,mtTmp116);
        aux01 = mtTmp113;
        mtTmp117 = head.Search(el02);
        System.out.println(mtTmp117);
        mtTmp118 = head.Search(el03);
        System.out.println(mtTmp118);
        mtTmp119 = 10000000;
        System.out.println(mtTmp119);
        mtTmp120 = new Element();
        el01 = mtTmp120;
        mtTmp122 = 28;
        mtTmp123 = 35000;
        mtTmp124 = false;
        mtTmp121 = el01.Init(mtTmp122,mtTmp123,mtTmp124);
        aux01 = mtTmp121;
        mtTmp125 = head.Insert(el01);
        head = mtTmp125;
        mtTmp126 = head.Print();
        aux01 = mtTmp126;
        mtTmp127 = 2220000;
        System.out.println(mtTmp127);
        mtTmp128 = head.Delete(el02);
        head = mtTmp128;
        mtTmp129 = head.Print();
        aux01 = mtTmp129;
        mtTmp130 = 33300000;
        System.out.println(mtTmp130);
        mtTmp131 = head.Delete(el01);
        head = mtTmp131;
        mtTmp132 = head.Print();
        aux01 = mtTmp132;
        mtTmp133 = 44440000;
        System.out.println(mtTmp133);
        mtTmp134 = 0;
        return mtTmp134;
    }
}
