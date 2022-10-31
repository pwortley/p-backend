/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.proyecto.backend.Entity;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author HP
 */
public class SkillNGTest {
    
    public SkillNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getId method, of class Skill.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Skill instance = new Skill();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Skill.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        Skill instance = new Skill();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTecnologia method, of class Skill.
     */
    @Test
    public void testGetTecnologia() {
        System.out.println("getTecnologia");
        Skill instance = new Skill();
        String expResult = "";
        String result = instance.getTecnologia();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTecnologia method, of class Skill.
     */
    @Test
    public void testSetTecnologia() {
        System.out.println("setTecnologia");
        String tecnologia = "";
        Skill instance = new Skill();
        instance.setTecnologia(tecnologia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImagen method, of class Skill.
     */
    @Test
    public void testGetImagen() {
        System.out.println("getImagen");
        Skill instance = new Skill();
        String expResult = "";
        String result = instance.getImagen();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImagen method, of class Skill.
     */
    @Test
    public void testSetImagen() {
        System.out.println("setImagen");
        String imagen = "";
        Skill instance = new Skill();
        instance.setImagen(imagen);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
