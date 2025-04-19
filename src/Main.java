public class Main {
    public static void main(String[] args) {

        String[] movies  =  {"Top gun: maverick", "Star Wars: revenge of the sith"};
        String[] movies_desc = {"a 2022 action drama film about a US Navy Captain who returns to Top Gun to train a group of younger pilots", "is a 2005 film that concludes the Star Wars prequel trilogy. It tells the story of Anakin Skywalker's turn to the dark side,\n the rise of the Galactic Empire, and the fall of the Jedi Order"};
        int[] movies_stars = {7, 8};

        System.out.println("alura movies");
        System.out.println("movies: " + movies[0] + "  " + movies[1] + "\n" );


        for (int i=0; i<2; i++){

            System.out.println("movie: "+ movies[i]  );
            System.out.println("description: " + movies_desc[i]);
            System.out.println("stars: " + movies_stars[i]/2);
            System.out.println("\n");
        }

    }
}

