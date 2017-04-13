package Example3;

import java.util.HashMap;

/**
 * Created by siku on 17-4-12.
 */
public class AnswerSheet {
	HashMap<String,Integer> answers_;
	AnswerSheet(){
		super();
		answers_ = new HashMap<String,Integer>();
	}
	AnswerSheet(HashMap<String,Integer> answers){
		super();
		this.answers_ = answers;
	}
}
