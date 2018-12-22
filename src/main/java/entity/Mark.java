package entity;

public class Mark {
    private static final long serialVersionUID = 1L;
  private Integer id_mark;
  private Integer teacher_id;
  private String note;
  private Teacher teacher;

    public Mark() {
    }

    public Mark(Integer id_mark, Integer teacher_id, String note, Teacher teacher) {
        this.id_mark = id_mark;
        this.teacher_id = teacher_id;
        this.note = note;
        this.teacher = teacher;
    }

    public Integer getId_mark() {
        return id_mark;
    }

    public void setId_mark(Integer id_mark) {
        this.id_mark = id_mark;
    }

    public Integer getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(Integer teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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
        return "note [" + note + "]";
    }
}
