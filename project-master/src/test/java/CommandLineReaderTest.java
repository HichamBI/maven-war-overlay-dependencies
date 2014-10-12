import org.apache.commons.cli.ParseException;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.failBecauseExceptionWasNotThrown;

/**
 Created by IntelliJ IDEA.
 Author: Hicham B.I.
 Date: 12/10/14
 Time: 23:15
 */
public class CommandLineReaderTest {


        @Test
        public void test_default() throws ParseException {
            CommandLineReader tcl = new CommandLineReader(new String[]{""});
            tcl.parse();

            assertThat(tcl.getPort()).isEqualTo(8080);
            assertThat(tcl.isDaemon()).isFalse();
        }

        @Test
        public void test_with_arguments() throws ParseException {
            CommandLineReader tcl = new CommandLineReader(new String[]{"-p", "9999", "-d"});
            tcl.parse();
            assertThat(tcl.getPort()).isEqualTo(9999);
            assertThat(tcl.isDaemon()).isTrue();
        }

        @Test
        public void test_fail_whith_bad_arguments() {
            CommandLineReader tcl = new CommandLineReader(new String[]{"-n", "noob"});
            try {
                tcl.parse();
                failBecauseExceptionWasNotThrown(ParseException.class);
            } catch (ParseException e) {
                assertThat(e).hasMessage("Unrecognized option: -n");
            }
        }
    }