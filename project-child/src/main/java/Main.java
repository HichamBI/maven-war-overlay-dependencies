import org.apache.commons.cli.ParseException;

/**
 * Created by IntelliJ IDEA.
 * Author: Hicham B.I.
 * Date: 12/10/14
 * Time: 20:05
 */
public class Main {

    private int port;

    public Main(String[] args) {
        CommandLineReader commandLine = new CommandLineReader(args);
        try {
            commandLine.parse();
            this.port = commandLine.getPort();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public int getPort() {
        return port;
    }
}
