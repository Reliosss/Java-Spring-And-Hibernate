import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScope {
    public static void main(String[] args){

        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve singleton beans from spring container
        Coach coachS = context.getBean("myCoach", Coach.class);
        Coach coachS1 = context.getBean("myCoach", Coach.class);

        // check if they are the same
        boolean resultS = (coachS == coachS1);
        System.out.println("\n Pointing to the same object: " + resultS);
        System.out.println("\n Memory location for the coach: " + coachS);
        System.out.println("\n Memory location for the coach1: " + coachS1);

        // retrieve prototype beans from spring container
        Coach coachP = context.getBean("myCoach1", Coach.class);
        Coach coachP1 = context.getBean("myCoach1", Coach.class);

        // check if they are the same
        boolean resultP = (coachP == coachP1);
        System.out.println("\n Pointing to the same object: " + resultP);
        System.out.println("\n Memory location for the coach: " + coachP);
        System.out.println("\n Memory location for the coach1: " + coachP1);

        //  close the context
        context.close();
    }
}
