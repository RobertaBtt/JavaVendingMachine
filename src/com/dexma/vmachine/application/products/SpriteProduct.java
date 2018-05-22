package com.dexma.vmachine.application.products;

import com.dexma.vmachine.application.characteristics.DescriptionCharacteristic;
import com.dexma.vmachine.application.characteristics.PriceCharacteristic;
import com.dexma.vmachine.resources.CharacteristicProductInterface;
import com.dexma.vmachine.resources.ProductInterface;

import java.util.ArrayList;
import java.util.List;

public class SpriteProduct implements ProductInterface {

    private List<CharacteristicProductInterface> spriteProductCharacteristics;

    public SpriteProduct() {
        spriteProductCharacteristics = new ArrayList<CharacteristicProductInterface>();
        spriteProductCharacteristics.add(new DescriptionCharacteristic("Sprite"));
        spriteProductCharacteristics.add(new PriceCharacteristic(1.45f));
    }

    @Override
    public List<CharacteristicProductInterface> getProductCharacteristics() {
        return spriteProductCharacteristics;
    }
}
