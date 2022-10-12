package ioc.fortune;

import org.springframework.stereotype.Component;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

@Component
public class RandomFortuneService implements FortuneService {
    private final List<String> fortunes = new ArrayList<>();

    public RandomFortuneService() {
        try (Scanner sc = new Scanner(new FileReader("chapter-1-spring-core/src/main/resources/fortunes.txt"))) {
            while (sc.hasNextLine()) {
                fortunes.add(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getFortune() {
        Random rand = new Random();
        return fortunes.get(rand.nextInt(fortunes.size()));
    }
}
