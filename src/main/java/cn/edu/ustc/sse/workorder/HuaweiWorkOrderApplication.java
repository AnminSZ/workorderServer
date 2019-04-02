package cn.edu.ustc.sse.workorder;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.edu.ustc.sse.workorder.mapper")
public class HuaweiWorkOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(HuaweiWorkOrderApplication.class, args);
    }

}
