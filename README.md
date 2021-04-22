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
- /*    - blokový komentář

## Příklad jazyka

```
Tape tape = "aaaaaaabbaaaaaaa"
Tape tape2 = "aaaaaaabbbbaaaaaaa"

Accept acc = [accepted]
Accept acc1 = [rejectState, accepted]

Reject reject = [rejectState]

State start = {
    'a' -> ' ', R, matchA|
    'b' -> ' ', R, matchB|
    ' ' -> ' ', R, accepted
}

State matchA = {
    'a' -> 'a', R, matchA|
    'b' -> 'b', R, matchA|
    ' ' -> ' ', L, findA
}

State findA = {
    'a' -> ' ', L, goBack|
    'b' -> ' ', L, rejectState
}

State matchB = {
    'a' -> 'a', R, matchB|
    'b' -> 'b', R, matchB|
    ' ' -> ' ', L, findB
}

State findB = {
    'a' -> ' ', L, rejectState|
    'b' -> ' ', L, goBack
}

State goBack = {
    'a' -> 'a', L, goBack|
    'b' -> 'b', L, goBack|
    ' ' -> ' ', R, start
}


State rejectState = {}
State accepted = {}

Turing(acc, reject, tape, start, *)
Turing(acc, reject, tape2, start, [start, matchA])
Turing(acc1, reject, tape2, start, *)
```
