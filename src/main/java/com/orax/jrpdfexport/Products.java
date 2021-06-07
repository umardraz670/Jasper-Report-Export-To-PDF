/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orax.jrpdfexport;

/**
 *
 * @author Umar Rehman
 */
public class Products {
    private final int SKU;
    private final String PRODUCT;
    private final float AVGCP;
    private final float SP;

    public Products(int SKU, String PRODUCT, float AVGCP, float SP) {
        this.SKU = SKU;
        this.PRODUCT = PRODUCT;
        this.AVGCP = AVGCP;
        this.SP = SP;
    }

    public int getSKU() {
        return SKU;
    }

    public String getPRODUCT() {
        return PRODUCT;
    }

    public float getAVGCP() {
        return AVGCP;
    }

    public float getSP() {
        return SP;
    }
    
    

}
