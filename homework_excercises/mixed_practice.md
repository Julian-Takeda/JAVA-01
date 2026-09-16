# Java-Übungen: Klassen, Kontrollstrukturen und Schleifen

## Ziel

Übe die Kombination von Klassen, `if/else`-Bedingungen und `while`/`for`-Schleifen mit den folgenden Aufgaben.

## Aufgaben

### 1. Bankkonto

Erstelle eine Klasse `BankAccount` mit:

```java
String owner;
double balance;
```

Füge eine Methode hinzu, die ausgibt:

- `Leer` bei einem Kontostand von 0
- `Niedriger Kontostand` bei weniger als 100
- `Guter Kontostand` ansonsten

Erstelle drei Konten und teste sie.

### 2. Autogeschwindigkeit

Erstelle eine Klasse `Car` mit:

```java
String model;
int speed;
```

Gib aus:

- `Steht` bei 0
- `Langsam` unter 50
- `Normal` von 50 bis 120
- `Zu schnell` über 120

Erstelle mehrere Autos.

### 3. Kinositze

Erstelle eine Klasse `Cinema` mit:

```java
int availableSeats;
```

Verwende eine `while`-Schleife, um pro Durchlauf ein Ticket zu verkaufen.

Beende die Schleife, wenn:

- keine Plätze mehr frei sind
- oder maximal fünf Tickets verkauft wurden

Gib die Anzahl der verkauften Tickets aus.

### 4. Kraftstoffverbrauch

Erstelle eine Klasse `CarTrip` mit:

```java
String destination;
int fuel;
```

Verwende eine Schleife, die pro Streckenabschnitt 10 Einheiten Kraftstoff abzieht.

Gib nach jedem Abschnitt aus:

- `Genug Kraftstoff` bei mehr als 30
- `Kraftstoff wird knapp` bei 1–30
- `Kein Kraftstoff` bei 0 oder weniger

Beende die Schleife, wenn der Kraftstoff aufgebraucht ist.

### 5. Aufzug-Simulation

Erstelle eine Klasse `Elevator` mit:

```java
int currentFloor;
int targetFloor;
```

Verwende eine `while`-Schleife, um den Aufzug Stockwerk für Stockwerk zum Ziel zu bewegen.

Beispiel:

```text
Stockwerk 1
Stockwerk 2
Stockwerk 3
Angekommen!
```

Verwende `if/else`, um zu entscheiden, ob der Aufzug nach oben oder unten fährt.

### 6. Lagerbestand

Erstelle eine Klasse `Product` mit:

```java
String name;
int stock;
```

Erstelle mehrere Produkte und verwende eine `for`-Schleife, um auszugeben:

- `Nicht auf Lager` bei 0
- `Niedriger Lagerbestand` unter 5
- `Auf Lager` ansonsten

### 7. Roboter-Akku

Erstelle eine Klasse `Robot` mit:

```java
String name;
int battery;
```

Verwende eine Schleife, die nach jeder Aufgabe 15 Prozent Akku abzieht.

Gib aus:

- `Voll` bei mehr als 80
- `Gut` bei 40–80
- `Niedrig` bei 1–39
- `Heruntergefahren` bei 0 oder weniger

Beende die Schleife, wenn der Roboter heruntergefahren ist.

### 8. Parkgarage – optionale Herausforderung

Erstelle eine Klasse `ParkingGarage` mit:

```java
int freeSpaces;
```

Simuliere mit einer Schleife zehn ankommende Autos.

Für jedes Auto:

- Wenn ein Platz frei ist, reduziere `freeSpaces` um eins und gib `Auto geparkt` aus.
- Andernfalls gib `Garage voll` aus.

Gib am Ende die Anzahl der freien Plätze aus.