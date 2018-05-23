package com.dexma.vmachine;

import com.dexma.vmachine.application.VendingMachine;
import com.dexma.vmachine.application.actions.supervisor.StartUpAction;
import com.dexma.vmachine.application.actions.user.CancelAction;
import com.dexma.vmachine.application.actions.user.InsertMoneyAction;
import com.dexma.vmachine.application.actions.user.SelectProductAction;
import com.dexma.vmachine.application.parameters.NumberParameter;
import com.dexma.vmachine.application.parameters.ProductParameter;
import com.dexma.vmachine.application.products.CokeProduct;
import com.dexma.vmachine.resources.MachineInterface;
import com.dexma.vmachine.resources.ParameterInterface;
import com.dexma.vmachine.resources.ProductInterface;
import com.dexma.vmachine.resources.VendingMachineActionInterface;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CancelActionTest {

    private MachineInterface vendingMachine;
    private VendingMachineActionInterface startupAction;
    private VendingMachineActionInterface insertMoney;
    private VendingMachineActionInterface selectProduct;
    private VendingMachineActionInterface cancelAction;
    private ParameterInterface money;

    private ParameterInterface product;

    private ProductInterface cokeProduct = new CokeProduct();


    private void createActions(){
        startupAction = new StartUpAction();
        insertMoney = new InsertMoneyAction();
        selectProduct = new SelectProductAction();
        cancelAction = new CancelAction();
    }

    private void createParameters(){
        money = new NumberParameter();
        ((NumberParameter) money).setParameter(5.0f);

        product = new ProductParameter();
        ((ProductParameter) product).setParameter(cokeProduct);


    }

    private void programTheMachine(MachineInterface vendingMachine){
        vendingMachine.addAction(startupAction);
        vendingMachine.addAction(cancelAction);
        vendingMachine.addAction(insertMoney);
    }


    private void addTheProducts(MachineInterface vendingMachine){
        vendingMachine.addProduct(cokeProduct);
    }

    @Before
    public void startHere(){
        vendingMachine = VendingMachine.getInstance();
        createActions();
        programTheMachine(vendingMachine);
        addTheProducts(vendingMachine);
        createParameters();
    }

    @Test
    public void testInsertMachine(){

        vendingMachine.callUserAction(insertMoney, money);
        assertEquals(Float.parseFloat(String.valueOf(money.getParameterContent())), vendingMachine.getCurrentAmount(), 0);

    }


}
