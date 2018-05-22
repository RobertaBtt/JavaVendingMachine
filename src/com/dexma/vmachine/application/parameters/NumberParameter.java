package com.dexma.vmachine.application.parameters;

import com.dexma.vmachine.resources.ParameterInterface;

public class NumberParameter implements ParameterInterface {

    @Override
    public String getParameterDescription() {
        return "This parameter is a number";
    }

    @Override
    public String getParameterContent() {
        return String.valueOf(Float.parseFloat(String.valueOf(parameter)));
    }

    private float parameter;

    public void setParameter(float parameter) {

        this.parameter = parameter;
    }


}
