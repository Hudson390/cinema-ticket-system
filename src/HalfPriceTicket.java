public non-sealed class HalfPriceTicket extends Ticket {

    public HalfPriceTicket(Ticket ticket) {
        super(ticket.getPrice(), ticket.getMovieTitle(), ticket.getSoundTrack());
    }

    @Override
    public double getPrice() {
        return super.getPrice() / 2;
    }
}
