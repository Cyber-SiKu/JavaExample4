package Example3;

import java.util.HashSet;

/**
 * Created by siku on 17-4-12.
 */
public class Exam {
	HashSet<Student> students_;
	Paper paper_;
	Exam(){
		super();
		students_ = new HashSet<Student>();
		paper_ = new Paper();
	}
	Exam(HashSet<Student> students,Paper paper){
		super();
		this.students_ = students;
		this.paper_ = paper;
	}
}
