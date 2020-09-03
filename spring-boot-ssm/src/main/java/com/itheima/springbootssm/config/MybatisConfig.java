package com.itheima.springbootssm.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author mcm
 * 2020/7/5 11:58
 */
@Configuration
// 配置包扫描
@MapperScan("com.itheima.springbootssm.mapper")
public class MybatisConfig {
}
