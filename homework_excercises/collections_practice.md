# Java-Übungen: ArrayList und HashMap

## Ziel

Übe den Umgang mit `ArrayList` und `HashMap` sowie Schleifen, Bedingungen und Methoden.

## Aufgaben

### 1. Einkaufsliste — `ArrayList<String>`

Erstelle eine `ArrayList<String>` mit Lebensmitteln. Füge mindestens fünf Einträge hinzu. Danach:

- Gib die Liste mithilfe einer Schleife aus.
- Gib aus, wie viele Einträge sie enthält.
- Entferne einen Eintrag und gib die aktualisierte Liste aus.
- Überprüfe, ob ein bestimmter Eintrag auf der Liste steht.

Hinweis: `add`, `remove`, `size` und `contains`.

### 2. Temperaturmesswerte — `ArrayList<Double>`

Speichere die Temperaturmesswerte einer Woche in einer `ArrayList<Double>`. Verwende eine Schleife, um:

- Jeden Messwert auszugeben.
- Den höchsten Messwert zu finden und auszugeben.
- Den Durchschnitt zu berechnen und auszugeben.

### 3. Aufgabenliste — `ArrayList<Task>`

Erstelle eine Klasse `Task` mit einer Beschreibung und einem `boolean`-Wert, der angibt, ob die Aufgabe erledigt ist.

Erstelle eine `ArrayList<Task>` und füge mindestens vier Aufgaben hinzu. Gehe die Liste mit einer Schleife durch und gib für jede Aufgabe ihre Beschreibung und ihren Erledigungsstatus aus.

Herausforderung: Zähle, wie viele Aufgaben erledigt sind.

### 4. Produktlager — `HashMap<String, Integer>`

Erstelle eine `HashMap`, in der Produktnamen die Schlüssel und Lagerbestände die Werte sind.

Füge mindestens vier Produkte hinzu. Danach:

- Suche ein Produkt anhand seines Namens und gib dessen Lagerbestand aus.
- Überprüfe, ob ein Produkt in der Map enthalten ist.
- Aktualisiere den Lagerbestand eines Produkts.
- Entferne ein Produkt.
- Gib alle Produktnamen und Lagerbestände aus.

Hinweis: `put`, `get`, `containsKey`, `remove` und `entrySet`.

### 5. Schülernoten — `HashMap<String, Integer>`

Erstelle eine `HashMap`, in der die Namen der Schüler die Schlüssel und ihre Noten die Werte sind. Füge mindestens fünf Schüler hinzu. Verwende anschließend eine Schleife, um:

- Jeden Schüler und seine Note auszugeben.
- Den Schüler mit der höchsten Note zu finden.
- Den Klassendurchschnitt zu berechnen.
- Zu zählen, wie viele Schüler bestanden haben. Als bestanden gilt eine Note von mindestens 60.