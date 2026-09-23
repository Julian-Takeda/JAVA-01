# Java-Übungen: Methodenparameter und Rückgabewerte

**Geschätzte Dauer:** 2–3 Stunden

## Ziel
Übe Methoden mit unterschiedlichen Parametern und Rückgabewerten. Erstelle dafür eine Klasse TravelTools und rufe die Methoden aus Main auf.

Die Methoden aus den Aufgaben 1–5 sollen static sein, damit du sie direkt aus main aufrufen kannst, ohne zuerst ein Objekt von TravelTools zu erstellen.

## Aufgaben

### 1. Reiseübersicht ausgeben: `void`
Schreibe eine Methode, die ein Reiseziel und die Anzahl der Tage als Parameter erhält und einen Satz dazu ausgibt.

```java
static void printTripSummary(String destination, int days)
```
Beispielaufruf:

```java
TravelTools.printTripSummary("Berlin", 4);
```
Mögliche Ausgabe:

```text
Reise nach Berlin: 4 Tage
```
### 2. Wettermeldung zurückgeben: `String`
Schreibe eine Methode, die eine Temperatur erhält und eine passende Meldung zurückgibt:

- Unter 0: `Eiskalt`
- 0–15: `Kalt`
- 16–25: `Mild`
- Über 25: `Warm`

```java
static String getWeatherMessage(int temperature)
```
Beispiel:

```java
String message = TravelTools.getWeatherMessage(18);
System.out.println(message);
```
### 3. Parkgebühr berechnen: `double`
Die Parkgebühr beträgt 4,50 € pro Stunde. Schreibe eine Methode, die die Anzahl der Stunden erhält und die Gesamtgebühr berechnet und zurückgibt.

```java
static double calculateParkingFee(int hours)
```
Beispiel:

```java
double fee = TravelTools.calculateParkingFee(3);
System.out.println(fee);
```
Optionale Erweiterung: Nimm einen zusätzlichen boolean-Parameter entgegen, der angibt, ob es Wochenende ist. Am Wochenende kommt ein Aufschlag von 5 € hinzu.

### 4. Lange Reise prüfen: `boolean`
Schreibe eine Methode, die eine Entfernung in Kilometern erhält und true zurückgibt, wenn die Entfernung mehr als 300 km beträgt. Andernfalls soll sie false zurückgeben.

```java
static boolean isLongTrip(double distanceKm)
```
Beispiel:

```java
boolean longTrip = TravelTools.isLongTrip(450);
System.out.println(longTrip);
```
### 5. Kraftstoffkosten berechnen: `double`
Schreibe eine Methode, die folgende Werte erhält:

- Entfernung in Kilometern
- Kraftstoffverbrauch in Litern pro 100 km
- Kraftstoffpreis pro Liter
Die Methode soll die geschätzten Kraftstoffkosten berechnen und zurückgeben.

```java
static double calculateFuelCost(
        double distanceKm,
        double litersPer100Km,
        double pricePerLiter)
```
Formeln:

```text
verbrauchte Liter = Entfernung / 100 * Verbrauch pro 100 km
Kosten = verbrauchte Liter * Preis pro Liter
```
Beispiel:

```java
double cost =
        TravelTools.calculateFuelCost(200, 7.0, 1.80);
System.out.println(cost);
```
### 6. Countdown
Schreibe in der Klasse TravelTools eine Methode, die eine Startzahl erhält und mithilfe einer while-Schleife von dieser Zahl bis einschließlich null herunterzählt.

Wenn die Startzahl 5 ist, soll die Ausgabe so aussehen:

```text
5
4
3
2
1
0
```
Rufe die Methode aus main auf.

Überlege selbst: Wie soll die Methode heißen? Welche Parameter braucht sie? Soll sie etwas zurückgeben oder nur etwas ausgeben?

### 7. Summe eines Zahlenbereichs
Schreibe in der Klasse TravelTools eine Methode, die eine Startzahl und eine Endzahl erhält. Sie soll die Summe aller Ganzzahlen in diesem Bereich berechnen, einschließlich der Start- und Endzahl, und das Ergebnis an den aufrufenden Code zurückgeben. Verwende eine Schleife.

Zum Beispiel ergibt der Bereich von 1 bis 5 die Summe 15.

Rufe deine Methode aus main auf, speichere das Ergebnis in einer Variablen und gib es aus.

Überlege selbst: Wie soll die Methode heißen? Welche Parameter und welchen Rückgabetyp braucht sie?

## `Main.java`: Beispiel für die Aufgaben 1–5

```java
public class Main {
    public static void main(String[] args) {
        TravelTools.printTripSummary("Berlin", 4);

        String weather = TravelTools.getWeatherMessage(18);
        System.out.println(weather);

        double parkingFee = TravelTools.calculateParkingFee(3);
        System.out.println("Parkgebühr: " + parkingFee + " €");

        boolean longTrip = TravelTools.isLongTrip(450);
        System.out.println("Ist es eine lange Reise? " + longTrip);

        double fuelCost =
                TravelTools.calculateFuelCost(200, 7.0, 1.80);
        System.out.println("Kraftstoffkosten: " + fuelCost + " €");

        // Ergänze hier die Aufrufe für die Aufgaben 6 und 7.
    }
}
```

## Darauf solltest du achten

- Parameter stehen in der Methodendeklaration; sie beschreiben die Eingaben.
- Argumente sind die konkreten Werte, die du beim Aufruf übergibst.
- Anzahl, Typ und Reihenfolge der Argumente müssen zu den Parametern passen.
- Der Rückgabewert muss zum angegebenen Rückgabetyp passen.
- `void` bedeutet, dass eine Methode keinen Wert zurückgibt.