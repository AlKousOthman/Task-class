package University;

public class Course {
   //Class properties
    String name;
    String instructor;
    int students;

    Course(String nameI, String instructorN, int studentsNu){
        name = nameI;
        instructor = instructorN;
        students = studentsNu;
    }

    public String getcourseN(){
        return name;
    }

    public void setcourseName(String newName){
        name = newName;
    }

    public String getinstructor(){
        return instructor;
    }

    public void setinstructor(String newinstructor){
        instructor = newinstructor;
    }
    public int getstudents(){
        return students;
    }

    public void setstudents(int newstudents){
        students = newstudents;
    }


    public String toString(){
        return "Course name: " + name + " Instructor:" + instructor + "students count: " +students;
    }




    
}
