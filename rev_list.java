import java.util.LinkedList;
import java.util.ListIterator;

class Main {
    public static void main(String[] args) {
        LinkedList<String> animals= new LinkedList<>();

        // Add elements in LinkedList
        animals.add("Dog");
        animals.add("Horse");
        animals.add("Cat");

        // Create an object of ListIterator
        ListIterator<String> listIterate = animals.listIterator();
        System.out.print("LinkedList: ");

        while(listIterate.hasNext()) {
            System.out.print(listIterate.next());
            System.out.print(", ");
        }

        // Iterate backward
        System.out.print("\nReverse LinkedList: ");

        while(listIterate.hasPrevious()) {
            System.out.print(listIterate.previous());
            System.out.print(", ");
        }
    }
}