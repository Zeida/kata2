package kata1;
import java.util.Date;
public class Kata1 {
    
    public static void main(String[] args) {
        Person person = new Person("Zeida", new Date(97,0,5));
        System.out.println(person.getName() + " tiene " + person.getAge());
    }
    
}
