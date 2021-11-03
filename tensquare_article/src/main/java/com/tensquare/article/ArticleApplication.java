/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: BaseApplication
 * Author:   Brandon
 * Date:     2021/11/3 15:57
 * Description: 启动类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.tensquare.article;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import util.IdWorker;

/**
 * 〈一句话功能简述〉<br> 
 * 〈启动类〉
 *
 * @author Brandon
 * @create 2021/11/3
 * @since 1.0.0
 */
@SpringBootApplication
public class ArticleApplication {
    public static void main(String[] args) {
        SpringApplication.run(ArticleApplication.class, args);
    }

    @Bean
    public IdWorker idWorker(){
        return new IdWorker(1, 1);
    }
}
