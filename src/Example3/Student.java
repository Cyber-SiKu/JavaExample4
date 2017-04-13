package Example3;

/**
 * Created by siku on 17-4-12.
 */
public class Student {
	String name_;
	Paper paper_;//考卷
	AnswerSheet answer_;
	int scores_;
	Student(){
		super();
		name_ = new String("SiKu");
		paper_ = new Paper();
		answer_ = new AnswerSheet();
		scores_ = 0;
	}
	Student(String name,Paper paper,AnswerSheet answer,int scores){
		this.name_ = name;
		this.paper_ = paper;
		this.answer_ = answer;
		this.scores_ = scores;
	}
}
