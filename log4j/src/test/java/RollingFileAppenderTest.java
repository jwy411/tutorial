import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Test;

public class RollingFileAppenderTest {
    @Test
    public void name() {
        Logger logger = Logger.getLogger(this.getClass());

        logger.info("info");
        logger.info("info");
        logger.info("info");
        logger.info("info");
        logger.info("info");
        logger.info("info");
        logger.info("info");
        logger.info("info");
        logger.info("info");
        logger.info("info");
    }
}
