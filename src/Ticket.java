public sealed class Ticket permits HalfPriceTicket, FamilyTicket{

    protected double price;

    protected String movieTitle;

    protected String soundTrack;

    public Ticket(double price, String movieTitle, String soundTrack) {
        this.price = price;
        this.movieTitle = movieTitle;
        this.soundTrack = soundTrack;
    }

    public double getPrice() {
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

    public  double getPrice(int amount){
        return this.getPrice() * amount;
    };
}



