package com.dimitri;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class PriceMakerImplTest {
    private PriceMaker test;
    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        test = (PriceMaker)ctx.getBean("priceSearch");
    }

    @Test
    public void fullPrice() {
        double result = test.fullPrice(10, 2.5);
        Assert.assertEquals("The quantity multiplied by the price per item",25, result, 0.00);
    }
}