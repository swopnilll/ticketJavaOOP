public class TicketDriver {
    public static void main(String[] args) {
        TouristTicket zooTicket = new TouristTicket("Zoo", 25.0);
        System.out.println("Tourist Ticket Purpose: " + zooTicket.getPurpose());
        System.out.println("Tourist Ticket Cost: " + zooTicket.getCost());
        System.out.println("Tourist Ticket Valid: " + zooTicket.isValid());
        System.out.println("Using Tourist Ticket: " + zooTicket.use());
        System.out.println("Tourist Ticket Valid after use: " + zooTicket.isValid());
        System.out.println("Using Tourist Ticket again: " + zooTicket.use());

        // Create a multi-use sport season ticket
        SportsSeasonTicket seasonTicket = new SportsSeasonTicket(50.0, 20.0, 3);
        System.out.println("\nSport Season Ticket Purpose: " + seasonTicket.getPurpose());
        System.out.println("Sport Season Ticket Cost: " + seasonTicket.getCost());
        System.out.println("Sport Season Ticket Valid: " + seasonTicket.isValid());
        System.out.println("Using Sport Season Ticket once: " + seasonTicket.useOnce());
        System.out.println("Using Sport Season Ticket again: " + seasonTicket.useOnce());
        System.out.println("Sport Season Ticket Valid after two uses: " + seasonTicket.isValid());
        System.out.println("Loading up Sport Season Ticket with 2 more uses");
        seasonTicket.loadUp(2);
        System.out.println("Using Sport Season Ticket again: " + seasonTicket.useOnce());
        System.out.println("Sport Season Ticket Valid after reload and use: " + seasonTicket.isValid());
    }
}
