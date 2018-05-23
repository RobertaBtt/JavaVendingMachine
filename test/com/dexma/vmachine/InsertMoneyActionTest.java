package com.dexma.vmachine;

import com.dexma.vmachine.application.VendingMachine;
import com.dexma.vmachine.application.actions.supervisor.PowerOffAction;
import com.dexma.vmachine.application.actions.supervisor.RegisterProductAction;
import com.dexma.vmachine.application.actions.supervisor.ResetAction;
import com.dexma.vmachine.application.actions.supervisor.StartUpAction;
import com.dexma.vmachine.application.actions.user.CancelAction;
import com.dexma.vmachine.application.actions.user.InsertMoneyAction;
import com.dexma.vmachine.application.actions.user.ProductEmissionAction;
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

public class InsertMoneyActionTest {

    private MachineInterface vendingMachine;
    private VendingMachineActionInterface startupAction;
    private VendingMachineActionInterface insertMoney;
    private VendingMachineActionInterface selectProduct;

    private ParameterInterface money;

    private ParameterInterface product;

    private ProductInterface cokeProduct = new CokeProduct();


    private void createActions(){
        startupAction = new StartUpAction();
        insertMoney = new InsertMoneyAction();
        selectProduct = new SelectProductAction();
    }

    private void createParameters(){
        money = new NumberParameter();
        ((NumberParameter) money).setParameter(5.0f);

        product = new ProductParameter();
        ((ProductParameter) product).setParameter(cokeProduct);


    }

    private void programTheMachine(MachineInterface vendingMachine){
        vendingMachine.addAction(insertMoney);

    }


    @Before
    public void startHere(){
        vendingMachine = VendingMachine.getInstance();
        createActions();
        programTheMachine(vendingMachine);
        createParameters();
    }

    @Test
    public void testInsertMachine(){

        vendingMachine.callUserAction(insertMoney, money);
        assertEquals(Float.parseFloat(String.valueOf(money.getParameterContent())), vendingMachine.getCurrentAmount(), 0);

    }


}
