package project.state.generics.impl;

import generics.FanState;

public class MediumState extends FanState {


    public MediumState() {
        this.state = "medium speed";
    }

    @Override
    public FanState next() {
        return new HeightState();
    }

    @Override
    public FanState previous() {
        return new LowState();
    }
}
