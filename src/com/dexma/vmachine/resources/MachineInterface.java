package com.dexma.vmachine.resources;


import com.dexma.vmachine.application.EnumStateMachine;


public interface MachineInterface {

    EnumStateMachine getState();

    void setState(EnumStateMachine state);

    void addAction(VendingMachineActionInterface machineAction);

    void addProduct(ProductInterface product);

    void removeProduct(ProductInterface product);

    boolean actionAvailable(VendingMachineActionInterface machineAction);

    boolean productAvailable(ProductInterface product);

    float getCurrentAmount();

    void incrementAmount(float money);

    void decrementAmount(float money);

    void callUserAction(VendingMachineActionInterface machineAction, ParameterInterface parameter);

}
