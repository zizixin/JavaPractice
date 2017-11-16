package zizixin.JavaPractice.InnerClass.InnerClassTurbo;

public class Outer{
	{
		final int x = 100;
		final int y = 100;
		
		class BlockInner{
			int z = 100;
			public int addXYZ(){return x+y+z;}
		}
		BlockInner bi = new BlockInner();
		this.num = bi.addXYZ();
	}
	private int num;
}