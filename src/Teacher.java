
public class Teacher implements Comparable<Teacher>{
	
	private String name;
	private int age;
	private double salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Teacher(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public Teacher() {
		super();
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("=============================equals()");
		if (obj == this) {
			return true;
		}

		if (obj instanceof Teacher) {
			Teacher stu = (Teacher) obj;
			if (this.age== stu.age && this.name.equals(stu.name)
					) {
				return true;
			}
		}

		return false;
	}

	@Override
	public int hashCode() {
		System.out.println("=============================hashCode()");
		// 用一个和该对象相关的int型的数据 * 31 ,得到的结果比较接近hash算法的结果
		return ( this.name.hashCode() + this.age ) * 31;
	}
	@Override
	public int compareTo(Teacher o) {
		System.out.println("=============================compareTo");

		// 按照age大小排序，如果age 相同，按salary排序
		if (this.age < o.age) {
			return 1;
		}

		if (this.age > o.age) {
			return -1;
		}

		if (this.salary-o.salary< 0) {
			return 1;
		}

		if (this.salary-o.salary> 0) {
			return -1;
		}

		return 0;
	}
	@Override
	public String toString() {
		
		return this.name+":"+this.age+":"+this.salary;
	}
    
	
}
