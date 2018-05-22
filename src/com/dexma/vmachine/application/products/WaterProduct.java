package com.dexma.vmachine.application.products;

import com.dexma.vmachine.application.characteristics.DescriptionCharacteristic;
import com.dexma.vmachine.application.characteristics.PriceCharacteristic;
import com.dexma.vmachine.resources.CharacteristicProductInterface;
import com.dexma.vmachine.resources.ProductInterface;

import java.util.ArrayList;
import java.util.List;

public class WaterProduct implements ProductInterface {

    private List<CharacteristicProductInterface> waterProductCharacteristics;

    public WaterProduct() {
        waterProductCharacteristics = new ArrayList<CharacteristicProductInterface>();
        waterProductCharacteristics.add(new DescriptionCharacteristic("Water"));
        waterProductCharacteristics.add(new PriceCharacteristic(0.90f));
    }

    @Override
    public List<CharacteristicProductInterface> getProductCharacteristics() {
        return waterProductCharacteristics;
    }
}
