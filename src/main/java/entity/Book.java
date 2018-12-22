package entity;

public class Book {
    private static final long serialVersionUID = 1L;


    private  Integer id_book;
    private  Integer teacher_id;
    private  String type;
    private  Teacher teacher;

    public Book() {
    }

    public Book(Integer id_book, Integer teacher_id, String type, Teacher teacher) {
        this.id_book = id_book;
        this.teacher_id = teacher_id;
        this.type = type;
        this.teacher = teacher;
    }

    public Integer getId_book() {
        return id_book;
    }

    public void setId_book(Integer id_book) {
        this.id_book = id_book;
    }

    public Integer getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(Integer teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString()
    {
        return "type [" + type + "]";
    }
}
