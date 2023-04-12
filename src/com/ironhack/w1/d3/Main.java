package com.ironhack.w1.d3;

public class Main {
    public static void main(String[] args) {
        Movie harryPotter = new Movie("Harry Potter", 120);
        Movie señorAnillos = new Movie("El Señor de los Anillos", 200);
    //  Movie otherMovie = harryPotter;
    //  Movie newMovie = movieCreator("Star Wars", 140);
        Movie madMax = new Movie("Mad Max");

        System.out.println("Title: " + harryPotter.getTitle() + ". Duration: " + harryPotter.getDuration() + " min.");
        System.out.println("Title: " + señorAnillos.getTitle() + ". Duration: " + señorAnillos.getDuration() + " min.");
        harryPotter.play();
        señorAnillos.play();
        Movie.getAlert();
        System.out.println(harryPotter);
        System.out.println(harryPotter.title);
        System.out.println(harryPotter.IS_GOOD);
        System.out.println(madMax);

        HorrorMovie scream = new HorrorMovie("Scream", 110, false);
        System.out.println(scream.getTitle() + " " + scream.isReallyScary());
        System.out.println(scream);
        scream.play();

//  Exercises day 3:
//  1. Create a program that reads from standard input a string and prints the count of the words that start with a vowel. Skipping all the words that don’t start with a vowel and printing it as an error.


//  2. Create a program that reads the file called oscar_age_female.csv containing the data below who have the columns Index, Year, Age, Name, Movie in format csv read it print it in a new file called result.txt in the following format.
        /*Name: <name>
                Year: <year>
                Age: <age>
                Movie: <movie>
                ===============*/

//  3. Suppose you are building a university registration application where students can track and select courses.
//
//  Create and instantiate a Course class with the fields classId, capacity, studentCount, and title and all getters and setters.


    }

/*    public static Movie movieCreator(String title, int duration){
        return new Movie(title,duration);
    }
 */

}
