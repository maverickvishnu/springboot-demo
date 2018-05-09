package com.zerototech;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.zerototech.controller.PromoController;


/**
 * Unit test for simple App.
 */
public class AppTest 
    
{
    @Test
    public void testApp()
    {
    	PromoController ctrl = new PromoController();
    	String result = ctrl.testApp();
        assertEquals( result ,"This is spring boot promo application");
    }
}
