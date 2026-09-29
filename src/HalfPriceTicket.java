public non-sealed class HalfPriceTicket extends Ticket {

    @Override
    public float getPrice() {
        return super.getPrice() / 2;
    }
}
