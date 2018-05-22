package com.dexma.vmachine.application.characteristics;

import com.dexma.vmachine.resources.CharacteristicProductInterface;

public class PriceCharacteristic implements CharacteristicProductInterface {

    private float price;
    public PriceCharacteristic(float price) {
        this.price = price;
    }


    @Override
    public Object getValue() {
        return this.price;
    }
}
