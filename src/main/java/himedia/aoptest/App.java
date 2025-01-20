package himedia.aoptest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("config/applicationContext.xml");
		// Spring Context로부터 ProductService Bean 획득
		ProductService ps = ac.getBean(ProductService.class);

		ProductVo vo = ps.findProduct("Camera");
		System.out.println(vo);
	}

}