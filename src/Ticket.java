public sealed class Ticket permits HalfPriceTicket, FamilyTicket{

    private float price;

    private String movieTitle;

    private String soundTrack;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getSoundTrack() {
        return soundTrack;
    }

    public void setSoundTrack(String soundTrack) {
        this.soundTrack = soundTrack;
    }
}



