package com.BDDProject;

import org.junit.BeforeClass;

import io.cucumber.java.Before;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */

public class AppTest 
    extends TestCase
{

	@BeforeClass
	public void beforeTest() {
		System.out.println("**** Hello BDD test!");
	}
	
    @org.junit.Test
    public void testApp()
    {
        assertTrue( true );
    }
}
