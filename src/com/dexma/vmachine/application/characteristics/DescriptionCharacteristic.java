package com.dexma.vmachine.application.characteristics;

import com.dexma.vmachine.resources.CharacteristicProductInterface;

public class DescriptionCharacteristic implements CharacteristicProductInterface {
    private String description;


    public DescriptionCharacteristic(String description) {
        this.description = description;
    }

    @Override
    public String getValue() {
        return this.description;
    }
}
