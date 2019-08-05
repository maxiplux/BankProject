package project.state.generics;

public abstract class FanState {
    public String state = "";

    public void print() {
        System.out.println(state);
    }

    public abstract FanState next();

    public abstract FanState previous();
}
