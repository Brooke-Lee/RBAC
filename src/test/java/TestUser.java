import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @Author:Little Prince
 * @Date:2018/11/4 2:06
 * @Description:
 */
public class TestUser {

	@Test
	public void test1() throws SQLException {
		ApplicationContext context = new
				ClassPathXmlApplicationContext("spring/spring-context.xml");
		DataSource dataSource = context.getBean("dataSource", DataSource.class);
		System.out.println(dataSource.getConnection());
	}

}
