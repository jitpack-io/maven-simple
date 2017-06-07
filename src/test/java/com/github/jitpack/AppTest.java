package com.github.jitpack;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AppTest 
{
    App app = new App();

    @Test
    public void testApp()
    {
	System.out.println("Testing app");
        assertEquals("Hello world", app.greet("world"));
    }

    @Before
    public void before() {
        System.out.println("Test Starting");
    }

    @After
    public void after() {
	System.out.println("Test Done");
    }

    @Test
    public void testTrue() throws Exception
    {
	System.out.println("sleeping");
	Thread.sleep(1000);
        assertTrue( true );
    }

    @Test
    public void testFalse() throws Exception
    {
	System.out.println("sleeping");
	Thread.sleep(1000);
	System.out.println("testFalse assert");
        assertTrue( false );
    }
}
