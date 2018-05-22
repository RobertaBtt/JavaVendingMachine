package com.dexma.vmachine;

import com.dexma.vmachine.application.VendingMachine;
import com.dexma.vmachine.application.actions.*;
import com.dexma.vmachine.application.characteristics.DescriptionCharacteristic;
import com.dexma.vmachine.application.characteristics.PriceCharacteristic;
import com.dexma.vmachine.application.products.CokeProduct;
import com.dexma.vmachine.application.products.SpriteProduct;
import com.dexma.vmachine.application.products.WaterProduct;
import com.dexma.vmachine.resources.CharacteristicProductInterface;
import com.dexma.vmachine.resources.MachineInterface;
import com.dexma.vmachine.resources.ProductInterface;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManageMachineTest {

    private MachineInterface vendingMachine;


    private void programTheMachine(MachineInterface vendingMachine){
        vendingMachine.addAction(new StartUpAction());
        vendingMachine.addAction(new ResetAction());
        vendingMachine.addAction(new PowerOffAction());
        vendingMachine.addAction(new RegisterProductAction());
        vendingMachine.addAction(new AddMoneyAction());
        vendingMachine.addAction(new CancelAction());
        vendingMachine.addAction(new SelectProductAction());
        vendingMachine.addAction(new ProductEmissionAction());
    }


    private void installTheMachine(MachineInterface vendingMachine){
        vendingMachine.addProduct(new CokeProduct());
        vendingMachine.addProduct(new CokeProduct());
        vendingMachine.addProduct(new SpriteProduct());
        vendingMachine.addProduct(new WaterProduct());

    }

    @Before
    public void startHere(){
        vendingMachine = new VendingMachine();
        programTheMachine(vendingMachine);
        installTheMachine(vendingMachine);
    }

    @Test
    public void testMachine(){
        
    }

}
