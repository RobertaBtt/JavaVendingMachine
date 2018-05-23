package com.dexma.vmachine.resources;


import com.dexma.vmachine.application.EnumStateMachine;


public interface MachineInterface {

    EnumStateMachine getState();

    void setState(EnumStateMachine state);

    void addAction(VendingMachineActionInterface machineAction);

    void addProduct(String product );

    boolean actionAvailable(VendingMachineActionInterface machineAction);

    boolean productAvailable(String productDescription);

    float getCurrentAmount();

    void incrementAmount(float money);

    void callUserAction(VendingMachineActionInterface machineAction, ParameterInterface parameter, MachineInterface machine);

}
