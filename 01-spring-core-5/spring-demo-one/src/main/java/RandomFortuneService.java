import java.util.Random;

public class RandomFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        String[] tab = {"First Fortune","Second Fortune","Last Fortune"};

        return tab[new Random().nextInt(2)];
    }
}
