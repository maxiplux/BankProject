package composite;

import java.util.ArrayList;
import java.util.Collection;

public class Directory  extends  CompositeElement{
	protected String name;
	private Collection<CompositeElement> files ; // folders or files are equals , the main diferences is , folder has files.



	public Directory(String name) {

		super(name);
		files = new ArrayList<CompositeElement>();
	}
	public void print(){
		System.out.println("-- dir "+name+" size="+computeSize()+" bytes");
		this.files.forEach(compositeElement -> compositeElement.print());
	}

	@Override
	public int getSizeInBytes() {
		return this.computeSize();
	}

	public void addFile(File file){
		files.add(file);
	}

	public void addDir(CompositeElement directory){
		this.files.add(directory);
	}

	public int computeSize(){
		return this.files.stream().map( compositeElement ->  compositeElement.getSizeInBytes()).reduce(0,Integer::sum);

	}
}
