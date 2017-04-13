package Example2;

/**
 * Created by siku on 4/11/17.
 */
public class Course {
    String name_;

    Course(){
        super();
        name_ = new String("膜法入门");
    }
    Course(String name){
        super();
        this.name_ = name;
    }

    public void setName_(String name_) {
        this.name_ = name_;
    }

    public String getName_() {
        return name_;
    }

    @Override
    public String toString() {
        return this.name_;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj instanceof Course) {
            Course course = (Course) obj;
            if (this.name_ == course.name_) {
                return true;
            }
        }

        return false;
    }

    @Override
    public int hashCode() {
        return this.name_.hashCode();
    }
}

class TestCourse{
    public static void main(String [] agrv){
        Course course = new Course();
        System.out.println(course);
    }
}