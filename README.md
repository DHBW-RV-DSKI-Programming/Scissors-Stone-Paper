# Schere, Stein, Papier

## Ziel der Aufgabe

Programmiere das klassische Spiel **Schere, Stein, Papier** als Konsolenanwendung. Zwei Spieler (ein Nutzer und ein
Computer) sollen gegeneinander spielen können. Das Programm soll die Eingaben entgegennehmen, auswerten und das Ergebnis
anzeigen.

## Anforderungen

1. **Spielablauf:**
    - Der Spieler gibt seine Wahl ein: *Schere*, *Stein* oder *Papier*.
    - Der Computer trifft zufällig eine Wahl.
    - Das Programm wertet die Eingaben aus und gibt aus, wer gewonnen hat.
    - Nach jeder Runde soll der Spieler gefragt werden, ob er weiterspielen möchte.

2. **Spielregeln:**
    - **Schere schlägt Papier**
    - **Papier schlägt Stein**
    - **Stein schlägt Schere**
    - Gleiche Eingaben führen zu einem Unentschieden.

## Erwartete Ein- und Ausgabe (Beispiel)

**Spielstart:**

```
Schere, Stein oder Papier? 
Spieler: Stein
Computer: Schere
Du gewinnst! 🎉
```

**Weiterer Spielverlauf:**

```
Schere, Stein oder Papier? 
Spieler: Papier
Computer: Papier
Unentschieden! 🤝
```

**Spielende:**

```
Möchtest du noch eine Runde spielen? (ja/nein)  
nein  
Danke fürs Spielen! 👋  
```

#### **Hinweise**

- Falls du das Spiel erweitern möchtest, kannst du z. B. eine Punktzahl-Verwaltung oder eine Erweiterung um „Echse“ und
  „Spock“ (aus *Big Bang Theory*) hinzufügen.