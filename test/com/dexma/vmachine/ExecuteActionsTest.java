package com.dexma.vmachine;

import com.dexma.vmachine.application.VendingMachine;
import com.dexma.vmachine.application.actions.AddMoneyAction;
import com.dexma.vmachine.application.actions.CancelAction;
import com.dexma.vmachine.application.actions.ResetAction;
import com.dexma.vmachine.application.actions.StartUpAction;
import com.dexma.vmachine.application.parameters.NumberParameter;
import com.dexma.vmachine.resources.MachineInterface;
import com.dexma.vmachine.resources.ParameterInterface;
import com.dexma.vmachine.resources.VendingMachineActionInterface;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ExecuteActionsTest {

    private MachineInterface concreteMachine;
    private VendingMachineActionInterface addMoneyAction;
    private VendingMachineActionInterface resetAction ;
    private ParameterInterface numberParameter;


    @Before
    public void prepareEnvironment(){
        concreteMachine = new VendingMachine();
        addMoneyAction = new AddMoneyAction();
        resetAction = new ResetAction();
        concreteMachine.addAction(addMoneyAction);
        concreteMachine.addAction(resetAction);
        numberParameter = new NumberParameter();
    }


    @Test
    public void executeAddAction() {
        concreteMachine.callAction(new StartUpAction(), numberParameter);
    }


}
