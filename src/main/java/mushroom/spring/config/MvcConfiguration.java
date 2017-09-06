package mushroom.spring.config;

import javax.sql.DataSource;

import mushroom.spring.dao.CustomerDAO;
import mushroom.spring.dao.CustomerDAOImpl;

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
		dataSource.setUrl("jdbc:mysql://mushcompany.cprgcmiyeqkl.eu-west-1.rds.amazonaws.com:3306/mushroomcompany1");
		dataSource.setUsername("mushroom");
		dataSource.setPassword("mushroom1");
		
		return dataSource;
	}

	@Bean
	public CustomerDAO getCustomerDAO() {
		return new CustomerDAOImpl(getDataSource());
	}

}
