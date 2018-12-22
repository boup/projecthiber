package entity;

public class Teacher {
    private static final long serialVersionUID = 1L;
      private Integer id;
      private  String first_name;
      private String last_name;

    public Teacher() {}

    public Teacher(Integer id, String first_name, String last_name) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
    @Override
    public String toString()
    {
         return "Teacher ["+ "id:" + id +" first_name:"+ first_name +" last_name:"+ last_name +"]";
    }
}
