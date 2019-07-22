package composite;

import java.util.ArrayList;
import java.util.Collection;

public class Drive extends  CompositeElement{
	protected String name;

	protected Collection<CompositeElement> dataSetElements;
	public Drive(String name) {
		super(name);
		dataSetElements = new ArrayList<CompositeElement>();

	}
	public void addFile(CompositeElement file){

		this.dataSetElements.add(file);
	}

	public void addDir(CompositeElement directory){
		dataSetElements.add(directory);
	}

	public int computeSize(){
		return this.dataSetElements.stream().map( compositeElement ->  compositeElement.getSizeInBytes()).reduce(0,Integer::sum);

	}
	@Override
	public void print(){
		System.out.println("- drive "+name);
		this.dataSetElements.forEach(compositeElement -> compositeElement.print());

	}

	@Override
	public int getSizeInBytes() {
		return this.computeSize();
	}
}
