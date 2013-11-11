package patch.main;

import patch.logic.Greeter;

/**
 * @author <a href="mailto:carlo@nerdnet.nl">Carlo de Wolf</a>
 */
public class Main {
    public static void main(final String[] args) {
        Greeter.sayHi(args[0]);
    }
}
