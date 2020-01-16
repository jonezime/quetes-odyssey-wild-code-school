class IndianaMovies {

    public static void main(String[] args) {

        String[] movies = { "Indiana Jones et les Aventuriers de l'arche perdue", "Indiana Jones et le Temple maudit",
                "Indiana Jones et la Dernière Croisade" };

        String[] actors = { "Harrison Ford, Karen Allen, Paul Freeman", "Harrison Ford, Kate Capshaw, Jonathan Ke Quan",
                "Harrison Ford, Sean Connery, Denholm Elliott" };

        for (int i = 0; i < movies.length; ++i)
            System.out.println("Dans le film " + movies[i] + ", les principaux acteurs sont : " + actors[i]);

    }
}