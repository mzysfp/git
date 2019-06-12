package cn.itcast.test;

import cn.itcast.dao.ItemsDao;

import cn.itcast.domain.Items;
import cn.itcast.service.ItemsService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) throws Exception {

//        Items id = new ClassPathXmlApplicationContext("applicationContext.xml").getBean(ItemsDao.class).findById(1);
//        Items id = new ClassPathXmlApplicationContext("applicationContext.xml").getBean(ItemsService.class).findById(1);
//        System.out.println(id.getName());

        System.out.println(new ClassPathXmlApplicationContext("applicationContext.xml").getBean(ItemsService.class).findById(1).getDetail());

    }
}