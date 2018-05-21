package com.dexma.vmachine.application.parameters;

import com.dexma.vmachine.resources.ParameterInterface;

public class NumberParameter implements ParameterInterface {

    private float parameter;

    public float getParameter() {
        return parameter;
    }

    public void setParameter(float parameter) {
        this.parameter = parameter;
    }

    @Override
    public String getParameterDescription() {
        return "This parameter is a number";
    }

    @Override
    public String getParameterContent() {
        return null;
    }
}