public class Exercise3 {
    public static void main(String[] args) {
        String[][] countriesAndCapitals = {
                {"USA", "Washington D.C."},
                {"Canada", "Ottawa"},
                {"Mexico", "Mexico City"},
                {"Brazil", "Brasília"},
                {"Argentina", "Buenos Aires"}
        };

        for (String[] countryAndCapital : countriesAndCapitals) {
            String country = countryAndCapital[0];
            String capital = countryAndCapital[1];
            System.out.println(country + ": " + capital);
        }
    }
}
