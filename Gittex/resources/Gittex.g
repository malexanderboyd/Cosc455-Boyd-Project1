grammar Gittex;
// BNF
// <gittex> :: '\BEGIN' <title> <body>  '\END'
// <title> :: '\TITLE['   <text>   ']'
//  <body> ::  <paragraph> <body>
//	| <lists>
//	| empty
// <paragraph> :: '\PARB' <para-body> '\PARE'
// <para-body> :: <text> <para-body>
//	     | <bold>
//	     | <italics>
//	     | <link>
//	     | empty
// <text> :: 'A' .. 'Z', '0' .. '9', ...

TEXT : ('A'..'Z' | 'a'..'z' | '0'..'9' | ',' | '"' | ':' | '?' | '.' | '/' | '_' | '\u000C')*;
WS  :   ('\t'  | '\r' | ) {$channel=HIDDEN;} ;
DOC_BEGIN	: '\\BEGIN';
DOC_END	: '\\END';	
TITLE_BEGIN	: '\\TITLE';
SQUARE_CLOSE	: ']';
SQUARE_OPEN	: '[';	
PARA_BEGIN	: '\\PARB';
PARA_END:	'\\PARE';
BOLD_ASTR	: '**';
ITALIC_ASTR : '*';
LIST_STARTER: '+';
IMG_STARTER : '!';	
VAR_EQUAL : '=';	
VAR_START : '\\DEF';
VAR_USE	: '\\USE';	
NEWLINE	:  '\\\\';
ADDRESS : '(' TEXT ')';
HEADING_START : '#';	
EOL	: '\\n';
SPACE 	: ' ';
headings: HEADING_START SPACE (TEXT | SPACE)+ EOL;
bold	: BOLD_ASTR TEXT BOLD_ASTR;
italics : ITALIC_ASTR TEXT ITALIC_ASTR; 
links	: SQUARE_OPEN (TEXT | WS)+ SQUARE_CLOSE ADDRESS;
images 	: IMG_STARTER SQUARE_OPEN TEXT SQUARE_CLOSE ADDRESS;
list	: LIST_STARTER (TEXT WS?)+;
useVariable : VAR_USE SQUARE_OPEN varName SQUARE_CLOSE;	
defineVariable  : VAR_START SQUARE_OPEN varName VAR_EQUAL varValue SQUARE_CLOSE;	
varName	: TEXT;
varValue : TEXT;	
title 	: TITLE_BEGIN SQUARE_OPEN (TEXT|WS)+ SQUARE_CLOSE;
paragraph 	: PARA_BEGIN parabody PARA_END;
parabody 	: (TEXT | bold | italics | links | NEWLINE | list | WS)+ ;	
body	:	(WS | TEXT | headings | bold | italics | links | images | list | defineVariable | useVariable | paragraph)+ ;	
gittex	: DOC_BEGIN title body DOC_END;