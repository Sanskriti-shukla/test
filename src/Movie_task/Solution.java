package Movie_task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Movie> movies = new ArrayList<>();
        System.out.println("Enter the number you want");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the movieName..");
            String movieName = sc.next();
            System.out.println("Enter the company..");
            String company = sc.next();
            System.out.println("Enter the genre..");
            String genre = sc.next();
            System.out.println("Enter the budget..");
            int budget = sc.nextInt();
            movies.add(new Movie(movieName, company, genre, budget));
        }
        String genre1 = sc.next();
        List<Integer> output = getMovieByGenre(movies, genre1);
        for (Integer integer : output) {
            if (integer > 80000000)
                System.out.println("High Budget Movie");
            else
                System.out.println("Low budget movie");
        }
    }

    public static List<Integer> getMovieByGenre(List<Movie> movies, String genre) {
        List<Integer> list = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getGenre().equals(genre)) {
                list.add(movie.getBudget());
            }

        }
        return list;
    }
}

