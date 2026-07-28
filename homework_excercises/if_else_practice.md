# Java-Übungen: if, else if und else

## Ziel

Löse die folgenden Aufgaben mit den Kontrollstrukturen `if`, `else if` und `else`.

## Aufgaben

### 1. Positiv, negativ oder null

Erstelle eine Ganzzahl und gib aus, ob sie positiv, negativ oder null ist.

```java
int number = -5;
```

### 2. Gerade oder ungerade

Gib aus, ob eine Zahl gerade oder ungerade ist.

Hinweis:

```java
number % 2 == 0
```

### 3. Bestanden oder nicht bestanden

Bei einer Punktzahl von 60 oder höher ist der Test bestanden.

```java
int score = 72;
```

### 4. Notenklassifizierung

Ordne einer Punktzahl eine Note zu:

- 90–100: A
- 80–89: B
- 70–79: C
- 60–69: D
- unter 60: F

```java
int score = 85;
```

### 5. Temperaturmeldung

Ordne einer Temperatur eine Meldung zu:

- unter 0: Gefrierpunkt
- 0–19: Kalt
- 20–29: Angenehm
- ab 30: Heiß

```java
int temperature = 22;
```

### 6. Altersgruppe

Ordne einem Alter eine Gruppe zu:

- unter 13: Kind
- 13–17: Jugendliche/r
- 18–64: Erwachsene/r
- ab 65: Senior/in

```java
int age = 25;
```

### 7. Größere von zwei Zahlen

Vergleiche zwei Ganzzahlen und gib aus, welche Zahl größer ist. Wenn beide gleich sind, gib eine passende Meldung aus.

```java
int first = 12;
int second = 8;
```

### 8. Einfache Anmeldung

Verwende die folgenden Werte:

```java
String username = "admin";
String password = "java123";
```

Gib „Anmeldung erfolgreich“ nur aus, wenn beide Werte korrekt sind.

Hinweis für Strings:

```java
username.equals("admin")
```

Nicht so:

```java
username == "admin"
```

### 9. Eintrittspreis

Ordne einem Alter einen Eintrittspreis zu:

- unter 12 Jahren: 5 €
- 12–64 Jahre: 10 €
- ab 65 Jahren: 7 €

```java
int age = 10;
```

### 10. Mini-Challenge: Stromverbrauch

Ordne dem Stromverbrauch eine Stufe zu:

- unter 100: Niedriger Verbrauch
- 100–299: Normaler Verbrauch
- ab 300: Hoher Verbrauch
