package project.state.generics.impl;

import generics.FanState;

public class HeightState extends FanState {

    public HeightState() {
        this.state = "high speed";
    }

    @Override
    public FanState next() {
        return new OffState();
    }

    @Override
    public FanState previous() {
        return new MediumState();
    }
}
