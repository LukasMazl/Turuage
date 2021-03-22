# Turing language
## Definice typů

Boolen hodnota - Využívá funkce Turing, která vrací True, pokud je slovo acceptováno, False pokud je zamítnuto. Případ zacyklení není řešen.

string/char array - Vstupní retezec

byte - velikost pásky
byte[] - pro simulaci pásky

## Definice operací

Turing(accept, reject, vstup, program) - Vrací boolean jestli je slovo přijato nebo zamítnuto (true nebo false)

- -> 	- prechod
- = 	- prirazeni
- //  	- komentar

## Příklad jazyka

```
Paska vstup = “10101011”;
Accept accept = [q0, q3];
Reject reject = [q1, q2];

Stav q0 = {
	‘a’ -> ‘a’, L, q0
	‘b’ -> ‘b’, R, q1
}

Stav q1 = {
	‘a’ -> ‘a’, L, q0
	‘b’ -> ‘b’, R, q1
}

Turing(accept, reject, vstup, [q0, q1]); //Vraci true nebo false
```
## Gramatika
```
<input_string> ::= "\"" <alfabet>+ "\""
<alfabet> ::= [a-z] | [A-Z] | [0-9]
<end_statement> ::= ";"
<paska_type> ::= "Paska"
<accept_type> ::= "Accept"
<reject_type> ::= "Reject"
<state_type> ::= "State"
<turing_type> ::= "Turing"
<space> ::= " "
<keyword> ::= "L" | "R"
<state_name> ::= <alfabet>+
<paska_name> ::= <alfabet>+
<reject_name> ::= <alfabet>+
<accept_name> ::= <alfabet>+
<separator> ::= ","
<array_variable> ::= <space>* <state_name>+ <space>*
<array> ::= "["  <array_variable> "]" |  "[" <array_variable> (<separator> <array_variable> )+ "]"
<paska_statement> ::= <paska_type> <space> <paska_name> <space>* "=" <space>* <input_string> <end_statement>
<accept_statement> ::= <accept_type> <space> <accept_name> <space>* "=" <space>* <array> <end_statement>
<reject_statement> ::= <reject_type> <space> <reject_name> <space>* "=" <space>* <array> <end_statement>
<transition_operator> ::= "->"
<single_write_value> ::= "'" <alfabet> "'"
<current_input> ::= "'" <alfabet> "'"
<end_rule> ::= "\n"
<comment> ::= "//" <alfabet>*
<divider> ::= <space>* <separator> <space>*
<rule_definition> ::= <space>* <current_input> <space> <transition_operator> <space> <single_write_value> <separator> <space>* <keyword> <separator> <space>* <state_name> <end_rule> 
<rules_definition> ::= <rule_definition> | <rule_definition> ("\n")* (<rule_definition>)* 
<transition_rules> ::= "{" ("\n")* <rules_definition> ("\n")* "}"
<state_statement> ::= <state_type> <space> <state_name> <space>* "=" <space>* <transition_rules>
<state_array> ::= "[" <state_name> "]" | "[" <space>* <state_name> (<divider>  <state_name>)* "]"
<turing_function> ::= <turing_type> "(" <accept_name> <divider> <reject_name> <divider> <paska_name> <divider> <state_array> ")" <end_statement> <comment>*
```
