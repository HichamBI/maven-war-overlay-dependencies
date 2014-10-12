import org.apache.commons.cli.ParseException;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 Created by IntelliJ IDEA.
 Author: Hicham B.I.
 Date: 12/10/14
 Time: 23:15
 */
public class MainTest {

    @Test
    public void test_with_arguments() throws ParseException {
        Main main = new Main(new String[]{"-p", "9999"});
        assertThat(main.getPort()).isEqualTo(9999);
    }
}
