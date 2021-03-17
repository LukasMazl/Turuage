# Turing language
## Definice typů

Boolen hodnota - Využívá funkce Turing, která vrací True, pokud je slovo acceptováno, False pokud je zamítnuto. Případ zacyklení není řešen. Pokud dojde k přístupu mimo pásku, tak je vrácen false

string/char array - Vstupní retezec
byte - velikost pásky
byte[] - pro simulaci pásky

pointer - Ukazuje aktuální pozici na pásce (#) - konkrétní symbol pro pointer ?

## Definice operací

Turing(accept, reject, vstup, program) - Vrací boolean jestli je slovo přijato nebo zamítnuto (true nebo false)

-> 	- prechod
= 	- prirazeni
//  	- komentar

## Příklad jazyka

```
Paska vstup = “10101011”|50; // |50 definuje velikost pástky
Accept accept = q0;
Reject reject = q1;

Stav q0 = {
	‘a’ -> ‘a’, L, q0;
	‘b’ -> ‘b’, R, q1;
}

Stav q1 = {
	‘a’ -> ‘a’, L, q0;
	‘b’ -> ‘b’, R, q1;
}

Turing(accept, reject, vstup, (q0, q1));
```
