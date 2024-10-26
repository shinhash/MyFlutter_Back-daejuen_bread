package dev.hash.hashBackEnd.config;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:/application.properties")
@MapperScan("dev.hash.hashBackEnd.**.mapper")
public class MapperDBConfig {
	public static void main(String[] args) {
		SpringApplication.run(MapperDBConfig.class, args);
	}
}
