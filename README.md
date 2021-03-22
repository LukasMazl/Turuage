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
