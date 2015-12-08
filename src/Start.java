import javax.swing.*;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Максим on 05.12.2015.
 */
public class Start {

    public static void main(String[] args) {
        try {
            SwingUtilities.invokeAndWait(() -> new Frame());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

}
