package project.state.generics;

import generics.impl.OffState;

public class CeilingFan {


    private FanState state;

    public CeilingFan() {
        this.state = new OffState();

    }


    public void pullgreen() {
        this.state = this.state.next();
        this.state.print();
    }

    public void pullred() {
        this.state = this.state.previous();
        this.state.print();
    }
}