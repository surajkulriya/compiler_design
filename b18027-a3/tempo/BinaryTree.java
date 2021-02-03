class BinaryTree {
    public static void main(String[] a) {
        BT mtTmp2;
        int mtTmp1;
        mtTmp2 = new BT();
        mtTmp1 = mtTmp2.Start();
        System.out.println(mtTmp1);
    }
}
class BT {
    public int Start() {
        Tree root;
        boolean  ntb;
        int nti;
        Tree mtTmp3;
        int mtTmp5;
        boolean mtTmp4;
        boolean mtTmp6;
        int mtTmp7;
        int mtTmp9;
        boolean mtTmp8;
        boolean mtTmp10;
        int mtTmp12;
        boolean mtTmp11;
        int mtTmp14;
        boolean mtTmp13;
        int mtTmp16;
        boolean mtTmp15;
        int mtTmp18;
        boolean mtTmp17;
        int mtTmp20;
        boolean mtTmp19;
        int mtTmp22;
        boolean mtTmp21;
        boolean mtTmp23;
        int mtTmp25;
        int mtTmp24;
        int mtTmp27;
        int mtTmp26;
        int mtTmp29;
        int mtTmp28;
        int mtTmp31;
        int mtTmp30;
        int mtTmp33;
        int mtTmp32;
        int mtTmp35;
        boolean mtTmp34;
        boolean mtTmp36;
        int mtTmp38;
        int mtTmp37;
        int mtTmp39;
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
        mtTmp10 = root.Print();
        ntb = mtTmp10;
        mtTmp12 = 24;
        mtTmp11 = root.Insert(mtTmp12);
        ntb = mtTmp11;
        mtTmp14 = 4;
        mtTmp13 = root.Insert(mtTmp14);
        ntb = mtTmp13;
        mtTmp16 = 12;
        mtTmp15 = root.Insert(mtTmp16);
        ntb = mtTmp15;
        mtTmp18 = 20;
        mtTmp17 = root.Insert(mtTmp18);
        ntb = mtTmp17;
        mtTmp20 = 28;
        mtTmp19 = root.Insert(mtTmp20);
        ntb = mtTmp19;
        mtTmp22 = 14;
        mtTmp21 = root.Insert(mtTmp22);
        ntb = mtTmp21;
        mtTmp23 = root.Print();
        ntb = mtTmp23;
        mtTmp25 = 24;
        mtTmp24 = root.Search(mtTmp25);
        System.out.println(mtTmp24);
        mtTmp27 = 12;
        mtTmp26 = root.Search(mtTmp27);
        System.out.println(mtTmp26);
        mtTmp29 = 16;
        mtTmp28 = root.Search(mtTmp29);
        System.out.println(mtTmp28);
        mtTmp31 = 50;
        mtTmp30 = root.Search(mtTmp31);
        System.out.println(mtTmp30);
        mtTmp33 = 12;
        mtTmp32 = root.Search(mtTmp33);
        System.out.println(mtTmp32);
        mtTmp35 = 12;
        mtTmp34 = root.Delete(mtTmp35);
        ntb = mtTmp34;
        mtTmp36 = root.Print();
        ntb = mtTmp36;
        mtTmp38 = 12;
        mtTmp37 = root.Search(mtTmp38);
        System.out.println(mtTmp37);
        mtTmp39 = 0;
        return mtTmp39;
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
        boolean mtTmp40;
        boolean mtTmp41;
        boolean mtTmp42;
        key = v_key;
        mtTmp40 = false;
        has_left = mtTmp40;
        mtTmp41 = false;
        has_right = mtTmp41;
        mtTmp42 = true;
        return mtTmp42;
    }
    public boolean SetRight(Tree rn) {
        boolean mtTmp43;
        right = rn;
        mtTmp43 = true;
        return mtTmp43;
    }
    public boolean SetLeft(Tree ln) {
        boolean mtTmp44;
        left = ln;
        mtTmp44 = true;
        return mtTmp44;
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
        boolean mtTmp45;
        key = v_key;
        mtTmp45 = true;
        return mtTmp45;
    }
    public boolean GetHas_Right() {
        return has_right;
    }
    public boolean GetHas_Left() {
        return has_left;
    }
    public boolean SetHas_Left(boolean val) {
        boolean mtTmp46;
        has_left = val;
        mtTmp46 = true;
        return mtTmp46;
    }
    public boolean SetHas_Right(boolean val) {
        boolean mtTmp47;
        has_right = val;
        mtTmp47 = true;
        return mtTmp47;
    }
    public boolean Compare(int num1, int num2) {
        boolean  ntb;
        int nti;
        boolean mtTmp48;
        int mtTmp49;
        int mtTmp50;
        boolean mtTmp51;
        boolean mtTmp52;
        boolean mtTmp53;
        boolean mtTmp54;
        boolean mtTmp55;
        boolean mtTmp56;
        mtTmp48 = false;
        ntb = mtTmp48;
        mtTmp50 = 1;
        mtTmp49 = num2 + mtTmp50;
        nti = mtTmp49;
        mtTmp51 = num1 < num2;
        if(mtTmp51) {
            mtTmp52 = false;
            ntb = mtTmp52;
        } else {
            mtTmp54 = num1 < nti;
            mtTmp53 = !mtTmp54;
            if(mtTmp53) {
                mtTmp55 = false;
                ntb = mtTmp55;
            } else {
                mtTmp56 = true;
                ntb = mtTmp56;
            }
        }
        return ntb;
    }
    public boolean Insert(int v_key) {
        Tree new_node;
        boolean  ntb;
        boolean  cont;
        int key_aux;
        Tree current_node;
        Tree mtTmp57;
        boolean mtTmp58;
        Tree mtTmp59;
        boolean mtTmp60;
        int mtTmp61;
        boolean mtTmp62;
        boolean mtTmp63;
        Tree mtTmp64;
        boolean mtTmp65;
        boolean mtTmp67;
        boolean mtTmp66;
        boolean mtTmp68;
        boolean mtTmp69;
        Tree mtTmp70;
        boolean mtTmp71;
        boolean mtTmp73;
        boolean mtTmp72;
        boolean mtTmp74;
        boolean mtTmp75;
        mtTmp57 = new Tree();
        new_node = mtTmp57;
        mtTmp58 = new_node.Init(v_key);
        ntb = mtTmp58;
        mtTmp59 = this;
        current_node = mtTmp59;
        mtTmp60 = true;
        cont = mtTmp60;
        while(cont) {
            {
            mtTmp61 = current_node.GetKey();
            key_aux = mtTmp61;
            mtTmp62 = v_key < key_aux;
            if(mtTmp62) {
                {
                mtTmp63 = current_node.GetHas_Left();
                if(mtTmp63) {
                    mtTmp64 = current_node.GetLeft();
                    current_node = mtTmp64;
                } else {
                    {
                    mtTmp65 = false;
                    cont = mtTmp65;
                    mtTmp67 = true;
                    mtTmp66 = current_node.SetHas_Left(mtTmp67);
                    ntb = mtTmp66;
                    mtTmp68 = current_node.SetLeft(new_node);
                    ntb = mtTmp68;
                    }
                }
                }
            } else {
                {
                mtTmp69 = current_node.GetHas_Right();
                if(mtTmp69) {
                    mtTmp70 = current_node.GetRight();
                    current_node = mtTmp70;
                } else {
                    {
                    mtTmp71 = false;
                    cont = mtTmp71;
                    mtTmp73 = true;
                    mtTmp72 = current_node.SetHas_Right(mtTmp73);
                    ntb = mtTmp72;
                    mtTmp74 = current_node.SetRight(new_node);
                    ntb = mtTmp74;
                    }
                }
                }
            }
            }
                    }
        mtTmp75 = true;
        return mtTmp75;
    }
    public boolean Delete(int v_key) {
        Tree current_node;
        Tree parent_node;
        boolean  cont;
        boolean  found;
        boolean  is_root;
        int key_aux;
        boolean  ntb;
        Tree mtTmp76;
        Tree mtTmp77;
        boolean mtTmp78;
        boolean mtTmp79;
        boolean mtTmp80;
        int mtTmp81;
        boolean mtTmp82;
        boolean mtTmp83;
        Tree mtTmp84;
        boolean mtTmp85;
        boolean mtTmp86;
        boolean mtTmp87;
        Tree mtTmp88;
        boolean mtTmp89;
        boolean mtTmp90;
        boolean mtTmp91;
        boolean mtTmp92;
        boolean mtTmp93;
        boolean mtTmp94;
        boolean mtTmp95;
        Tree mtTmp97;
        boolean mtTmp96;
        Tree mtTmp99;
        boolean mtTmp98;
        boolean mtTmp100;
        boolean mtTmp101;
        boolean mtTmp102;
        mtTmp76 = this;
        current_node = mtTmp76;
        mtTmp77 = this;
        parent_node = mtTmp77;
        mtTmp78 = true;
        cont = mtTmp78;
        mtTmp79 = false;
        found = mtTmp79;
        mtTmp80 = true;
        is_root = mtTmp80;
        while(cont) {
            {
            mtTmp81 = current_node.GetKey();
            key_aux = mtTmp81;
            mtTmp82 = v_key < key_aux;
            if(mtTmp82) {
                mtTmp83 = current_node.GetHas_Left();
                if(mtTmp83) {
                    {
                    parent_node = current_node;
                    mtTmp84 = current_node.GetLeft();
                    current_node = mtTmp84;
                    }
                } else {
                    mtTmp85 = false;
                    cont = mtTmp85;
                }
            } else {
                mtTmp86 = key_aux < v_key;
                if(mtTmp86) {
                    mtTmp87 = current_node.GetHas_Right();
                    if(mtTmp87) {
                        {
                        parent_node = current_node;
                        mtTmp88 = current_node.GetRight();
                        current_node = mtTmp88;
                        }
                    } else {
                        mtTmp89 = false;
                        cont = mtTmp89;
                    }
                } else {
                    {
                    if(is_root) {
                        mtTmp92 = current_node.GetHas_Right();
                        mtTmp91 = !mtTmp92;
                        mtTmp94 = current_node.GetHas_Left();
                        mtTmp93 = !mtTmp94;
                        mtTmp90 = mtTmp91 && mtTmp93;
                        if(mtTmp90) {
                            mtTmp95 = true;
                            ntb = mtTmp95;
                        } else {
                            mtTmp97 = this;
                            mtTmp96 = mtTmp97.Remove(parent_node,current_node);
                            ntb = mtTmp96;
                        }
                    } else {
                        mtTmp99 = this;
                        mtTmp98 = mtTmp99.Remove(parent_node,current_node);
                        ntb = mtTmp98;
                    }
                    mtTmp100 = true;
                    found = mtTmp100;
                    mtTmp101 = false;
                    cont = mtTmp101;
                    }
                }
            }
            mtTmp102 = false;
            is_root = mtTmp102;
            }
                    }
        return found;
    }
    public boolean Remove(Tree p_node, Tree c_node) {
        boolean  ntb;
        int auxkey1;
        int auxkey2;
        boolean mtTmp103;
        Tree mtTmp105;
        boolean mtTmp104;
        boolean mtTmp106;
        Tree mtTmp108;
        boolean mtTmp107;
        int mtTmp109;
        Tree mtTmp111;
        int mtTmp110;
        Tree mtTmp113;
        boolean mtTmp112;
        boolean mtTmp114;
        boolean mtTmp116;
        boolean mtTmp115;
        boolean mtTmp117;
        boolean mtTmp119;
        boolean mtTmp118;
        boolean mtTmp120;
        mtTmp103 = c_node.GetHas_Left();
        if(mtTmp103) {
            mtTmp105 = this;
            mtTmp104 = mtTmp105.RemoveLeft(p_node,c_node);
            ntb = mtTmp104;
        } else {
            mtTmp106 = c_node.GetHas_Right();
            if(mtTmp106) {
                mtTmp108 = this;
                mtTmp107 = mtTmp108.RemoveRight(p_node,c_node);
                ntb = mtTmp107;
            } else {
                {
                mtTmp109 = c_node.GetKey();
                auxkey1 = mtTmp109;
                mtTmp111 = p_node.GetLeft();
                mtTmp110 = mtTmp111.GetKey();
                auxkey2 = mtTmp110;
                mtTmp113 = this;
                mtTmp112 = mtTmp113.Compare(auxkey1,auxkey2);
                if(mtTmp112) {
                    {
                    mtTmp114 = p_node.SetLeft(my_null);
                    ntb = mtTmp114;
                    mtTmp116 = false;
                    mtTmp115 = p_node.SetHas_Left(mtTmp116);
                    ntb = mtTmp115;
                    }
                } else {
                    {
                    mtTmp117 = p_node.SetRight(my_null);
                    ntb = mtTmp117;
                    mtTmp119 = false;
                    mtTmp118 = p_node.SetHas_Right(mtTmp119);
                    ntb = mtTmp118;
                    }
                }
                }
            }
        }
        mtTmp120 = true;
        return mtTmp120;
    }
    public boolean RemoveRight(Tree p_node, Tree c_node) {
        boolean  ntb;
        boolean mtTmp121;
        Tree mtTmp124;
        int mtTmp123;
        boolean mtTmp122;
        Tree mtTmp125;
        boolean mtTmp126;
        boolean mtTmp128;
        boolean mtTmp127;
        boolean mtTmp129;
        mtTmp121 = c_node.GetHas_Right();
        while(mtTmp121) {
            {
            mtTmp124 = c_node.GetRight();
            mtTmp123 = mtTmp124.GetKey();
            mtTmp122 = c_node.SetKey(mtTmp123);
            ntb = mtTmp122;
            p_node = c_node;
            mtTmp125 = c_node.GetRight();
            c_node = mtTmp125;
            }
            mtTmp121 = c_node.GetHas_Right();
        }
        mtTmp126 = p_node.SetRight(my_null);
        ntb = mtTmp126;
        mtTmp128 = false;
        mtTmp127 = p_node.SetHas_Right(mtTmp128);
        ntb = mtTmp127;
        mtTmp129 = true;
        return mtTmp129;
    }
    public boolean RemoveLeft(Tree p_node, Tree c_node) {
        boolean  ntb;
        boolean mtTmp130;
        Tree mtTmp133;
        int mtTmp132;
        boolean mtTmp131;
        Tree mtTmp134;
        boolean mtTmp135;
        boolean mtTmp137;
        boolean mtTmp136;
        boolean mtTmp138;
        mtTmp130 = c_node.GetHas_Left();
        while(mtTmp130) {
            {
            mtTmp133 = c_node.GetLeft();
            mtTmp132 = mtTmp133.GetKey();
            mtTmp131 = c_node.SetKey(mtTmp132);
            ntb = mtTmp131;
            p_node = c_node;
            mtTmp134 = c_node.GetLeft();
            c_node = mtTmp134;
            }
            mtTmp130 = c_node.GetHas_Left();
        }
        mtTmp135 = p_node.SetLeft(my_null);
        ntb = mtTmp135;
        mtTmp137 = false;
        mtTmp136 = p_node.SetHas_Left(mtTmp137);
        ntb = mtTmp136;
        mtTmp138 = true;
        return mtTmp138;
    }
    public int Search(int v_key) {
        boolean  cont;
        int ifound;
        Tree current_node;
        int key_aux;
        Tree mtTmp139;
        boolean mtTmp140;
        int mtTmp141;
        int mtTmp142;
        boolean mtTmp143;
        boolean mtTmp144;
        Tree mtTmp145;
        boolean mtTmp146;
        boolean mtTmp147;
        boolean mtTmp148;
        Tree mtTmp149;
        boolean mtTmp150;
        int mtTmp151;
        boolean mtTmp152;
        mtTmp139 = this;
        current_node = mtTmp139;
        mtTmp140 = true;
        cont = mtTmp140;
        mtTmp141 = 0;
        ifound = mtTmp141;
        while(cont) {
            {
            mtTmp142 = current_node.GetKey();
            key_aux = mtTmp142;
            mtTmp143 = v_key < key_aux;
            if(mtTmp143) {
                mtTmp144 = current_node.GetHas_Left();
                if(mtTmp144) {
                    mtTmp145 = current_node.GetLeft();
                    current_node = mtTmp145;
                } else {
                    mtTmp146 = false;
                    cont = mtTmp146;
                }
            } else {
                mtTmp147 = key_aux < v_key;
                if(mtTmp147) {
                    mtTmp148 = current_node.GetHas_Right();
                    if(mtTmp148) {
                        mtTmp149 = current_node.GetRight();
                        current_node = mtTmp149;
                    } else {
                        mtTmp150 = false;
                        cont = mtTmp150;
                    }
                } else {
                    {
                    mtTmp151 = 1;
                    ifound = mtTmp151;
                    mtTmp152 = false;
                    cont = mtTmp152;
                    }
                }
            }
            }
                    }
        return ifound;
    }
    public boolean Print() {
        Tree current_node;
        boolean  ntb;
        Tree mtTmp153;
        Tree mtTmp155;
        boolean mtTmp154;
        boolean mtTmp156;
        mtTmp153 = this;
        current_node = mtTmp153;
        mtTmp155 = this;
        mtTmp154 = mtTmp155.RecPrint(current_node);
        ntb = mtTmp154;
        mtTmp156 = true;
        return mtTmp156;
    }
    public boolean RecPrint(Tree node) {
        boolean  ntb;
        boolean mtTmp157;
        Tree mtTmp159;
        Tree mtTmp160;
        boolean mtTmp158;
        boolean mtTmp161;
        int mtTmp162;
        boolean mtTmp163;
        Tree mtTmp165;
        Tree mtTmp166;
        boolean mtTmp164;
        boolean mtTmp167;
        boolean mtTmp168;
        mtTmp157 = node.GetHas_Left();
        if(mtTmp157) {
            {
            mtTmp159 = this;
            mtTmp160 = node.GetLeft();
            mtTmp158 = mtTmp159.RecPrint(mtTmp160);
            ntb = mtTmp158;
            }
        } else {
            mtTmp161 = true;
            ntb = mtTmp161;
        }
        mtTmp162 = node.GetKey();
        System.out.println(mtTmp162);
        mtTmp163 = node.GetHas_Right();
        if(mtTmp163) {
            {
            mtTmp165 = this;
            mtTmp166 = node.GetRight();
            mtTmp164 = mtTmp165.RecPrint(mtTmp166);
            ntb = mtTmp164;
            }
        } else {
            mtTmp167 = true;
            ntb = mtTmp167;
        }
        mtTmp168 = true;
        return mtTmp168;
    }
}
