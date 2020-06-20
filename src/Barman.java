public class Barman {
    String order(Person person, Drink drink) {
        if (person.getAge() > 18 || drink.isAlcoholFree()) {
            return person.getFirstName() + ", Twój drink jest gotowy do odbioru. Kwota do zapłaty " +
                    drink.getPrice();
        } else {
            return "Za młody jesteś, żeby pić alkohol.";
        }
    }
}
