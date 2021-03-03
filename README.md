# prk-2020

Výchozí vzor
Výrazy v “Turingův  jazyk” vypadají takto: 

Start startStav(“start”)
Abeceda abceda(‘a’,’b’)
Delta prechodoveFunkce {
	start {
	   a: {zapis: b, R: stav2}
	   b: {zapis: a, L: stav3}
}
stav2 {
  a: {R, stav2}
  b: {L, stav3}
}
...
}

Automat turing = (startStav, prechodoveFunkce, [stav2, stav3]) //Stav2 a stav3 jsou konečné stavy kdy slovo je akceptováno

turing(‘aabbaa’) // Vrati informaci jestli slovo je přijato TS.
