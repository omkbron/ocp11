public class TestCast {
    public static void main(String... args) {
        byte ticketsTaken = 1;
        byte ticketsSold = 3;
        ticketsSold += 1 + ticketsTaken++;
        ticketsTaken *= 2;
        System.out.println(ticketsSold);
        ticketsSold += (long) 127;

        System.out.println(ticketsTaken);
        System.out.println(ticketsSold);
    }
}
