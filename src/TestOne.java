
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TestOne {
/*
 * 定义一个Teacher类，包含3个属性：name,age,salary。
 * 并且定义若两个对象的name和age都相同，则认为这两个对象相等。
 * 要求该Teacher类对象能比较大小，按照age的大小来排序，
 * 如果age相同的则按salary大小来排。最后，生成一些Teacher对象，
 * 加入到HashSet和TreeSet中验证以上程序的正确性。
 * */
	public static void main(String[] args) {
		
		/*HashSet<Teacher>  teaHashSet=new HashSet<Teacher>();*/
		TreeSet<Teacher>  teaHashSet=new TreeSet<Teacher>();
		Teacher t1=new Teacher("李美丽",28,7400);
		Teacher t2=new Teacher("李美丽",28,7500);
		Teacher t3=new Teacher("李美丽1",26,7500);
		Teacher t4=new Teacher("李美丽2",27,7500);
		Teacher t5=new Teacher("李美丽3",28,7500);
		Teacher t6=new Teacher("李美丽4",29,7500);
		
        teaHashSet.add(t1);
        teaHashSet.add(t2);
        teaHashSet.add(t3);
        teaHashSet.add(t4);
        teaHashSet.add(t5);
        teaHashSet.add(t6);
        
        Iterator<Teacher> it=teaHashSet.iterator();
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }
	}

}
