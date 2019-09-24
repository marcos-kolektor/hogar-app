
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import hogar.dao.TipoDao;

public class Main {

	public static void main(String[] args) {
		// /* Initiate Spring application context. */
		//ApplicationContext springAppContext = new ClassPathXmlApplicationContext("BeanSettings.xml");
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		TipoDao td = (TipoDao) ctx.getBean("tipo");
		System.out.print("ID_TIPO: " + td.getIdTipo() + " - " + "DETALLE: " + td.getDetalle());


	}

}
