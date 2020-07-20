public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(){

    }

    public TrackCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Run a hard 5 miles!";
    }

    @Override
    public String getDailyFortune(){
        return "This is your day!";
    }
}
