package com.dexma.vmachine;

import com.dexma.vmachine.application.VendingMachine;
import com.dexma.vmachine.application.actions.user.InsertMoneyAction;
import com.dexma.vmachine.application.actions.user.CancelAction;
import com.dexma.vmachine.application.actions.supervisor.ResetAction;
import com.dexma.vmachine.resources.MachineInterface;
import com.dexma.vmachine.resources.VendingMachineActionInterface;

import static org.junit.Assert.*;

import org.junit.Test; 
import org.junit.Before;

public class AddActionsTest {

    private MachineInterface concreteMachine;
    private VendingMachineActionInterface addMoneyAction;
    private VendingMachineActionInterface resetAction ;


    @Before
    public void prepareEnvironment(){
        concreteMachine = VendingMachine.getInstance();
        addMoneyAction = new InsertMoneyAction();
        resetAction = new ResetAction();
    }


    @Test
    public void testAddActionPresent() {
        concreteMachine.addAction(addMoneyAction);
        assertEquals(true, concreteMachine.actionAvailable(addMoneyAction));
    }

    @Test
    public void testCancelActionNotPresent() {
        concreteMachine.addAction(addMoneyAction);
        assertEquals(false, concreteMachine.actionAvailable(new CancelAction()));
    }

}
