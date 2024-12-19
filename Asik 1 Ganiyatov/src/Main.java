public class Main {
    public static void main(String[] args) {

        Film film1 = new Film("Sheker", "Crime", 80);
        Film film2 = new Film("Dastur", "Drama", 90);
        Viewer viewer1 = new Viewer("Sunkar", 18);
        Viewer viewer2 = new Viewer("Adilet", 22);
        Cinema cinema1 = new Cinema("Chaplin", "Mega Silkway");
        Cinema cinema2 = new Cinema("Kinopark", "Asiapark");
        System.out.println(film1);
        System.out.println(film2);
        System.out.println(viewer1);
        System.out.println(viewer2);
        System.out.println(cinema1);
        System.out.println(cinema2);
        System.out.println("\nComparisons:");
        System.out.println("Is " + viewer1.getName() + " older than " + viewer2.getName() + "? " + (viewer1.getAge() > viewer2.getAge()));
        System.out.println("Does " + film1.getTitle() + " have a longer duration than " + film2.getTitle() + "? " + (film1.getDuration() > film2.getDuration()));
    }
}