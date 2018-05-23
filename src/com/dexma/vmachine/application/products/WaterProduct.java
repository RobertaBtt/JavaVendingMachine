package com.dexma.vmachine.application.products;

import com.dexma.vmachine.resources.ProductInterface;

public class WaterProduct implements ProductInterface {


    @Override
    public String getDescription() {
        return "Water";
    }

    @Override
    public float getPrice() {
        return 0.90f;
    }
}
