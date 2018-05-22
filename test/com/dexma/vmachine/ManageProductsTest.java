package com.dexma.vmachine;

import com.dexma.vmachine.application.VendingMachine;
import com.dexma.vmachine.application.actions.AddMoneyAction;
import com.dexma.vmachine.application.actions.CancelAction;
import com.dexma.vmachine.application.actions.ResetAction;
import com.dexma.vmachine.application.characteristics.DescriptionCharacteristic;
import com.dexma.vmachine.application.characteristics.PriceCharacteristic;
import com.dexma.vmachine.application.products.CokeProduct;
import com.dexma.vmachine.resources.CharacteristicProductInterface;
import com.dexma.vmachine.resources.MachineInterface;
import com.dexma.vmachine.resources.ProductInterface;
import com.dexma.vmachine.resources.VendingMachineActionInterface;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManageProductsTest {

    private ProductInterface coke;
    private CharacteristicProductInterface cokeDescription;
    private CharacteristicProductInterface cokePrice;

    @Before
    public void prepareEnvironment(){
        coke = new CokeProduct();
        cokeDescription = new DescriptionCharacteristic("Coke");
        cokePrice = new PriceCharacteristic(1.50f);
    }


    @Test
    public void createProduct() {
        assertEquals("Coke", coke.getProductCharacteristics().get(0).getValue());
        assertEquals(1.50f, coke.getProductCharacteristics().get(1).getValue());
    }

}
