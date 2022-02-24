package movies;
import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        Movie[] movies = MoviesArray.findAll();
        Input userInput = new Input();
        while (true) {
            System.out.print("What would you like to do?:\n0 - exit\n1 - view all movies\n2 - view movies in the animated category\n3 - view movies in the drama category\n4 - view movies in the horror category\n5 - view movies in the sci-fi category\n\n Select an option: ");
            String userChoice = userInput.getString();
            switch (userChoice) {
                case "0":
                    System.out.println("Until next time...");
                    return; //breaks user out of while loop
                case "1":
                    System.out.println("All Films:\n");
                    for (Movie movie : movies) {
                        System.out.println(movie.getTitle());
                    }
                    break;
                case "2":
                    System.out.println("Animated Films:\n");
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("animated")) {
                            System.out.println(movie.getTitle());
                        }
                    }
                    break;
                case "3":
                    System.out.println("Drama Films:\n");
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("drama")) {
                            System.out.println(movie.getTitle());
                        }
                    }
                    break;
                case "4":
                    System.out.println("Horror Films:\n");
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("horror")) {
                            System.out.println(movie.getTitle());
                        }
                    }
                    break;
                case "5":
                    System.out.println("Scifi Films:\n");
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("scifi")) {
                            System.out.println(movie.getTitle());
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid!");
                    break;
            }
            System.out.println();
        }
    }
}

/*
Give the user a list of options for viewing all the movies or viewing movies by category.
Use your Input class to get input from the user, and display information based on their choice. (Remember to import your Input class)
If a category is selected, only movies from that category should be displayed.
Your application should continue to run until the user chooses to exit.
Sample Output


What would you like to do?

0 - exit
1 - view all movies
2 - view movies in the animated category
3 - view movies in the drama category
4 - view movies in the horror category
5 - view movies in the scifi category

Enter your choice: 1

Frankenstein -- horror
Goodfellas -- drama
Pulp Fiction -- drama
...
Bonus

Add functionality to allow a user to add a new movie to the list.

*/