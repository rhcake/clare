grammar clare;

options {  

}

tokens {

} 

@header {
package clare;
}

@members {

}


mod
	: top+ EOF
	;
	
top
	: Id Id '(' argdecls? ')' '{' stm* '}'	#topFunDef
	| 'class' Id '{' fields? '}'			#topClassDef
	;
	
fields
	: Id Id ';' fields
	| Id Id ';'
	;
	
argdecls
	: Id Id ',' argdecls
	| Id Id
	;
	
stm
	: Id Id ';'							#stmVarDecl
	| Id Id '=' ex ';'					#stmVarDef
	| ex '=' ex ';'						#stmMove
	| 'return' ex ';'					#stmRet
	| 'if' '(' ex ')' '{' stm* '}'		#stmIf
	;
	
ex
	: '(' ex ')'			#exParen
	| Int					#exInt
	| Id					#exId
	| ex (Mul|Div) ex		#exMulDiv
	| ex (Add|Sub) ex		#exAddSub
	| Id '(' params? ')'	#exCall
	| ex '.' Id				#exField
	;
	
params
	: ex ',' params
	| ex
	;
	

Comment: '//' ~[\r\n]* -> channel(HIDDEN);
Int: Digit+;
Add: '+';
Sub: '-';
Mul: '*';
Div: '/';
Id: [A-Za-z_][A-Za-z_0-9]*;
Ws: [ \t\r\n] -> skip;


fragment Digit: [0-9];













