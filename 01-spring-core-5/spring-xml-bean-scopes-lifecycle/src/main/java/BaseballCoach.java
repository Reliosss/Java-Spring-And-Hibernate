public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService){
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

    // init method
    public void initMethod(){
        System.out.println("BaseballCoach --> init method");
    }

    // destroy method
    public void destroyMethod(){
        System.out.println("BaseballCoach --> destroy method");
    }
}
