import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args){

        // load xml configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from the spring container
        BaseballCoach coach = context.getBean("myCoach", BaseballCoach.class);

        // use bean methods
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getEmailAddress());
        System.out.println(coach.getTeam());
    }
}
