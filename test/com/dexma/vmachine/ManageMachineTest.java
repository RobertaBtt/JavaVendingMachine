package com.dexma.vmachine;

import com.dexma.vmachine.application.VendingMachine;
import com.dexma.vmachine.application.actions.*;
import com.dexma.vmachine.application.parameters.NumberParameter;
import com.dexma.vmachine.application.parameters.StringParameter;
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
    private VendingMachineActionInterface selectProduct;

    private ParameterInterface money;
    private ParameterInterface product;


    private void createActions(){
        startupAction = new StartUpAction();
        insertMoney = new InsertMoneyAction();
        selectProduct = new SelectProductAction();
    }

    private void createParameters(){
        money = new NumberParameter();
        ((NumberParameter) money).setParameter(5.0f);
        product = new StringParameter();
        ((StringParameter) product).setParameter("Coke");

    }

    private void programTheMachine(MachineInterface vendingMachine){
        vendingMachine.addAction(startupAction);
        vendingMachine.addAction(insertMoney);

        vendingMachine.addAction(new ResetAction());
        vendingMachine.addAction(new PowerOffAction());
        vendingMachine.addAction(new RegisterProductAction());

        vendingMachine.addAction(new CancelAction());
        vendingMachine.addAction(selectProduct);
        vendingMachine.addAction(new ProductEmissionAction());
    }


    private void installTheMachine(MachineInterface vendingMachine){
        vendingMachine.addProduct("Coke");
        vendingMachine.addProduct("Coke");
        vendingMachine.addProduct("Sprite");
        vendingMachine.addProduct("Water");
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
    public void testInsertMachine(){

        vendingMachine.callUserAction(insertMoney, money, vendingMachine);
        assertEquals(Float.parseFloat(String.valueOf(money.getParameterContent())), vendingMachine.getCurrentAmount(), 0);

    }

    @Test
    public void testSelectProduct(){
        vendingMachine.callUserAction(selectProduct, product, vendingMachine);
    }


}
