package com.dexma.vmachine.application.products;

import com.dexma.vmachine.application.characteristics.DescriptionCharacteristic;
import com.dexma.vmachine.application.characteristics.PriceCharacteristic;
import com.dexma.vmachine.resources.CharacteristicProductInterface;
import com.dexma.vmachine.resources.ProductInterface;

import java.util.ArrayList;
import java.util.List;

public class CokeProduct implements ProductInterface {

    private List<CharacteristicProductInterface> cokeProductCharacteristics;

    public CokeProduct() {
        cokeProductCharacteristics = new ArrayList<CharacteristicProductInterface>();
        cokeProductCharacteristics.add(new DescriptionCharacteristic("Coke"));
        cokeProductCharacteristics.add(new PriceCharacteristic(1.50f));
    }

    @Override
    public List<CharacteristicProductInterface> getProductCharacteristics() {
        return cokeProductCharacteristics;
    }
}
