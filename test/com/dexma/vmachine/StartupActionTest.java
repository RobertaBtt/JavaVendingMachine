package com.dexma.vmachine;

import com.dexma.vmachine.application.EnumStateMachine;
import com.dexma.vmachine.application.VendingMachine;
import com.dexma.vmachine.application.actions.user.InsertMoneyAction;
import com.dexma.vmachine.application.actions.supervisor.ResetAction;
import com.dexma.vmachine.application.actions.supervisor.StartUpAction;
import com.dexma.vmachine.application.parameters.NumberParameter;
import com.dexma.vmachine.resources.MachineInterface;
import com.dexma.vmachine.resources.ParameterInterface;
import com.dexma.vmachine.resources.VendingMachineActionInterface;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StartupActionTest {

    private MachineInterface concreteMachine;
    private VendingMachineActionInterface addMoneyAction;
    private VendingMachineActionInterface resetAction ;
    private ParameterInterface numberParameter;


    @Before
    public void prepareEnvironment(){
        concreteMachine = VendingMachine.getInstance();
        addMoneyAction = new InsertMoneyAction();
        resetAction = new ResetAction();
        concreteMachine.addAction(addMoneyAction);
        concreteMachine.addAction(resetAction);
        numberParameter = new NumberParameter();
    }


    @Test
    public void executeAddAction() {
        concreteMachine.callUserAction(new StartUpAction(), numberParameter);
        assertEquals(EnumStateMachine.ON, concreteMachine.getState());
    }


}
