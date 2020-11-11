package StepTwo;

import java.util.*;


public class MovieRunnerAverage {
  public static void printAverageRatings() {
    SecondRatings secondRatings = new SecondRatings ("ratedmoviesfull", "ratings");

    System.out.println("Total number of movies : " + secondRatings.getMovieSize());
    System.out.println("Total number of raters : " + secondRatings.getRaterSize());

    int MinNumOfRatings = 12; // Check the variable

    ArrayList<Rating> averageRatings = secondRatings.getAverageRatings(MinNumOfRatings);
    Collections.sort(averageRatings);
    for (Rating rating : averageRatings) {
      System.out.println(rating.getValue() + " " + secondRatings.getTitle(rating.getItem()));
    }
    System.out.println("There are " + averageRatings.size() + " movies with " +
        MinNumOfRatings + " or more ratings");
  }

  public static void getAverageRatingOneMovie() {
    SecondRatings secondRatings = new SecondRatings ("ratedmoviesfull", "ratings");

    String title = "Vacation"; // Check the variable
    int MinNumOfRatings = 3; // Check the variable

    String movieID = secondRatings.getID(title);
    ArrayList<Rating> averageRatings = secondRatings.getAverageRatings(MinNumOfRatings);
    for (Rating rating : averageRatings) {
      if (rating.getItem().equals(movieID)) {
        System.out.println("For movie \"" + title + "\" the average rating is "
            + rating.getValue());
      }
    }
  }
  public static void main(String[] args) {
    printAverageRatings();
//    getAverageRatingOneMovie();
  }
}