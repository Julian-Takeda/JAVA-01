# Java-Übungen: Klassen

## Ziel

Übe Klassen, Objekterstellung und Methoden mit den folgenden Aufgaben.

## Aufgaben

### 1. Person Class with Age Classification

Erstelle eine `Person`-Klasse mit:

```java
String name;
int age;
```

Füge eine Methode hinzu, die ausgibt:

- `Child` wenn unter 13
- `Teenager` wenn 13–17
- `Adult` wenn 18–64
- `Senior` wenn 65 oder älter

Erstelle mindestens drei `Person`-Objekte und teste sie.

### 2. Number Analyzer

Erstelle eine Klasse namens `NumberAnalyzer` mit:

```java
int number;
```

Füge eine Methode hinzu, die ausgibt, ob die Zahl:

- Positiv, negativ oder null ist
- Gerade oder ungerade ist

Erstelle mehrere Objekte mit verschiedenen Zahlen.

### 3. Student Grade Class

Erstelle eine `Student`-Klasse mit:

```java
String name;
int score;
```

Füge eine Methode hinzu, die ausgibt:

- A für 90–100
- B für 80–89
- C für 70–79
- D für 60–69
- F unter 60

Gib auch aus, ob der Schüler bestanden oder nicht bestanden hat.

Erstelle mindestens vier Studenten.

### 4. Multiplication Table Class

Erstelle eine Klasse namens `MultiplicationTable` mit:

```java
int number;
```

Füge eine Methode hinzu, die die Multiplikationstabelle von 1 bis 10 ausgibt.

Beispiel:

```text
7 x 1 = 7
7 x 2 = 14
...
7 x 10 = 70
```

Verwende eine `for`-Schleife.

### 5. Countdown Class

Erstelle eine Klasse namens `Countdown` mit:

```java
int startNumber;
```

Füge eine Methode hinzu, die von `startNumber` bis null herunterzählt. Verwende eine `while`-Schleife.

Gib danach aus:

```text
Start!
```

### 6. Temperature Report

Erstelle eine Klasse namens `TemperatureReport` mit:

```java
int temperature;
```

Füge eine Methode hinzu, die:

- Ausgibt, ob die Temperatur `freezing`, `cold`, `comfortable` oder `hot` ist
- Alle Temperaturen von der aktuellen Temperatur bis null mit einer Schleife ausgibt

### 7. Shopping Cart

Erstelle eine Klasse namens `Product` mit:

```java
String name;
double price;
int quantity;
```

Füge eine Methode hinzu, die den Gesamtpreis berechnet und ausgibt.

Erstelle dann mindestens drei Produkte und verwende eine Schleife, um die Informationen jedes Produkts auszugeben.

Gib abschließend die Gesamtkosten aller Produkte aus.

### 8. Number Collection

Erstelle eine Klasse namens `NumberCollection` mit:

```java
int sum;
```

Verwende eine `while`-Schleife, um die Zahlen von 1 bis 20 zu verarbeiten.

Das Programm sollte:

- Jede Zahl zu `sum` addieren
- Gerade Zahlen drucken
- Die endgültige Summe drucken

### 9. Simple Game Character

Erstelle eine Klasse namens `Character` mit:

```java
String name;
int health;
int level;
```

Füge eine Methode hinzu, die ausgibt:

- Den Namen des Charakters
- `Healthy` wenn die Gesundheit mindestens 70 beträgt
- `Injured` wenn die Gesundheit zwischen 1 und 69 liegt
- `Defeated` wenn die Gesundheit null oder darunter liegt

Verwende eine Schleife, um wiederholt 20 Gesundheitspunkte zu verlieren, bis der Charakter besiegt ist.

### 10. Mini-Project: Library Books

Erstelle eine Klasse namens `Book` mit:

```java
String title;
String author;
boolean available;
```

Erstelle mindestens fünf Bücher und speichere sie in einem Array.

Verwende eine `for`-Schleife, um jedes Buch auszugeben.

Für jedes Buch gib aus:

```text
Title: ...
Author: ...
Status: Available
```

oder:

```text
Status: Borrowed
```

Füge eine Methode hinzu, die die Verfügbarkeit eines Buches ändert.
