package com.dexma.vmachine.resources;


import com.dexma.vmachine.application.EnumStateMachine;


public interface MachineInterface {

    EnumStateMachine getState();

    void setState(EnumStateMachine state);

    void addAction(VendingMachineActionInterface machineAction);

    void addProduct(ProductInterface product);

    MachineInterface removeProduct(ProductInterface product, MachineInterface machine);

    boolean actionAvailable(VendingMachineActionInterface machineAction);

    boolean productAvailable(ProductInterface product);

    float getCurrentAmount();

    MachineInterface incrementAmount(float money, MachineInterface machine);

    MachineInterface decrementAmount(float money, MachineInterface machine);

    MachineInterface callUserAction(VendingMachineActionInterface machineAction, ParameterInterface parameter, MachineInterface machine);

}
