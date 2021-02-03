class QuickSort {
public static void main(String[] a) {
QS JaiShreeRam4 ;
int JaiShreeRam3 ;
int JaiShreeRam6 ;
int JaiShreeRam5 ;
int JaiShreeRam0 ;
QS JaiShreeRam2 ;
QS JaiShreeRam1 ;
JaiShreeRam2 = new QS() ;
JaiShreeRam1 = JaiShreeRam2;
JaiShreeRam4 = new QS() ;
JaiShreeRam5 = 10 ;
JaiShreeRam6 = JaiShreeRam5 ;
JaiShreeRam3 = JaiShreeRam4.Start(JaiShreeRam6) ;
JaiShreeRam0 = JaiShreeRam3 ;
System.out.println(JaiShreeRam0) ;
  }
 }
class QS {
int[] number ;
int size ;
public int Start(int sz) {
int JaiShreeRam19 ;
int JaiShreeRam18 ;
int JaiShreeRam17 ;
int JaiShreeRam16 ;
int aux01 ;
QS JaiShreeRam15 ;
int JaiShreeRam14 ;
QS JaiShreeRam13 ;
QS JaiShreeRam12 ;
int JaiShreeRam11 ;
QS JaiShreeRam10 ;
int JaiShreeRam31 ;
QS JaiShreeRam30 ;
QS JaiShreeRam8 ;
QS JaiShreeRam7 ;
int JaiShreeRam29 ;
QS JaiShreeRam28 ;
int JaiShreeRam9 ;
QS JaiShreeRam27 ;
int JaiShreeRam26 ;
int JaiShreeRam25 ;
int JaiShreeRam24 ;
QS JaiShreeRam23 ;
int JaiShreeRam22 ;
QS JaiShreeRam21 ;
QS JaiShreeRam20 ;
JaiShreeRam8 = this ;
JaiShreeRam7 = JaiShreeRam8;
JaiShreeRam10 = this ;
JaiShreeRam11 = sz ;
JaiShreeRam9 = JaiShreeRam10.Init(JaiShreeRam11) ;
aux01 = JaiShreeRam9 ;
JaiShreeRam13 = this ;
JaiShreeRam12 = JaiShreeRam13;
JaiShreeRam15 = this ;
JaiShreeRam14 = JaiShreeRam15.Print() ;
aux01 = JaiShreeRam14 ;
JaiShreeRam17 = 9999 ;
JaiShreeRam16 = JaiShreeRam17 ;
System.out.println(JaiShreeRam16) ;
JaiShreeRam18 = 1 ;
JaiShreeRam19 = size - JaiShreeRam18;
aux01 = JaiShreeRam19 ;
JaiShreeRam21 = this ;
JaiShreeRam20 = JaiShreeRam21;
JaiShreeRam23 = this ;
JaiShreeRam24 = 0 ;
JaiShreeRam25 = JaiShreeRam24 ;
JaiShreeRam26 = aux01 ;
JaiShreeRam22 = JaiShreeRam23.Sort(JaiShreeRam25,JaiShreeRam26) ;
aux01 = JaiShreeRam22 ;
JaiShreeRam28 = this ;
JaiShreeRam27 = JaiShreeRam28;
JaiShreeRam30 = this ;
JaiShreeRam29 = JaiShreeRam30.Print() ;
aux01 = JaiShreeRam29 ;
JaiShreeRam31 = 0 ;
return JaiShreeRam31 ;
}
public int Sort(int left ,int right) {
int JaiShreeRam59 ;
boolean JaiShreeRam58 ;
boolean JaiShreeRam57 ;
boolean cont02 ;
boolean JaiShreeRam56 ;
boolean cont01 ;
boolean JaiShreeRam55 ;
boolean JaiShreeRam54 ;
int JaiShreeRam53 ;
int JaiShreeRam52 ;
int JaiShreeRam51 ;
boolean JaiShreeRam50 ;
boolean JaiShreeRam49 ;
boolean JaiShreeRam48 ;
boolean JaiShreeRam47 ;
boolean JaiShreeRam46 ;
boolean JaiShreeRam45 ;
boolean JaiShreeRam44 ;
int JaiShreeRam43 ;
int JaiShreeRam42 ;
int JaiShreeRam86 ;
int JaiShreeRam41 ;
int JaiShreeRam85 ;
boolean JaiShreeRam40 ;
int JaiShreeRam84 ;
int JaiShreeRam83 ;
int JaiShreeRam82 ;
int JaiShreeRam81 ;
QS JaiShreeRam80 ;
int nt ;
boolean JaiShreeRam39 ;
boolean JaiShreeRam38 ;
boolean JaiShreeRam37 ;
int JaiShreeRam36 ;
int aux03 ;
int JaiShreeRam35 ;
int JaiShreeRam79 ;
int JaiShreeRam34 ;
QS JaiShreeRam78 ;
boolean JaiShreeRam33 ;
QS JaiShreeRam77 ;
int JaiShreeRam32 ;
int JaiShreeRam76 ;
int JaiShreeRam75 ;
int JaiShreeRam74 ;
int JaiShreeRam73 ;
QS JaiShreeRam72 ;
int JaiShreeRam71 ;
QS JaiShreeRam70 ;
int i ;
QS JaiShreeRam69 ;
int j ;
int JaiShreeRam68 ;
int JaiShreeRam67 ;
boolean JaiShreeRam66 ;
boolean JaiShreeRam65 ;
boolean JaiShreeRam64 ;
int JaiShreeRam63 ;
int JaiShreeRam62 ;
int JaiShreeRam61 ;
int JaiShreeRam60 ;
int t ;
int v ;
JaiShreeRam32 = 0 ;
t = JaiShreeRam32 ;
JaiShreeRam33 = left < right;
if(JaiShreeRam33) {
{
JaiShreeRam34 = number[right];
v = JaiShreeRam34 ;
JaiShreeRam35 = 1 ;
JaiShreeRam36 = left - JaiShreeRam35;
i = JaiShreeRam36 ;
j = right ;
JaiShreeRam37 = true ;
cont01 = JaiShreeRam37 ;
JaiShreeRam38 = cont01 ;
while(JaiShreeRam38) {
{
JaiShreeRam39 = true ;
cont02 = JaiShreeRam39 ;
JaiShreeRam40 = cont02 ;
while(JaiShreeRam40) {
{
JaiShreeRam41 = 1 ;
JaiShreeRam42 = i + JaiShreeRam41;
i = JaiShreeRam42 ;
JaiShreeRam43 = number[i];
aux03 = JaiShreeRam43 ;
JaiShreeRam46 = aux03 < v;
JaiShreeRam45 = JaiShreeRam46 ;
JaiShreeRam44 = !JaiShreeRam45 ;
if(JaiShreeRam44) {
JaiShreeRam47 = false ;
cont02 = JaiShreeRam47 ;
}
 else{
JaiShreeRam48 = true ;
cont02 = JaiShreeRam48 ;

}

}
JaiShreeRam40 = cont02 ;

}
JaiShreeRam49 = true ;
cont02 = JaiShreeRam49 ;
JaiShreeRam50 = cont02 ;
while(JaiShreeRam50) {
{
JaiShreeRam51 = 1 ;
JaiShreeRam52 = j - JaiShreeRam51;
j = JaiShreeRam52 ;
JaiShreeRam53 = number[j];
aux03 = JaiShreeRam53 ;
JaiShreeRam56 = v < aux03;
JaiShreeRam55 = JaiShreeRam56 ;
JaiShreeRam54 = !JaiShreeRam55 ;
if(JaiShreeRam54) {
JaiShreeRam57 = false ;
cont02 = JaiShreeRam57 ;
}
 else{
JaiShreeRam58 = true ;
cont02 = JaiShreeRam58 ;

}

}
JaiShreeRam50 = cont02 ;

}
JaiShreeRam59 = number[i];
t = JaiShreeRam59 ;
JaiShreeRam60 = number[j];
number[i] = JaiShreeRam60 ;
number[j] = t ;
JaiShreeRam62 = 1 ;
JaiShreeRam63 = i + JaiShreeRam62;
JaiShreeRam61 = JaiShreeRam63 ;
JaiShreeRam64 = j < JaiShreeRam61;
if(JaiShreeRam64) {
JaiShreeRam65 = false ;
cont01 = JaiShreeRam65 ;
}
 else{
JaiShreeRam66 = true ;
cont01 = JaiShreeRam66 ;

}

}
JaiShreeRam38 = cont01 ;

}
JaiShreeRam67 = number[i];
number[j] = JaiShreeRam67 ;
JaiShreeRam68 = number[right];
number[i] = JaiShreeRam68 ;
number[right] = t ;
JaiShreeRam70 = this ;
JaiShreeRam69 = JaiShreeRam70;
JaiShreeRam72 = this ;
JaiShreeRam73 = left ;
JaiShreeRam74 = 1 ;
JaiShreeRam75 = i - JaiShreeRam74;
JaiShreeRam76 = JaiShreeRam75 ;
JaiShreeRam71 = JaiShreeRam72.Sort(JaiShreeRam73,JaiShreeRam76) ;
nt = JaiShreeRam71 ;
JaiShreeRam78 = this ;
JaiShreeRam77 = JaiShreeRam78;
JaiShreeRam80 = this ;
JaiShreeRam81 = 1 ;
JaiShreeRam82 = i + JaiShreeRam81;
JaiShreeRam83 = JaiShreeRam82 ;
JaiShreeRam84 = right ;
JaiShreeRam79 = JaiShreeRam80.Sort(JaiShreeRam83,JaiShreeRam84) ;
nt = JaiShreeRam79 ;

}
}
 else{
JaiShreeRam85 = 0 ;
nt = JaiShreeRam85 ;

}
JaiShreeRam86 = 0 ;
return JaiShreeRam86 ;
}
public int Print() {
int JaiShreeRam97 ;
boolean JaiShreeRam96 ;
int JaiShreeRam95 ;
int JaiShreeRam94 ;
int JaiShreeRam93 ;
int JaiShreeRam92 ;
int JaiShreeRam91 ;
boolean JaiShreeRam90 ;
int JaiShreeRam89 ;
boolean JaiShreeRam88 ;
int JaiShreeRam87 ;
int j ;
JaiShreeRam87 = 0 ;
j = JaiShreeRam87 ;
JaiShreeRam89 = size ;
JaiShreeRam90 = j < JaiShreeRam89;
JaiShreeRam88 = JaiShreeRam90 ;
while(JaiShreeRam88) {
{
JaiShreeRam92 = number[j];
JaiShreeRam91 = JaiShreeRam92 ;
System.out.println(JaiShreeRam91) ;
JaiShreeRam93 = 1 ;
JaiShreeRam94 = j + JaiShreeRam93;
j = JaiShreeRam94 ;

}
JaiShreeRam95 = size ;
JaiShreeRam96 = j < JaiShreeRam95;
JaiShreeRam88 = JaiShreeRam96 ;

}
JaiShreeRam97 = 0 ;
return JaiShreeRam97 ;
}
public int Init(int sz) {
int JaiShreeRam100 ;
int JaiShreeRam101 ;
int JaiShreeRam99 ;
int[] JaiShreeRam98 ;
int JaiShreeRam119 ;
int JaiShreeRam117 ;
int JaiShreeRam118 ;
int JaiShreeRam115 ;
int JaiShreeRam116 ;
int JaiShreeRam113 ;
int JaiShreeRam114 ;
int JaiShreeRam111 ;
int JaiShreeRam112 ;
int JaiShreeRam110 ;
int JaiShreeRam108 ;
int JaiShreeRam109 ;
int JaiShreeRam106 ;
int JaiShreeRam107 ;
int JaiShreeRam104 ;
int JaiShreeRam105 ;
int JaiShreeRam102 ;
int JaiShreeRam103 ;
size = sz ;
JaiShreeRam98 = new int[sz] ;
number = JaiShreeRam98 ;
JaiShreeRam99 = 0 ;
JaiShreeRam100 = 20 ;
number[JaiShreeRam99] = JaiShreeRam100 ;
JaiShreeRam101 = 1 ;
JaiShreeRam102 = 7 ;
number[JaiShreeRam101] = JaiShreeRam102 ;
JaiShreeRam103 = 2 ;
JaiShreeRam104 = 12 ;
number[JaiShreeRam103] = JaiShreeRam104 ;
JaiShreeRam105 = 3 ;
JaiShreeRam106 = 18 ;
number[JaiShreeRam105] = JaiShreeRam106 ;
JaiShreeRam107 = 4 ;
JaiShreeRam108 = 2 ;
number[JaiShreeRam107] = JaiShreeRam108 ;
JaiShreeRam109 = 5 ;
JaiShreeRam110 = 11 ;
number[JaiShreeRam109] = JaiShreeRam110 ;
JaiShreeRam111 = 6 ;
JaiShreeRam112 = 6 ;
number[JaiShreeRam111] = JaiShreeRam112 ;
JaiShreeRam113 = 7 ;
JaiShreeRam114 = 9 ;
number[JaiShreeRam113] = JaiShreeRam114 ;
JaiShreeRam115 = 8 ;
JaiShreeRam116 = 19 ;
number[JaiShreeRam115] = JaiShreeRam116 ;
JaiShreeRam117 = 9 ;
JaiShreeRam118 = 5 ;
number[JaiShreeRam117] = JaiShreeRam118 ;
JaiShreeRam119 = 0 ;
return JaiShreeRam119 ;
}
}

