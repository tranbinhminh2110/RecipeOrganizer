/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team3.repipe;

import java.io.Serializable;

/**
 *
 * @author THIS PC
 */
public class RecipeDTO implements Serializable {
    private String a;
    private String b;
    private String c;
    private boolean d;

    public RecipeDTO() {
    }

    public RecipeDTO(String a, String b, String c, boolean d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    
    /**
     * @return the a
     */
    public String getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(String a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public String getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(String b) {
        this.b = b;
    }

    /**
     * @return the c
     */
    public String getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(String c) {
        this.c = c;
    }

    /**
     * @return the d
     */
    public boolean isD() {
        return d;
    }

    /**
     * @param d the d to set
     */
    public void setD(boolean d) {
        this.d = d;
    }
    
    
}
