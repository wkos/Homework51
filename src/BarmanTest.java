public class BarmanTest {
    public static void main(String[] args) {
        Barman barman = new Barman();
        boolean alcoholFree = true;
        Person person1 = new Person("Jan", "Abacki", 12);
        Person person2 = new Person("Ewa", "Babacki", 12);
        Person person3 = new Person("Ula", "Cabacki", 22);
        Person person4 = new Person("Ola", "Dabacki", 42);
        Drink drink1 = new Drink("pierwszy bez", 13.55, alcoholFree);
        Drink drink2 = new Drink("drug z", 22.34, !alcoholFree);
        System.out.println("Pierwsze zamówienie: " + barman.order(person1,drink1));
        System.out.println("Drugie zamówienie: " + barman.order(person2,drink2));
        System.out.println("Trzecie zamówienie: " + barman.order(person3,drink1));
        System.out.println("Czwarte zamówienie: " + barman.order(person4,drink2));
    }
}
