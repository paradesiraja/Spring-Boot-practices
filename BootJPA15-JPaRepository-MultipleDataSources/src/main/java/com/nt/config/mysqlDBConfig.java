package com.nt.config;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl;
import org.hibernate.jpa.boot.spi.EntityManagerFactoryBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import jakarta.persistence.EntityManagerFactory;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.nt.model.Promotions",
		               entityManagerFactoryRef = "mysqlEMF",
                       transactionManagerRef = "mysqlTxMgr")
public class mysqlDBConfig {

	@Bean
	@ConfigurationProperties(prefix = "mysql.datasource")
	public DataSource createMysqlDs() {
		return DataSourceBuilder.create().build();
		
	}
	@Bean(name = "mysqlEMF")
	public LocalContainerEntityManagerFactoryBean createMysqlEntityManagerFactoryBean
	                                                 (EntityManagerFactoryBuilder builder) {
		
		Map<String, Object> props= new HashMap<String, Object>();
		props.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		props.put("hibernate.ddl-auto","update");
		props.put("show-sql", "true");
		return (LocalContainerEntityManagerFactoryBean) builder.withValidatorFactory(props).build();
		
		
	}
	@Bean(name = "mysqlTxMgr")
	
	public PlatformTransactionManager createmysqlPlatformTransactionManager(@Qualifier("mysqlEMF") EntityManagerFactory factory) {
		return new JpaTransactionManager(factory);
		
	}
}
