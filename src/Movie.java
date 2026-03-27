import java.util.ArrayList;

public class Movie {
    private String title = "";
    private ArrayList<String> cast = new ArrayList<>();
    private String director = "";
    private String overview = "";
    private int runtime = 0;
    private double rating = 0.0;

    public void Movie(String title, ArrayList<String> cast, String director, String overview, int runtime, double rating){
        this.title = title;
        this.cast = cast;
        this.director = director;
        this.overview = overview;
        this.runtime = runtime;
        this.rating = rating;
    }

    public String getTitle(){
        return title;
    }

    public ArrayList<String> getCast(){
        return cast;
    }

    public String getDirector(){
        return director;
    }

    public String getOverview(){
        return overview;
    }

    public int getRuntime(){
        return runtime;
    }

    public double getRating(){
        return rating;
    }

    @Override
    public String toString() {
        return ("TITLE: " + this.getTitle() + "\n CAST: " + this.getCast() + "\n DIRECTOR: "
                + this.getDirector() + "\n OVERVIEW: " + this.getOverview() + "\n RUNTIME: " +
                this.getRuntime() + "\n USER RATING: " + this.getRating());
    }
}
