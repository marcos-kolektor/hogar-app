
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import ar.com.hogar.repository.DataSource;

public class Main {

	public static void main(String[] args) {
		// /* Initiate Spring application context. */
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("applicationContext.xml");
		DataSource dataSource = (DataSource) ctx.getBean("beanDataSource");
		//System.out.print("URL_JDBC: " + dataSource.getDs());
		ctx.close();

	}

}
