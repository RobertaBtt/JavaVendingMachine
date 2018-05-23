package com.dexma.vmachine.application.parameters;

import com.dexma.vmachine.resources.ParameterInterface;

public class CommandParameter implements ParameterInterface {

    @Override
    public String getParameterDescription() {

        return "This parameter is a command";
    }

    @Override
    public Object getParameterContent() {

        return null;
    }
}
