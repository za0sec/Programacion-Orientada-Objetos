package Parciales.P1.P_2022_02;

public class TVEpisode {
    private final int id;
    private final String title;
    private final double rating;
    private final LocalDate airedDate;

    public TVEpisode(int id, String title, double rating, LocalDate airedDate) {
        this.id = id;
        this.title = title;
        this.rating = rating;
        this.airedDate = airedDate;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getRating() {
        return rating;
    }

    public LocalDate getAiredDate() {
        return airedDate;
    }
}

