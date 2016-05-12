// How to run?
// java -Xmx1m -Xms1m OutOfMemoryExample
import java.util.List;
import java.util.ArrayList;

public class OutOfMemoryExample {

    List<String> objs = new ArrayList<>();

    public void createObjects(int num) {
        for(int i=0; i<num; i++) {
            String obj = new String("String Object created, stored in heap: " + i);
            System.out.println(obj);
            objs.add(obj);
            try {
                Thread.sleep(1);
            } catch(Exception e) {
            }
        }
    }

    public static void main(String[] args) {
        OutOfMemoryExample driver = new OutOfMemoryExample();
        driver.createObjects(20000);
    }

}
