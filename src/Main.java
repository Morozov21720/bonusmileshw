public class Main {
    public static void main(String[] args) {

        int ticketPrice = 13676;  // Стоимость билета в рублях
        int rublesPerMile = 20;   // Количество рублей для одной бонусной мили

        int bonusMiles = ticketPrice / rublesPerMile;

        System.out.println("Количество бонусных миль: " + bonusMiles);
    }
}
