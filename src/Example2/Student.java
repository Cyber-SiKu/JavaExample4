package Example2;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by siku on 4/11/17.
 */
public class Student {
    String name_;
    HashSet<Course> courses_list;

    Student(){
        super();
        this.name_ = new String("江河与沼泽之王");
        this.courses_list = new HashSet<Course>();
    }

    Student(String name){
        super();
        this.name_ = name;
        this.courses_list = new HashSet<Course>();
    }

    boolean addCourse(Course c){
        return this.courses_list.add(c);
    }

    Boolean removeCourse(String name){
        Course course = new Course(name);
        return this.courses_list.remove(course);
    }

    @Override
    public String toString() {
        String return_ = new String("Example2.Student infomation:\nName: "+this.name_+"\nExample2.Course:\n");
        Iterator<Course> iterator = this.courses_list.iterator();
        while (iterator.hasNext()){
            return_+=iterator.next().toString()+"\n";
        }
        return  return_;
    }

    public String getName_() {
        return name_;
    }

    @Override
    public int hashCode() {
        return this.name_.hashCode() + this.courses_list.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj instanceof Student) {
            Student student = (Student) obj;
            if (this.name_ == student.name_ && student.courses_list == student.courses_list) {
                return true;
            }
        }

        return false;
    }
}

class TestStudent{
    public static void main(String [] agrv){
        Student student = new Student();
        student.addCourse(new Course("葛底斯堡的演讲"));
        student.addCourse(new Course("三个代表"));
        student.addCourse(new Course("一点微小的工作"));
        System.out.println(student);
        student.removeCourse("一点微小的工作");
        System.out.println(student);
        System.out.println(student == student);
        Student student1 = new Student("江河与沼泽之王");
        student.addCourse(new Course("葛底斯堡的演讲"));
        student.addCourse(new Course("三个代表"));
        System.out.println(student == student1);
    }
}