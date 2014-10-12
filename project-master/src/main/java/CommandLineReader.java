import org.apache.commons.cli.*;

/**
 * Created by IntelliJ IDEA.
 * Author: Hicham B.I.
 * Date: 12/10/14
 * Time: 20:05
 */
public class CommandLineReader {
    private final Options options = new Options();
    private String[] args;

    private int port;
    private boolean daemon;

    public CommandLineReader(String[] args) {
        this.args = args;

        options.addOption("h", "help", false, "show help.");
        options.addOption("d", "daemon", false, "daemon mode. default : false.");
        options.addOption("p", "port", true, "tomcat port. default : 8080");
    }

    public void parse() throws ParseException {
        CommandLineParser parser = new BasicParser();

        CommandLine cmd = parser.parse(options, args);

        if (cmd.hasOption("h")) {
            showHelp();
        }

        daemon = cmd.hasOption("d");
        port = cmd.hasOption("p") ? Integer.parseInt(cmd.getOptionValue("p")) : 8080;

    }

    private void showHelp() {
        HelpFormatter helpFormatter = new HelpFormatter();
        helpFormatter.printHelp("Embedded Tomcat Launcher", options);
        System.exit(0);
    }


    public int getPort() {
        return port;
    }

    public boolean isDaemon() {
        return daemon;
    }
}
