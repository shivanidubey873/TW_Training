package com.tw;
import java.util.Objects;
import java.util.Scanner;

class Movie {
    private final String title;
    private final String studio;
    private final String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }
    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public static Movie[] getPg(Movie[] movieArray) {
        Movie[] pgRatedMovies;
        pgRatedMovies = new Movie[movieArray.length];
        int pgMovieCount=0;
        for(Movie movie : movieArray){
            if(Objects.equals(movie.rating, "PG")){
                pgRatedMovies[pgMovieCount]= new Movie(movie.title,movie.studio);
                pgMovieCount+=1;
            }
        }
        return pgRatedMovies;
    }

    public String getRating() {
        return rating;
    }

    public String getStudio() {
        return studio;
    }

    public String getTitle() {
        return title;
    }
}

public class MovieMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Movie[] movieArray = new Movie[4];
        movieArray[0]=new Movie("Casino Royale","Eon Productions","PG-13");
        for(int index=1;index<4;index++){
            String title,studio,rating;
            title=scan.nextLine();
            studio=scan.nextLine();
            rating=scan.nextLine();
            movieArray[index]=new Movie(title,studio,rating);
        }
        Movie[] pgRatedMovies=Movie.getPg(movieArray);
        for (Movie pgRatedMovie : pgRatedMovies) {
            if(pgRatedMovie==null){
                break;
            }
            System.out.println("Title: " + pgRatedMovie.getTitle() + "  Studio: " + pgRatedMovie.getStudio() + "  Rating: " + pgRatedMovie.getRating());
        }

    }
}
