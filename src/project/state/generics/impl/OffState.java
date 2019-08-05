package project.state.generics.impl;

import generics.FanState;

public class OffState extends FanState {


    public OffState() {
        this.state = "turning off";
    }

    @Override
    public FanState next() {
        return new LowState();
    }

    @Override
    public FanState previous() {
        return new HeightState();
    }
}
