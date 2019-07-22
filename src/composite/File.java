package composite;

public class File extends  CompositeElement {

	private int sizeInBytes;

	public File(String name, int sizeInBytes) {
		super(name);
		this.sizeInBytes = sizeInBytes;
	}

	public int getSizeInBytes() {
		return sizeInBytes;
	}
	public void print(){
		System.out.println("--- file "+this.name+" size="+getSizeInBytes()+" bytes");
	}
}
