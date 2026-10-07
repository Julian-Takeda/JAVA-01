# Java-Übungen: ArrayList, HashMap und HashSet

## Ziel

Übe den Umgang mit `ArrayList`, `HashMap` und `HashSet` sowie Schleifen, Bedingungen, Methoden und eigenen Klassen.

Geschätzte Dauer: 2–3 Stunden. Eine `ArrayList` speichert eine geordnete Folge von Elementen, ein `HashSet` verhindert Duplikate, und eine `HashMap` ordnet Schlüssel Werten zu. (dev.java)

## Aufgaben

### 1. Lieblingsgerichte — `ArrayList<String>`

Erstelle eine ArrayList<String> mit Lieblingsgerichten. Füge mindestens fünf Gerichte hinzu. Danach:

- Gib alle Gerichte mit einer Schleife aus.
- Gib die Anzahl der Gerichte aus.
- Prüfe, ob ein bestimmtes Gericht enthalten ist.
- Entferne ein Gericht und gib die aktualisierte Liste aus.

Hinweis: `add`, `contains`, `size`, `remove`.

### 2. Teilnehmerliste ohne Duplikate — `ArrayList` und `HashSet`

Erstelle eine ArrayList<String> mit den Namen der Teilnehmenden einer Veranstaltung. Einige Namen sollen absichtlich mehrfach vorkommen.

- Gib die ursprüngliche Liste aus.
- Erstelle daraus ein `HashSet<String>`.
- Gib das Set aus.
- Vergleiche die Anzahl der Listeneinträge mit der Anzahl der eindeutigen Namen im Set.

### 3. Bücherliste — `ArrayList<Book>`

Erstelle eine Klasse `Book` mit:

```java
String title;
String author;
```

Erstelle eine `ArrayList<Book>` mit mindestens vier Büchern. Verwende eine Schleife, um Titel und Autor jedes Buches auszugeben.

Herausforderung: Gib nur die Bücher eines bestimmten Autors aus.

### 4. Lagerbestand — `HashMap<String, Integer>`

Erstelle eine `HashMap`, in der Produktnamen den jeweiligen Lagerbestand zugeordnet sind.

- Füge mindestens fünf Produkte hinzu.
- Gib den Lagerbestand eines Produkts anhand seines Namens aus.
- Aktualisiere den Lagerbestand eines Produkts.
- Prüfe, ob ein bestimmtes Produkt vorhanden ist.
- Gib alle Produktnamen und Bestände aus.

Hinweis: `put`, `get`, `containsKey`, `entrySet`.

### 5. Häufigkeit von Farben — `HashMap<String, Integer>` und `ArrayList<String>`

Gegeben ist eine Liste von Farben, in der manche Farben mehrfach vorkommen:

```java
ArrayList<String> colors = new ArrayList<>();

colors.add("blau");
colors.add("rot");
colors.add("blau");
colors.add("grün");
colors.add("rot");
colors.add("blau");
```

Erstelle mithilfe einer Schleife eine `HashMap<String, Integer>`, die zählt, wie oft jede Farbe vorkommt.

Erwartete Zuordnungen:

```text
blau: 3
rot: 2
grün: 1
```

### 6. Kursanmeldungen — alle drei Collections

Verwalte Anmeldungen für Kurse:

- Verwende eine `HashMap<String, ArrayList<String>>`, wobei der Kursname der Schlüssel und die Teilnehmendenliste der Wert ist.
- Trage mindestens zwei Kurse mit mehreren Teilnehmenden ein.
- Gib für jeden Kurs den Namen und die Teilnehmenden aus.
- Prüfe, ob eine bestimmte Person für einen bestimmten Kurs angemeldet ist.
- Verwende zusätzlich ein `HashSet<String>`, um eine Liste aller eindeutigen Teilnehmenden über alle Kurse hinweg zu erstellen.

Herausforderung: Gib die Gesamtzahl der unterschiedlichen Teilnehmenden aus.