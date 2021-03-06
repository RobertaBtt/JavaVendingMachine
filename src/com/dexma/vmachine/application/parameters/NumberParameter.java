package com.dexma.vmachine.application.parameters;

import com.dexma.vmachine.resources.ParameterInterface;

public class NumberParameter implements ParameterInterface {

    private float parameter;

    @Override
    public String getParameterDescription() {

        return "This parameter is a number";
    }

    @Override
    public Object getParameterContent() {
        return parameter;
    }

    public void setParameter(float parameter) {

        this.parameter = parameter;
    }


}
