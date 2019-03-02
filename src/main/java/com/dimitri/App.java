package com.dimitri;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        PriceMaker test;
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        test = (PriceMaker)ctx.getBean("priceSearch");
        System.out.println("The price of the items are: "+ test.fullPrice(100,1.50));
    }
}
