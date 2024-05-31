package com.nt.config;

import java.lang.module.ModuleDescriptor.Builder;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

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
@EnableJpaRepositories(basePackages = "com.nt.model.prod",
		entityManagerFactoryRef = "oracleEMF",
                       transactionManagerRef = "oracleTxMgr")
public class OracleDBConfig {

	@Bean
	@ConfigurationProperties(prefix = "oracle.datasource")
	@Primary
	public DataSource createOracleDs() {
		return DataSourceBuilder.create().build();
		
	}
	@Bean(name = "oracleEMF")
	@Primary
	public LocalContainerEntityManagerFactoryBean createOracleEntityManagerFactoryBean
	                                                 (EntityManagerFactoryBuilder builder) {
		
		Map<String, Object> props= new HashMap<String, Object>();
		props.put("hibernate.dialect", "org.hibernate.dialect.OracleDialect");
		props.put("hibernate.ddl-auto","update");
		props.put("show-sql", "true");
		return (LocalContainerEntityManagerFactoryBean) builder.withDataSource(createOracleDs()).build();
		
		
	}
	@Bean(name = "oracleTxMgr")
	@Primary
	public PlatformTransactionManager createOraclePlatformTransactionManager(@Qualifier("oracleEMF") EntityManagerFactory factory1) {
		return new JpaTransactionManager(factory1);
		
	}
}
