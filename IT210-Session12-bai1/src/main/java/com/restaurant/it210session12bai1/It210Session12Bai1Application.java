package com.restaurant.it210session12bai1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class It210Session12Bai1Application {

    public static void main(String[] args) {
        SpringApplication.run(It210Session12Bai1Application.class, args);
        System.out.println("Hospital Web Service is ready on Embedded Tomcat");
    }

}

// Phần 1 – Phân tích
// Vì sao spring-boot-starter-web được gọi là “Starter”?
//Thay vì phải tự đi thêm từng thư viện nhỏ lẻ.Spring Boot gom hết lại thành 1 “starter” và chỉ cần thêm 1 dependency là chạy được
