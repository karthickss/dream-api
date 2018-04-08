package com.dream.app.config;

/**
 * Created by karthickraj on 08/04/8.
 */
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@Configuration
@EnableJpaRepositories(basePackages = "com.dream.app.core.repository")
@EnableTransactionManagement(proxyTargetClass = true)
public class PersistenceConfig
{
    private static final Logger log = LoggerFactory.getLogger(PersistenceConfig.class);

    @Value("${connection.driver_class}")
    private String driverClass;
    @Value("${connection.url}")
    private String jdbcUrl;
    @Value("${connection.username}")
    private String user;
    @Value("${connection.password}")
    private String password;
    @Value("${minPoolSize}")
    private String minPoolSize;
    @Value("${maxPoolSize}")
    private String maxPoolSize;
    @Value("${checkoutTimeout}")
    private String checkoutTimeout;
    @Value("${maxStatements}")
    private String maxStatements;
    @Value("${idleConnectionTestPeriod}")
    private String idleConnectionTestPeriod;
    @Value("${preferredTestQuery}")
    private String preferredTestQuery;
    @Value("${dialect}")
    private String dialect;
    @Value("${show_sql}")
    private String showSql;
    @Value("${generateDdl}")
    private String generateDdl;

    @Bean(destroyMethod = "close")
    public DataSource dataSource() throws PropertyVetoException
    {

        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass(driverClass);
        dataSource.setJdbcUrl(jdbcUrl);
        dataSource.setUser(user);
        dataSource.setPassword(password);
        dataSource.setMinPoolSize(Integer.parseInt(minPoolSize));
        dataSource.setMaxPoolSize(Integer.parseInt(maxPoolSize));
        dataSource.setCheckoutTimeout(Integer.parseInt(checkoutTimeout));
        dataSource.setMaxStatements(Integer.parseInt(maxStatements));
        dataSource.setIdleConnectionTestPeriod(Integer.parseInt(idleConnectionTestPeriod));
        dataSource.setPreferredTestQuery(preferredTestQuery);
        return dataSource;
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter()
    {
        HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
        jpaVendorAdapter.setShowSql(Boolean.parseBoolean(showSql));
        jpaVendorAdapter.setGenerateDdl(Boolean.parseBoolean(generateDdl));
        jpaVendorAdapter.setDatabasePlatform(dialect);
        return jpaVendorAdapter;
    }

    @Bean
    public PlatformTransactionManager transactionManager() throws PropertyVetoException
    {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
        return transactionManager;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() throws PropertyVetoException
    {
        LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
        factoryBean.setDataSource(dataSource());
        factoryBean.setPackagesToScan("com.dream.app.core.domain");
        factoryBean.setJpaVendorAdapter(jpaVendorAdapter());
        return factoryBean;
    }

}