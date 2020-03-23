import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UneClasseMetier {
	private static final Logger logger = LoggerFactory.getLogger(UneClasseMetier.class);
	
	public void uneMethodeMetier() {
		logger.info(LocalDateTime.now() + ": Début méthode");
		
		//..
		
		logger.info(LocalDateTime.now() + ": fin méthode");
	}
}
