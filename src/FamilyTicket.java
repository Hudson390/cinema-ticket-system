public non-sealed class FamilyTicket extends Ticket {

    public FamilyTicket(Ticket ticket) {
        super(ticket.getPrice(), ticket.getMovieTitle(), ticket.getSoundTrack());
    }

    @Override
    public double getPrice(int amount) {
        if (amount > 2){
            var result = super.getPrice() * amount;
            var discount = result * 0.05;
            return result - discount;
        } else {
            return super.getPrice() * amount;
        }

    }
}
