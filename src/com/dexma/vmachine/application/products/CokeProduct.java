package com.dexma.vmachine.application.products;

import com.dexma.vmachine.resources.ProductInterface;

public class CokeProduct implements ProductInterface {


    @Override
    public String getDescription() {
        return "Coke";
    }

    @Override
    public float getPrice() {
        return 1.50f;
    }
}
