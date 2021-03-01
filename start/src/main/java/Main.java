import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springidol.Performer;

public class Main {
    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            System.out.println();
        }
        ApplicationContext ctx=new ClassPathXmlApplicationContext("/ConfTrying.xml");
        Performer performer=(Performer)ctx.getBean("duke");
        performer.perform();
    }
}
