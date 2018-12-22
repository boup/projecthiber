package entity;

public class Student {
    private static final long serialVersionUID = 1L;

    private Integer id_student;
    private String first_name;
    private String last_name;
    private String email;
    private Integer teacher_id;
    private Teacher teacher;

    public Student() {
    }

    public Student(Integer id_student, String first_name, String last_name, String email, Integer teacher_id, Teacher teacher) {
        this.id_student = id_student;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.teacher_id = teacher_id;
        this.teacher = teacher;
    }

    public Integer getId_student() {
        return id_student;
    }

    public void setId_student(Integer id_student) {
        this.id_student = id_student;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(Integer teacher_id) {
        this.teacher_id = teacher_id;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
//    @Override
//    public String toString()
//    {
//        return "Student["+
//    }
//}
}
