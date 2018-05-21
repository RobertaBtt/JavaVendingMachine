package com.dexma.vmachine;

import com.dexma.vmachine.application.VendingMachine;
import com.dexma.vmachine.application.actions.AddMoneyAction;
import com.dexma.vmachine.application.actions.CancelAction;
import com.dexma.vmachine.resources.MachineInterface;
import com.dexma.vmachine.resources.VendingMachineActionInterface;
import junit.framework.TestCase;
import junit.framework.TestResult;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*; // Allows you to use directly assert methods, such as assertTrue(...), assertNull(...)

import org.junit.Test; // for @Test
import org.junit.Before;

public class StartUpActionTest{

    private MachineInterface concreteMachine;
    private  List<VendingMachineActionInterface> machineActions;
    private VendingMachineActionInterface addAction ;


    @Before
    public void prepareEnvironment(){
        concreteMachine = new VendingMachine();
        machineActions = new ArrayList<VendingMachineActionInterface>();
        addAction = new AddMoneyAction();
    }


    @Test
    public void testAddActionPresent() {
        concreteMachine.addAction(addAction);
        assertEquals(true, concreteMachine.actionAvailable(addAction));
    }

    @Test
    public void testCancelActionNotPresent() {        concreteMachine.addAction(addAction);

        assertEquals(false, concreteMachine.actionAvailable(new CancelAction()));
    }
}
