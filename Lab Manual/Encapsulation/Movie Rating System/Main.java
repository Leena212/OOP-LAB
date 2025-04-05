import java.util.Scanner;
class Movie {
    private String name;
    private double[] ratings;
    public void setName(String name) { this.name = name; }
    public void setRatings(double[] ratings) { this.ratings = ratings; }
    public double calculateAverageRating() {
        double sum = 0;
        for(double rating : ratings) sum += rating;
        return sum / ratings.length;
    }
    public String getName() { return name; }
}
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Movie movie = new Movie();
        System.out.print("Enter movie name: ");
        movie.setName(obj.nextLine());
        System.out.print("Enter number of ratings: ");
        int n = obj.nextInt();
        double[] ratings = new double[n];
        System.out.println("Enter ratings:");
        for(int i=0;i<n;i++) ratings[i] = obj.nextDouble();
        movie.setRatings(ratings);
        System.out.println(movie.getName() + "'s average rating: " + movie.calculateAverageRating());
    }
}