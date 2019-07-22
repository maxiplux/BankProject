package composite;

public abstract class CompositeElement {

    protected String name ;

    public CompositeElement(String name) {
        this.name = name;
    }

    public abstract void print() ;
    public abstract int getSizeInBytes() ;

}
