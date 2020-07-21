public class BaseballCoach implements Coach{

    private FortuneService fortuneService;

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run 5km";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
