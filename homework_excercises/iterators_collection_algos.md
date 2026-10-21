# Java-Übungen: Iteratoren und Collections-Algorithmen

## Ziel

Übe das sichere Entfernen von Elementen während der Iteration, das Durchlaufen von Listen vorwärts und rückwärts sowie nützliche Algorithmen aus `Collections`.

Geschätzte Dauer: 2–3 Stunden. Verwende für die Aufgaben eine `ArrayList` und, wo angegeben, einen `Iterator` oder `ListIterator`.

## Aufgaben

### 1. Elemente mit einem Iterator entfernen

Beginne mit dieser Liste:

```java
ArrayList<Integer> numbers = new ArrayList<>(
        Arrays.asList(12, 7, 18, 5, 21, 10, 3)
);
```

Verwende einen `Iterator<Integer>`, um alle Zahlen zu entfernen, die durch 3 teilbar sind. Gib die Liste vor und nach dem Entfernen aus.

Hinweis: Prüfe mit `number % 3 == 0`. Verwende beim Durchlaufen die `remove()`-Methode des Iterators, nicht direkt die `remove()`-Methode der Liste. So kannst du Elemente sicher während der Iteration entfernen. (dev.java)

### 2. Eine Liste vorwärts und rückwärts durchlaufen

Erstelle eine Liste mit mindestens fünf Städtenamen.

- Verwende einen `ListIterator<String>`, um die Städte vom ersten bis zum letzten Eintrag auszugeben.
- Erstelle einen neuen `ListIterator` am Ende der Liste und gib die Städtenamen vom letzten bis zum ersten Eintrag aus.

### 3. Algorithmen für Listen ausprobieren

Beginne mit:

```java
ArrayList<Integer> scores = new ArrayList<>(
        Arrays.asList(68, 92, 75, 92, 81, 55)
);
```

Verwende Methoden aus der Klasse `Collections`, um:

- die Punktzahlen zu sortieren
- die niedrigste und höchste Punktzahl auszugeben
- zu zählen, wie oft `92` vorkommt
- die sortierte Liste umzukehren
- die Liste zufällig zu mischen und auszugeben

Die Reihenfolge nach dem Mischen kann sich bei jedem Durchlauf unterscheiden. (docs.oracle.com)

### 4. Eine sortierte Liste durchsuchen

Verwende die `scores`-Liste aus Aufgabe 3:

- Sortiere sie zuerst.
- Suche mit `Collections.binarySearch` nach `81`.
- Gib aus, ob die Punktzahl gefunden wurde.
- Suche anschließend auch nach `70`.

Wichtig: `binarySearch` setzt voraus, dass die Liste vorher sortiert wurde. (docs.oracle.com)

### 5. Mini-Projekt: Veranstaltungsanmeldungen

Erstelle eine `ArrayList<String>` mit den Namen der Teilnehmenden. Füge mindestens zwei Namen doppelt ein.

- Gib die Namen in ihrer ursprünglichen Reihenfolge aus.
- Sortiere die Liste alphabetisch und gib sie aus.
- Zähle, wie oft ein bestimmter Name vorkommt.
- Verwende einen `ListIterator`, um die Namen rückwärts auszugeben.
- Verwende einen `Iterator`, um alle Vorkommen eines ausgewählten Namens zu entfernen.

### 6. Optionale Herausforderung: Lagerbestand bereinigen

Erstelle eine `HashMap<String, Integer>` mit Produkten und ihren Lagerbeständen. Verwende einen Iterator über die Einträge der Map, um alle Produkte mit einem Bestand von null zu entfernen. Gib anschließend die verbleibenden Produkte und Bestände aus.

## Benötigte Imports

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
```

Für die optionale Map-Aufgabe benötigst du außerdem:

```java
import java.util.HashMap;
import java.util.Map;
```