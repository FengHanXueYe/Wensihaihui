package cn.kgc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("cn.kgc.smbms.mapper")
@SpringBootApplication
public class Bootask529Application {

    public static void main(String[] args) {
        SpringApplication.run(Bootask529Application.class, args);
    }

}
