# compiler_design
This is basically a java compiler which checks the grammer of a java code i.e. it's token sequence, checks scope of a variable and produces intermediate code in TAC(three address code) format.
<br/>
### A1 Lexical analyser
checks grammer of the input code i.e. token sequence.<br/>
The grammer used in this code is simpler then the standard grammer of java program. <br/>


	(<identifier> <identifier>)*
	(<identifier> <compstat> <identifier>)*

%where compstat = "<" | ">" | "=".

### A2 Syntax analyser
Checks whether the assignment statements written in the code are valid or not. For instance are we writing code like this<br/>

	int a="string";

or<br/>


	int a;

	a={1,2,3};

It reports error on such code input.<br/>

### A3 Intermediate code generator
Produces intermediate code int TAC(three address code) format of a given code. <br/>
For instance <br/>
input code=

	int a=b+c+d;

output code=<br/>


	int temp_var1=b+c;

	int temp_var2=temp_var1+d;

	int a=temp_var2;



### A4 Scope analyser
Prints all the variables in a given scope.<br/>
For instance<br/>
input code=<br/>


	.

	.

	.

	.

	.

	printvars();


<br/>
output code=<br/>


	a b c d ....


<br/>
% where a b c d... are variables that are accessible in the given scope.<br/>

