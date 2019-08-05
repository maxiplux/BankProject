package project.state.generics.impl;

import generics.FanState;

public class LowState extends FanState {


    public LowState() {
        this.state = "low speed";
    }

    @Override
    public FanState next() {
        return new MediumState();
    }

    @Override
    public FanState previous() {
        return new OffState();
    }
}
