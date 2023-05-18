package maven.example.basic;
import java.util.stream.Stream;
import org.apache.commons.lang3.StringUtils;

public class Application {

    public Application() {

        System.out.println ("Inside Application");
    }

    public int countWords(String word){
        String[] separateWords = StringUtils.split(word, ' ');
        return (separateWords == null)? 0: separateWords.length;
    }

    public void excecuteStream(){
        long sum= Stream.iterate(0, i-> i<= 1000, i -> i+1)
                .mapToInt(s->s)
                .sum();

        System.out.println("SERIAL SUM REDUCTION USANDO SUM "  + sum);

    }

    public static void main (String[] args) {

        System.out.println ("Starting Application");
        Application app = new Application();
        app.excecuteStream();
        int count = app.countWords("Tengo tres palabras");
        System.out.println("He contado "+ count + " palabras.");
    }


}