package Example3;

import java.util.ArrayList;

/**
 * Created by siku on 4/12/17.
 */
public class Question {
    int number_;    //题号
    String description_;    //描述
    ArrayList<Integer> option_;     //选项
    int right_option_;  //正确选项
    int score_;     //分数
    Question(){
        super();
        number_ = 0;
        description_ = new String("谁改变了中国?");
        option_ = new ArrayList<Integer>();
        right_option_ = 0;
        score_ = 1;
    }
    Question(int number,String description,ArrayList<Integer> option,int right_option,int score){
    	super();
    	this.number_ = number;
    	this.description_ = description;
    	this.option_ = option;
    	this.right_option_ = right_option;
    	this.score_ = score;
    }
}
