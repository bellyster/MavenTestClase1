package maven.example.basic;

public class Application {

    public Application() {

        System.out.println ("Inside Application");
    }

    public static void main (String[] args) {

        System.out.println ("Starting Application");
        Application app = new Application();
    }

}