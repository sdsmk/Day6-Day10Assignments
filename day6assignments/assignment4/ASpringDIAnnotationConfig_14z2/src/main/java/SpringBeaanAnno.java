import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.eg.A;
import com.eg.Employee;
import com.config.*;
public class SpringBeaanAnno {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config1.class);
		AnnotationConfigApplicationContext ctx1 = new AnnotationConfigApplicationContext(Config2.class);


		//ctx.register(MyConfig.class);
		//ctx.refresh();
		
		Employee emp = ctx.getBean(Employee.class);
		emp.setName("fevbrgver");
		
			
		System.out.println(emp.getName());
		
		
		A oa = ctx1.getBean(A.class, 100,4.2f);
		System.out.println(oa);
		
		
		
	}
}
