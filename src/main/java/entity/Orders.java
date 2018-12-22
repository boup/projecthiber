package entity;

public class Orders {
    private static final long serialVersionUID = 1L;

    private Integer id_order;
//    private  Integer stud_id;
    private  String nature;
    private  Student student;

    public Orders() {
    }

    public Orders(Integer id_order, String nature, Student student) {
        this.id_order = id_order;
//        this.stud_id = stud_id;
        this.nature = nature;
        this.student = student;
    }

    public Integer getId_order() {
        return id_order;
    }

    public void setId_order(Integer id_order) {
        this.id_order = id_order;
    }

//    public Integer getStud_id() {
//        return stud_id;
//    }
//
//    public void setStud_id(Integer stud_id) {
//        this.stud_id = stud_id;
//    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString()
    {
        return "nature [" + nature + "]";
    }
}
