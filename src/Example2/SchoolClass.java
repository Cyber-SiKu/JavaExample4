package Example2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by siku on 4/11/17.
 */
public class SchoolClass {
    HashSet<Student> all_students_;

    SchoolClass(){
        all_students_ = new HashSet<Student>();
    }

    boolean addStudent(Student student){
        return all_students_.add(student);
    }

    void removeStudent(String name){
        Iterator<Student> iterator = all_students_.iterator();
        while (iterator.hasNext()){
            if (iterator.next().getName_() == name){
                iterator.remove();
            }
        }
    }

    @Override
    public String toString() {
        String str = new String("班级信息:\n");
        Iterator<Student> iterator = all_students_.iterator();
        while (iterator.hasNext()){
            str+=iterator.next().toString()+"\n";
        }
        return str;
    }

    void count_number(){
        HashMap<String,Integer> course_counter = new HashMap<String,Integer>();
        Iterator<Student> iterator = all_students_.iterator();
        while (iterator.hasNext()){
            Iterator<Course> iterator_course = iterator.next().courses_list.iterator();
            while (iterator_course.hasNext()) {
                String course_name = iterator_course.next().getName_();
                if (course_counter.containsKey(course_name)){
                    course_counter.put(course_name,course_counter.get(course_name)+1);
                }else{
                    course_counter.put(course_name,1);
                }
            }
        }
        System.out.print(course_counter);
    }
}


class TestSchoolClas{
    public static void main(String [] agrv){
        SchoolClass schoolclass = new SchoolClass();
        Student student = new Student();
        student.addCourse(new Course("葛底斯堡的演讲"));
        student.addCourse(new Course("三个代表"));
        student.addCourse(new Course("一点微小的工作"));
        schoolclass.addStudent(student);
        Student student1 = new Student("too young");
        student1.addCourse(new Course("too simple"));
        student1.addCourse(new Course("三个代表"));
        student1.addCourse(new Course("一点微小的工作"));
        schoolclass.addStudent(student1);
        System.out.println(schoolclass);
 //       schoolclass.removeStudent("too young");
        System.out.println(schoolclass);
        schoolclass.count_number();
    }
}
