public class Main {
    public static void main(String[] args) {
        int ticketPrice = 12000; // Подставить любую стоимость билета.
        int bonusMiles = 20;
        int totalMiles = ticketPrice / bonusMiles;

        System.out.println("Бонус: " + totalMiles + " миль.");
    }
}
