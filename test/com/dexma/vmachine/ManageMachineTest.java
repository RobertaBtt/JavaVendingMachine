package com.dexma.vmachine;

import com.dexma.vmachine.application.VendingMachine;
import com.dexma.vmachine.application.actions.*;
import com.dexma.vmachine.application.parameters.NumberParameter;
import com.dexma.vmachine.application.products.CokeProduct;
import com.dexma.vmachine.application.products.SpriteProduct;
import com.dexma.vmachine.application.products.WaterProduct;
import com.dexma.vmachine.resources.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManageMachineTest {

    private MachineInterface vendingMachine;
    private VendingMachineActionInterface startupAction;
    private VendingMachineActionInterface insertMoney;

    private ParameterInterface money;


    private void createActions(){
        startupAction = new StartUpAction();
        insertMoney = new InsertMoneyAction();
    }

    private void createParameters(){
        money = new NumberParameter();
        ((NumberParameter) money).setParameter(5.0f);

    }

    private void programTheMachine(MachineInterface vendingMachine){
        vendingMachine.addAction(startupAction);
        vendingMachine.addAction(insertMoney);

        vendingMachine.addAction(new ResetAction());
        vendingMachine.addAction(new PowerOffAction());
        vendingMachine.addAction(new RegisterProductAction());

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
        createActions();
        programTheMachine(vendingMachine);
        installTheMachine(vendingMachine);
        createParameters();
    }

    @Test
    public void testMachine(){

        vendingMachine.callUserAction(insertMoney, money, vendingMachine);
        assertEquals(Float.parseFloat(String.valueOf(money.getParameterContent())), vendingMachine.getCurrentAmount(), 0);

    }

}
