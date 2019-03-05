package Temp;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class SampleTestngUsage {

	static Logger logger= Logger.getLogger(SampleTestngUsage.class);

    @BeforeClass
    public void setUp(){
        BasicConfigurator.configure();
      logger.info("From BeforeClass annotation");
    }

    @Test
    public void sample(){
      logger.info("From Test annotation");
    }
}
