package patch.logic;

import java.util.Formatter;
import java.util.ResourceBundle;

/**
 * @author <a href="mailto:carlo@nerdnet.nl">Carlo de Wolf</a>
 */
public class Greeter {
    private static final Formatter formatter = new Formatter();

    public static void sayHi(final String name) {
        final String greeting = ResourceBundle.getBundle(Greeter.class.getName()).getString("greeting");
        System.out.println("v1 p1: " + formatter.format(greeting, name));
    }
}
