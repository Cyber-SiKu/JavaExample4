package Example3;

import java.util.HashMap;

/**
 * Created by siku on 17-4-12.
 */
public class Paper {
    HashMap<String,Question> questions_;
    Paper(){
    	super();
    	questions_ = new HashMap<String,Question>();
    }
    Paper(HashMap<String,Question> questions){
    	super();
    	this.questions_ = questions;
    }
}
