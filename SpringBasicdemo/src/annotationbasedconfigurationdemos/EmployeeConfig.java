package annotationbasedconfigurationdemos;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
/*Because you are using Java-based annotations,
so you also need to add CGLIB.jar from your Java installation directory and ASM.jar
library which can be downloaded from asm.ow2.org.*/
@Configuration
public class EmployeeConfig {

	@Bean
Emp emp(){
Emp obj=new Emp();
obj.setEmpid(101);
return obj;
}
	
	
}
