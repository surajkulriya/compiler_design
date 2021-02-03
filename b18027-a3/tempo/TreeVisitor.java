class TreeVisitor {
    public static void main(String[] a) {
        TV mtTmp2;
        int mtTmp1;
        mtTmp2 = new TV();
        mtTmp1 = mtTmp2.Start();
        System.out.println(mtTmp1);
    }
}
class TV {
    public int Start() {
        Tree root;
        boolean  ntb;
        int nti;
        MyVisitor v;
        Tree mtTmp3;
        int mtTmp5;
        boolean mtTmp4;
        boolean mtTmp6;
        int mtTmp7;
        int mtTmp9;
        boolean mtTmp8;
        int mtTmp11;
        boolean mtTmp10;
        int mtTmp13;
        boolean mtTmp12;
        int mtTmp15;
        boolean mtTmp14;
        int mtTmp17;
        boolean mtTmp16;
        int mtTmp19;
        boolean mtTmp18;
        int mtTmp21;
        boolean mtTmp20;
        boolean mtTmp22;
        int mtTmp23;
        MyVisitor mtTmp24;
        int mtTmp25;
        int mtTmp26;
        int mtTmp27;
        int mtTmp29;
        int mtTmp28;
        int mtTmp31;
        int mtTmp30;
        int mtTmp33;
        int mtTmp32;
        int mtTmp35;
        int mtTmp34;
        int mtTmp37;
        int mtTmp36;
        int mtTmp39;
        boolean mtTmp38;
        boolean mtTmp40;
        int mtTmp42;
        int mtTmp41;
        int mtTmp43;
        mtTmp3 = new Tree();
        root = mtTmp3;
        mtTmp5 = 16;
        mtTmp4 = root.Init(mtTmp5);
        ntb = mtTmp4;
        mtTmp6 = root.Print();
        ntb = mtTmp6;
        mtTmp7 = 100000000;
        System.out.println(mtTmp7);
        mtTmp9 = 8;
        mtTmp8 = root.Insert(mtTmp9);
        ntb = mtTmp8;
        mtTmp11 = 24;
        mtTmp10 = root.Insert(mtTmp11);
        ntb = mtTmp10;
        mtTmp13 = 4;
        mtTmp12 = root.Insert(mtTmp13);
        ntb = mtTmp12;
        mtTmp15 = 12;
        mtTmp14 = root.Insert(mtTmp15);
        ntb = mtTmp14;
        mtTmp17 = 20;
        mtTmp16 = root.Insert(mtTmp17);
        ntb = mtTmp16;
        mtTmp19 = 28;
        mtTmp18 = root.Insert(mtTmp19);
        ntb = mtTmp18;
        mtTmp21 = 14;
        mtTmp20 = root.Insert(mtTmp21);
        ntb = mtTmp20;
        mtTmp22 = root.Print();
        ntb = mtTmp22;
        mtTmp23 = 100000000;
        System.out.println(mtTmp23);
        mtTmp24 = new MyVisitor();
        v = mtTmp24;
        mtTmp25 = 50000000;
        System.out.println(mtTmp25);
        mtTmp26 = root.accept(v);
        nti = mtTmp26;
        mtTmp27 = 100000000;
        System.out.println(mtTmp27);
        mtTmp29 = 24;
        mtTmp28 = root.Search(mtTmp29);
        System.out.println(mtTmp28);
        mtTmp31 = 12;
        mtTmp30 = root.Search(mtTmp31);
        System.out.println(mtTmp30);
        mtTmp33 = 16;
        mtTmp32 = root.Search(mtTmp33);
        System.out.println(mtTmp32);
        mtTmp35 = 50;
        mtTmp34 = root.Search(mtTmp35);
        System.out.println(mtTmp34);
        mtTmp37 = 12;
        mtTmp36 = root.Search(mtTmp37);
        System.out.println(mtTmp36);
        mtTmp39 = 12;
        mtTmp38 = root.Delete(mtTmp39);
        ntb = mtTmp38;
        mtTmp40 = root.Print();
        ntb = mtTmp40;
        mtTmp42 = 12;
        mtTmp41 = root.Search(mtTmp42);
        System.out.println(mtTmp41);
        mtTmp43 = 0;
        return mtTmp43;
    }
}
class Tree {
    Tree left;
    Tree right;
    int key;
    boolean  has_left;
    boolean  has_right;
    Tree my_null;
    public boolean Init(int v_key) {
        boolean mtTmp44;
        boolean mtTmp45;
        boolean mtTmp46;
        key = v_key;
        mtTmp44 = false;
        has_left = mtTmp44;
        mtTmp45 = false;
        has_right = mtTmp45;
        mtTmp46 = true;
        return mtTmp46;
    }
    public boolean SetRight(Tree rn) {
        boolean mtTmp47;
        right = rn;
        mtTmp47 = true;
        return mtTmp47;
    }
    public boolean SetLeft(Tree ln) {
        boolean mtTmp48;
        left = ln;
        mtTmp48 = true;
        return mtTmp48;
    }
    public Tree GetRight() {
        return right;
    }
    public Tree GetLeft() {
        return left;
    }
    public int GetKey() {
        return key;
    }
    public boolean SetKey(int v_key) {
        boolean mtTmp49;
        key = v_key;
        mtTmp49 = true;
        return mtTmp49;
    }
    public boolean GetHas_Right() {
        return has_right;
    }
    public boolean GetHas_Left() {
        return has_left;
    }
    public boolean SetHas_Left(boolean val) {
        boolean mtTmp50;
        has_left = val;
        mtTmp50 = true;
        return mtTmp50;
    }
    public boolean SetHas_Right(boolean val) {
        boolean mtTmp51;
        has_right = val;
        mtTmp51 = true;
        return mtTmp51;
    }
    public boolean Compare(int num1, int num2) {
        boolean  ntb;
        int nti;
        boolean mtTmp52;
        int mtTmp53;
        int mtTmp54;
        boolean mtTmp55;
        boolean mtTmp56;
        boolean mtTmp57;
        boolean mtTmp58;
        boolean mtTmp59;
        boolean mtTmp60;
        mtTmp52 = false;
        ntb = mtTmp52;
        mtTmp54 = 1;
        mtTmp53 = num2 + mtTmp54;
        nti = mtTmp53;
        mtTmp55 = num1 < num2;
        if(mtTmp55) {
            mtTmp56 = false;
            ntb = mtTmp56;
        } else {
            mtTmp58 = num1 < nti;
            mtTmp57 = !mtTmp58;
            if(mtTmp57) {
                mtTmp59 = false;
                ntb = mtTmp59;
            } else {
                mtTmp60 = true;
                ntb = mtTmp60;
            }
        }
        return ntb;
    }
    public boolean Insert(int v_key) {
        Tree new_node;
        boolean  ntb;
        Tree current_node;
        boolean  cont;
        int key_aux;
        Tree mtTmp61;
        boolean mtTmp62;
        Tree mtTmp63;
        boolean mtTmp64;
        int mtTmp65;
        boolean mtTmp66;
        boolean mtTmp67;
        Tree mtTmp68;
        boolean mtTmp69;
        boolean mtTmp71;
        boolean mtTmp70;
        boolean mtTmp72;
        boolean mtTmp73;
        Tree mtTmp74;
        boolean mtTmp75;
        boolean mtTmp77;
        boolean mtTmp76;
        boolean mtTmp78;
        boolean mtTmp79;
        mtTmp61 = new Tree();
        new_node = mtTmp61;
        mtTmp62 = new_node.Init(v_key);
        ntb = mtTmp62;
        mtTmp63 = this;
        current_node = mtTmp63;
        mtTmp64 = true;
        cont = mtTmp64;
        while(cont) {
            {
            mtTmp65 = current_node.GetKey();
            key_aux = mtTmp65;
            mtTmp66 = v_key < key_aux;
            if(mtTmp66) {
                {
                mtTmp67 = current_node.GetHas_Left();
                if(mtTmp67) {
                    mtTmp68 = current_node.GetLeft();
                    current_node = mtTmp68;
                } else {
                    {
                    mtTmp69 = false;
                    cont = mtTmp69;
                    mtTmp71 = true;
                    mtTmp70 = current_node.SetHas_Left(mtTmp71);
                    ntb = mtTmp70;
                    mtTmp72 = current_node.SetLeft(new_node);
                    ntb = mtTmp72;
                    }
                }
                }
            } else {
                {
                mtTmp73 = current_node.GetHas_Right();
                if(mtTmp73) {
                    mtTmp74 = current_node.GetRight();
                    current_node = mtTmp74;
                } else {
                    {
                    mtTmp75 = false;
                    cont = mtTmp75;
                    mtTmp77 = true;
                    mtTmp76 = current_node.SetHas_Right(mtTmp77);
                    ntb = mtTmp76;
                    mtTmp78 = current_node.SetRight(new_node);
                    ntb = mtTmp78;
                    }
                }
                }
            }
            }
                    }
        mtTmp79 = true;
        return mtTmp79;
    }
    public boolean Delete(int v_key) {
        Tree current_node;
        Tree parent_node;
        boolean  cont;
        boolean  found;
        boolean  ntb;
        boolean  is_root;
        int key_aux;
        Tree mtTmp80;
        Tree mtTmp81;
        boolean mtTmp82;
        boolean mtTmp83;
        boolean mtTmp84;
        int mtTmp85;
        boolean mtTmp86;
        boolean mtTmp87;
        Tree mtTmp88;
        boolean mtTmp89;
        boolean mtTmp90;
        boolean mtTmp91;
        Tree mtTmp92;
        boolean mtTmp93;
        boolean mtTmp94;
        boolean mtTmp95;
        boolean mtTmp96;
        boolean mtTmp97;
        boolean mtTmp98;
        boolean mtTmp99;
        Tree mtTmp101;
        boolean mtTmp100;
        Tree mtTmp103;
        boolean mtTmp102;
        boolean mtTmp104;
        boolean mtTmp105;
        boolean mtTmp106;
        mtTmp80 = this;
        current_node = mtTmp80;
        mtTmp81 = this;
        parent_node = mtTmp81;
        mtTmp82 = true;
        cont = mtTmp82;
        mtTmp83 = false;
        found = mtTmp83;
        mtTmp84 = true;
        is_root = mtTmp84;
        while(cont) {
            {
            mtTmp85 = current_node.GetKey();
            key_aux = mtTmp85;
            mtTmp86 = v_key < key_aux;
            if(mtTmp86) {
                mtTmp87 = current_node.GetHas_Left();
                if(mtTmp87) {
                    {
                    parent_node = current_node;
                    mtTmp88 = current_node.GetLeft();
                    current_node = mtTmp88;
                    }
                } else {
                    mtTmp89 = false;
                    cont = mtTmp89;
                }
            } else {
                mtTmp90 = key_aux < v_key;
                if(mtTmp90) {
                    mtTmp91 = current_node.GetHas_Right();
                    if(mtTmp91) {
                        {
                        parent_node = current_node;
                        mtTmp92 = current_node.GetRight();
                        current_node = mtTmp92;
                        }
                    } else {
                        mtTmp93 = false;
                        cont = mtTmp93;
                    }
                } else {
                    {
                    if(is_root) {
                        mtTmp96 = current_node.GetHas_Right();
                        mtTmp95 = !mtTmp96;
                        mtTmp98 = current_node.GetHas_Left();
                        mtTmp97 = !mtTmp98;
                        mtTmp94 = mtTmp95 && mtTmp97;
                        if(mtTmp94) {
                            mtTmp99 = true;
                            ntb = mtTmp99;
                        } else {
                            mtTmp101 = this;
                            mtTmp100 = mtTmp101.Remove(parent_node,current_node);
                            ntb = mtTmp100;
                        }
                    } else {
                        mtTmp103 = this;
                        mtTmp102 = mtTmp103.Remove(parent_node,current_node);
                        ntb = mtTmp102;
                    }
                    mtTmp104 = true;
                    found = mtTmp104;
                    mtTmp105 = false;
                    cont = mtTmp105;
                    }
                }
            }
            mtTmp106 = false;
            is_root = mtTmp106;
            }
                    }
        return found;
    }
    public boolean Remove(Tree p_node, Tree c_node) {
        boolean  ntb;
        int auxkey1;
        int auxkey2;
        boolean mtTmp107;
        Tree mtTmp109;
        boolean mtTmp108;
        boolean mtTmp110;
        Tree mtTmp112;
        boolean mtTmp111;
        int mtTmp113;
        Tree mtTmp115;
        int mtTmp114;
        Tree mtTmp117;
        boolean mtTmp116;
        boolean mtTmp118;
        boolean mtTmp120;
        boolean mtTmp119;
        boolean mtTmp121;
        boolean mtTmp123;
        boolean mtTmp122;
        boolean mtTmp124;
        mtTmp107 = c_node.GetHas_Left();
        if(mtTmp107) {
            mtTmp109 = this;
            mtTmp108 = mtTmp109.RemoveLeft(p_node,c_node);
            ntb = mtTmp108;
        } else {
            mtTmp110 = c_node.GetHas_Right();
            if(mtTmp110) {
                mtTmp112 = this;
                mtTmp111 = mtTmp112.RemoveRight(p_node,c_node);
                ntb = mtTmp111;
            } else {
                {
                mtTmp113 = c_node.GetKey();
                auxkey1 = mtTmp113;
                mtTmp115 = p_node.GetLeft();
                mtTmp114 = mtTmp115.GetKey();
                auxkey2 = mtTmp114;
                mtTmp117 = this;
                mtTmp116 = mtTmp117.Compare(auxkey1,auxkey2);
                if(mtTmp116) {
                    {
                    mtTmp118 = p_node.SetLeft(my_null);
                    ntb = mtTmp118;
                    mtTmp120 = false;
                    mtTmp119 = p_node.SetHas_Left(mtTmp120);
                    ntb = mtTmp119;
                    }
                } else {
                    {
                    mtTmp121 = p_node.SetRight(my_null);
                    ntb = mtTmp121;
                    mtTmp123 = false;
                    mtTmp122 = p_node.SetHas_Right(mtTmp123);
                    ntb = mtTmp122;
                    }
                }
                }
            }
        }
        mtTmp124 = true;
        return mtTmp124;
    }
    public boolean RemoveRight(Tree p_node, Tree c_node) {
        boolean  ntb;
        boolean mtTmp125;
        Tree mtTmp128;
        int mtTmp127;
        boolean mtTmp126;
        Tree mtTmp129;
        boolean mtTmp130;
        boolean mtTmp132;
        boolean mtTmp131;
        boolean mtTmp133;
        mtTmp125 = c_node.GetHas_Right();
        while(mtTmp125) {
            {
            mtTmp128 = c_node.GetRight();
            mtTmp127 = mtTmp128.GetKey();
            mtTmp126 = c_node.SetKey(mtTmp127);
            ntb = mtTmp126;
            p_node = c_node;
            mtTmp129 = c_node.GetRight();
            c_node = mtTmp129;
            }
            mtTmp125 = c_node.GetHas_Right();
        }
        mtTmp130 = p_node.SetRight(my_null);
        ntb = mtTmp130;
        mtTmp132 = false;
        mtTmp131 = p_node.SetHas_Right(mtTmp132);
        ntb = mtTmp131;
        mtTmp133 = true;
        return mtTmp133;
    }
    public boolean RemoveLeft(Tree p_node, Tree c_node) {
        boolean  ntb;
        boolean mtTmp134;
        Tree mtTmp137;
        int mtTmp136;
        boolean mtTmp135;
        Tree mtTmp138;
        boolean mtTmp139;
        boolean mtTmp141;
        boolean mtTmp140;
        boolean mtTmp142;
        mtTmp134 = c_node.GetHas_Left();
        while(mtTmp134) {
            {
            mtTmp137 = c_node.GetLeft();
            mtTmp136 = mtTmp137.GetKey();
            mtTmp135 = c_node.SetKey(mtTmp136);
            ntb = mtTmp135;
            p_node = c_node;
            mtTmp138 = c_node.GetLeft();
            c_node = mtTmp138;
            }
            mtTmp134 = c_node.GetHas_Left();
        }
        mtTmp139 = p_node.SetLeft(my_null);
        ntb = mtTmp139;
        mtTmp141 = false;
        mtTmp140 = p_node.SetHas_Left(mtTmp141);
        ntb = mtTmp140;
        mtTmp142 = true;
        return mtTmp142;
    }
    public int Search(int v_key) {
        Tree current_node;
        int ifound;
        boolean  cont;
        int key_aux;
        Tree mtTmp143;
        boolean mtTmp144;
        int mtTmp145;
        int mtTmp146;
        boolean mtTmp147;
        boolean mtTmp148;
        Tree mtTmp149;
        boolean mtTmp150;
        boolean mtTmp151;
        boolean mtTmp152;
        Tree mtTmp153;
        boolean mtTmp154;
        int mtTmp155;
        boolean mtTmp156;
        mtTmp143 = this;
        current_node = mtTmp143;
        mtTmp144 = true;
        cont = mtTmp144;
        mtTmp145 = 0;
        ifound = mtTmp145;
        while(cont) {
            {
            mtTmp146 = current_node.GetKey();
            key_aux = mtTmp146;
            mtTmp147 = v_key < key_aux;
            if(mtTmp147) {
                mtTmp148 = current_node.GetHas_Left();
                if(mtTmp148) {
                    mtTmp149 = current_node.GetLeft();
                    current_node = mtTmp149;
                } else {
                    mtTmp150 = false;
                    cont = mtTmp150;
                }
            } else {
                mtTmp151 = key_aux < v_key;
                if(mtTmp151) {
                    mtTmp152 = current_node.GetHas_Right();
                    if(mtTmp152) {
                        mtTmp153 = current_node.GetRight();
                        current_node = mtTmp153;
                    } else {
                        mtTmp154 = false;
                        cont = mtTmp154;
                    }
                } else {
                    {
                    mtTmp155 = 1;
                    ifound = mtTmp155;
                    mtTmp156 = false;
                    cont = mtTmp156;
                    }
                }
            }
            }
                    }
        return ifound;
    }
    public boolean Print() {
        boolean  ntb;
        Tree current_node;
        Tree mtTmp157;
        Tree mtTmp159;
        boolean mtTmp158;
        boolean mtTmp160;
        mtTmp157 = this;
        current_node = mtTmp157;
        mtTmp159 = this;
        mtTmp158 = mtTmp159.RecPrint(current_node);
        ntb = mtTmp158;
        mtTmp160 = true;
        return mtTmp160;
    }
    public boolean RecPrint(Tree node) {
        boolean  ntb;
        boolean mtTmp161;
        Tree mtTmp163;
        Tree mtTmp164;
        boolean mtTmp162;
        boolean mtTmp165;
        int mtTmp166;
        boolean mtTmp167;
        Tree mtTmp169;
        Tree mtTmp170;
        boolean mtTmp168;
        boolean mtTmp171;
        boolean mtTmp172;
        mtTmp161 = node.GetHas_Left();
        if(mtTmp161) {
            {
            mtTmp163 = this;
            mtTmp164 = node.GetLeft();
            mtTmp162 = mtTmp163.RecPrint(mtTmp164);
            ntb = mtTmp162;
            }
        } else {
            mtTmp165 = true;
            ntb = mtTmp165;
        }
        mtTmp166 = node.GetKey();
        System.out.println(mtTmp166);
        mtTmp167 = node.GetHas_Right();
        if(mtTmp167) {
            {
            mtTmp169 = this;
            mtTmp170 = node.GetRight();
            mtTmp168 = mtTmp169.RecPrint(mtTmp170);
            ntb = mtTmp168;
            }
        } else {
            mtTmp171 = true;
            ntb = mtTmp171;
        }
        mtTmp172 = true;
        return mtTmp172;
    }
    public int accept(Visitor v) {
        int nti;
        int mtTmp173;
        Tree mtTmp175;
        int mtTmp174;
        int mtTmp176;
        mtTmp173 = 333;
        System.out.println(mtTmp173);
        mtTmp175 = this;
        mtTmp174 = v.visit(mtTmp175);
        nti = mtTmp174;
        mtTmp176 = 0;
        return mtTmp176;
    }
}
class Visitor {
    Tree l;
    Tree r;
    public int visit(Tree n) {
        int nti;
        boolean mtTmp177;
        Tree mtTmp178;
        Visitor mtTmp180;
        int mtTmp179;
        int mtTmp181;
        boolean mtTmp182;
        Tree mtTmp183;
        Visitor mtTmp185;
        int mtTmp184;
        int mtTmp186;
        int mtTmp187;
        mtTmp177 = n.GetHas_Right();
        if(mtTmp177) {
            {
            mtTmp178 = n.GetRight();
            r = mtTmp178;
            mtTmp180 = this;
            mtTmp179 = r.accept(mtTmp180);
            nti = mtTmp179;
            }
        } else {
            mtTmp181 = 0;
            nti = mtTmp181;
        }
        mtTmp182 = n.GetHas_Left();
        if(mtTmp182) {
            {
            mtTmp183 = n.GetLeft();
            l = mtTmp183;
            mtTmp185 = this;
            mtTmp184 = l.accept(mtTmp185);
            nti = mtTmp184;
            }
        } else {
            mtTmp186 = 0;
            nti = mtTmp186;
        }
        mtTmp187 = 0;
        return mtTmp187;
    }
}
class MyVisitor extends Visitor {
    public int visit(Tree n) {
        int nti;
        boolean mtTmp188;
        Tree mtTmp189;
        MyVisitor mtTmp191;
        int mtTmp190;
        int mtTmp192;
        int mtTmp193;
        boolean mtTmp194;
        Tree mtTmp195;
        MyVisitor mtTmp197;
        int mtTmp196;
        int mtTmp198;
        int mtTmp199;
        mtTmp188 = n.GetHas_Right();
        if(mtTmp188) {
            {
            mtTmp189 = n.GetRight();
            r = mtTmp189;
            mtTmp191 = this;
            mtTmp190 = r.accept(mtTmp191);
            nti = mtTmp190;
            }
        } else {
            mtTmp192 = 0;
            nti = mtTmp192;
        }
        mtTmp193 = n.GetKey();
        System.out.println(mtTmp193);
        mtTmp194 = n.GetHas_Left();
        if(mtTmp194) {
            {
            mtTmp195 = n.GetLeft();
            l = mtTmp195;
            mtTmp197 = this;
            mtTmp196 = l.accept(mtTmp197);
            nti = mtTmp196;
            }
        } else {
            mtTmp198 = 0;
            nti = mtTmp198;
        }
        mtTmp199 = 0;
        return mtTmp199;
    }
}
