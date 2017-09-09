package mushroom.spring.config;

import javax.sql.DataSource;

import mushroom.spring.dao.ContactDAO;
import mushroom.spring.dao.ContactDAOImpl;
import mushroom.spring.dao.CustomerDAO;
import mushroom.spring.dao.CustomerDAOImpl;
import mushroom.spring.dao.InventoryDAO;
import mushroom.spring.dao.InventoryDAOImpl;
import mushroom.spring.dao.OrderDAO;
import mushroom.spring.dao.OrderDAOImpl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


/**
 * @author Eugene
 * @version 1.0
 * @since 2017
 *
 */
@EnableWebMvc
@Configuration
@ComponentScan({ "mushroom.spring.*" })
public class MvcConfiguration extends WebMvcConfigurerAdapter {

	@Bean
	public ViewResolver getViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}


	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl(databaseConfig.Credentials.url);
		dataSource.setUsername(databaseConfig.Credentials.username);
		dataSource.setPassword(databaseConfig.Credentials.password);
		
		return dataSource;
	}

	@Bean
	public CustomerDAO getCustomerDAO() {
		return new CustomerDAOImpl(getDataSource());
	}
	
	@Bean 
	public OrderDAO getOrderDAO() {
		return new OrderDAOImpl(getDataSource());
	}
		
	@Bean
	public ContactDAO getContactDAO() {
		return new ContactDAOImpl(getDataSource());
	}
	
	
	@Bean
	public InventoryDAO getInventoryDAO() {
		return new InventoryDAOImpl(getDataSource());
	}

}
