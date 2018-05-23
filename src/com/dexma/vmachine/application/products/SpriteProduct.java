package com.dexma.vmachine.application.products;

import com.dexma.vmachine.resources.ProductInterface;


public class SpriteProduct implements ProductInterface {


    @Override
    public String getDescription() {
        return "Sprite";
    }

    @Override
    public float getPrice() {
        return 1.45f;
    }
}
