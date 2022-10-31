/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.proyecto.backend.Entity;

import static org.testng.Assert.*;

/**
 *
 * @author HP
 */
public class ProyectoNGTest {
    
    public ProyectoNGTest() {
    }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getId method, of class Proyecto.
     */
    @org.testng.annotations.Test
    public void testGetId() {
        System.out.println("getId");
        Proyecto instance = new Proyecto();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Proyecto.
     */
    @org.testng.annotations.Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        Proyecto instance = new Proyecto();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitulo method, of class Proyecto.
     */
    @org.testng.annotations.Test
    public void testGetTitulo() {
        System.out.println("getTitulo");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getTitulo();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitulo method, of class Proyecto.
     */
    @org.testng.annotations.Test
    public void testSetTitulo() {
        System.out.println("setTitulo");
        String titulo = "";
        Proyecto instance = new Proyecto();
        instance.setTitulo(titulo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImagen method, of class Proyecto.
     */
    @org.testng.annotations.Test
    public void testGetImagen() {
        System.out.println("getImagen");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getImagen();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImagen method, of class Proyecto.
     */
    @org.testng.annotations.Test
    public void testSetImagen() {
        System.out.println("setImagen");
        String imagen = "";
        Proyecto instance = new Proyecto();
        instance.setImagen(imagen);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescripcion method, of class Proyecto.
     */
    @org.testng.annotations.Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        Proyecto instance = new Proyecto();
        String expResult = "";
        String result = instance.getDescripcion();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescripcion method, of class Proyecto.
     */
    @org.testng.annotations.Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "";
        Proyecto instance = new Proyecto();
        instance.setDescripcion(descripcion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
