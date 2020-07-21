public class BadFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "U are shit!";
    }
}
