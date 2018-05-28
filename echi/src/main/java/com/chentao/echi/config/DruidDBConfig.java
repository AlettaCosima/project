package com.chentao.echi.config;


import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import com.alibaba.druid.pool.DruidDataSource;

/**
 * druid连接池配置类
 */
@Configuration
@PropertySource(value = "classpath:druid-datasource.yml", ignoreResourceNotFound = true)
@ConfigurationProperties(prefix = "spring.datasource")
public class DruidDBConfig {
    @Value("${url}")
    private String url;

    @Value("${name}")
    private String name;

    @Value("${password}")
    private String password;

    @Value("${driverClassName}")
    private String driverClassName;

    @Value("${initialSize}")
    private int initialSize;

    @Value("${minIdle}")
    private int minIdle;

    @Value("${maxActive}")
    private int maxActive;

    @Value("${maxWait}")
    private int maxWait;

    @Value("${timeBetweenEvictionRunsMillis}")
    private int timeBetweenEvictionRunsMillis;

    @Value("${minEvictableIdleTimeMillis}")
    private int minEvictableIdleTimeMillis;

    @Value("${validationQuery}")
    private String validationQuery;

    @Value("${testWhileIdle}")
    private boolean testWhileIdle;

    @Value("${testOnBorrow}")
    private boolean testOnBorrow;

    @Value("${testOnReturn}")
    private boolean testOnReturn;

    @Value("${poolPreparedStatements}")
    private boolean poolPreparedStatements;

    @Value("${maxPoolPreparedStatementPerConnectionSize}")
    private int maxPoolPreparedStatementPerConnectionSize;

    @Value("${filters}")
    private String filters;

    @Value("${connectionProperties}")
    private String connectionProperties;

    @Bean // 声明其为Bean实例
    @Primary // 在同样的DataSource中，首先使用被标注的DataSource
    public DataSource dataSource() {
        DruidDataSource datasource = new DruidDataSource();

        datasource.setUrl(this.url);
        datasource.setUsername(this.name);
        datasource.setPassword(this.password);
        datasource.setDriverClassName(this.driverClassName);

        // configuration
        datasource.setInitialSize(this.initialSize);
        datasource.setMinIdle(this.minIdle);
        datasource.setMaxActive(this.maxActive);
        datasource.setMaxWait(this.maxWait);
        datasource.setTimeBetweenEvictionRunsMillis(this.timeBetweenEvictionRunsMillis);
        datasource.setMinEvictableIdleTimeMillis(this.minEvictableIdleTimeMillis);
        datasource.setValidationQuery(this.validationQuery);
        datasource.setTestWhileIdle(this.testWhileIdle);
        datasource.setTestOnBorrow(this.testOnBorrow);
        datasource.setTestOnReturn(this.testOnReturn);
        datasource.setPoolPreparedStatements(this.poolPreparedStatements);
        datasource.setMaxPoolPreparedStatementPerConnectionSize(this.maxPoolPreparedStatementPerConnectionSize);
        try {
            datasource.setFilters(this.filters);
        } catch (SQLException e) {

        }
        datasource.setConnectionProperties(this.connectionProperties);

        return datasource;
    }
}
