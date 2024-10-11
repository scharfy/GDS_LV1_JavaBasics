public class Generics {
    public static void main(String[] args) {
        System.out.println("Hello World");
        //Praktische Beispiel für Generics
        //Generics sind Klassen, die mit Typen parametrisiert sind.
        //Sie ermöglichen es, Typen (Klassen und Interfaces) als Parameter zu übergeben, wenn Klassen, Interfaces und Methoden deklariert werden.
        //Ein Vorteil von Generics ist, dass sie Typsicherheit bieten, indem sie sicherstellen, dass der Compiler nur die richtigen Typen akzeptiert.
        //Ein weiterer Vorteil von Generics ist, dass sie den Bedarf an Typumwandlungen (Casting) eliminieren.
        //Generics ermöglichen es, Klassen und Methoden zu schreiben, die mit verschiedenen Typen arbeiten können, ohne dass der Code dupliziert werden muss.
        //Generics können auch verwendet werden, um die Wiederverwendbarkeit von Code zu verbessern, indem sie es ermöglichen, Klassen und Methoden zu schreiben, die mit verschiedenen Typen arbeiten können.
        //Generics können auch verwendet werden, um die Lesbarkeit von Code zu verbessern, indem sie es ermöglichen, den Typ eines Objekts oder einer Methode in der Deklaration anzugeben.
        //Anwendungsbeispiele für Generics
        //Ein Anwendungsbeispiel für Generics ist die Verwendung von Generics in einer Liste, um eine Liste von Elementen eines bestimmten Typs zu erstellen.
        //Ein weiteres Anwendungsbeispiel für Generics ist die Verwendung von Generics in einer Map, um eine Zuordnung von Schlüsseln und Werten eines bestimmten Typs zu erstellen.
        //Ein weiteres Anwendungsbeispiel für Generics ist die Verwendung von Generics in einer Methode, um eine Methode zu schreiben, die mit verschiedenen Typen arbeiten kann.
        //Ein weiteres Anwendungsbeispiel für Generics ist die Verwendung von Generics in einer Klasse, um eine Klasse zu schreiben, die mit verschiedenen Typen arbeiten kann.
        //Ein weiteres Anwendungsbeispiel für Generics ist die Verwendung von Generics in einem Interface, um ein Interface zu schreiben, das mit verschiedenen Typen arbeiten kann.

    }

    //Generics in Java
    public <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}
