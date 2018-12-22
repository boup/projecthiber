import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import entity.*;
import org.hibernate.Session;
import persistance.HibernateUtil;

import javax.management.Query;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
//    ObjectMapper objectMapper = new ObjectMapper();
//    ObjectMapper xmlMapper = new XmlMapper();

    public static void main(String[] args) {
        showresult();
    }

    public static void fillwithvalues() {

        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        Teacher t = new Teacher();
        t.setFirst_name("Joe");
        t.setLast_name("E");


        Teacher t1 = new Teacher();
        t1.setFirst_name("dem");
        t1.setLast_name("q");


        Student st = new Student();
        st.setTeacher(t);
        st.setFirst_name("sedan");
        st.setLast_name("wh");
        st.setEmail("do@gmail.com");


        Student st1 = new Student();
        st1.setTeacher(t1);
        st1.setFirst_name("sena");
        st1.setLast_name("whh");
        st1.setEmail("doo@gmail.com");

        Mark m = new Mark();
        m.setTeacher(t);
        m.setNote("12");


        Mark m1 = new Mark();
        m1.setTeacher(t1);
        m1.setNote("123");

        Book b = new Book();
        b.setTeacher(t);
        b.setType("java");


        Book b1 = new Book();
        b1.setTeacher(t);
        b1.setType("word");


        Orders o = new Orders();
        o.setStudent(st);
        o.setNature("plane");

        Orders o1 = new Orders();
        o1.setStudent(st1);
        o1.setNature("restful");

        session.save(t);
        session.save(t1);
        session.save(st);
        session.save(st1);
        session.save(m);
        session.save(m1);
        session.save(b);
        session.save(b1);
        session.save(o);
        session.save(o1);


        session.getTransaction().commit();
    }

    public static void dbtojson() {

        Session session = HibernateUtil.getSessionFactory().openSession();
        org.hibernate.query.Query query = session.createQuery("SELECT k FROM Teacher k");
        List<Teacher> tr = query.list();
        query = session.createQuery("SELECT k FROM Student k");
        List<Student> stu = query.list();
        query = session.createQuery("SELECT k FROM Mark k");
        List<Mark> ma = query.list();
        query = session.createQuery("SELECT k FROM Book k");
        List<Book> boo = query.list();
        query = session.createQuery("SELECT k FROM Orders k");
        List<Orders> doo = query.list();

        ObjectMapper objectMapper = new ObjectMapper();

        try

    {
        objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("target/student.json"), stu);
        objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("target/orders.json"), doo);
        objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("target/book.json"), boo);
        objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("target/mark.json"), ma);
        objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("target/teacher.json"), tr);
    } catch(
    IOException e)

    {
        e.printStackTrace();
    }


}
    public static void dbtoxml() {

        Session session = HibernateUtil.getSessionFactory().openSession();
        org.hibernate.query.Query  query = session.createQuery("SELECT k FROM Teacher k");
        List<Teacher> tr = query.list();
        query = session.createQuery("SELECT k FROM Student k");
        List<Student> stu = query.list();
        query = session.createQuery("SELECT k FROM Mark k");
        List<Mark> ma = query.list();
        query = session.createQuery("SELECT k FROM Book k");
        List<Book> boo = query.list();
        query = session.createQuery("SELECT k FROM Orders k");
        List<Orders> doo = query.list();

        ObjectMapper xmlMapper = new XmlMapper();


        try {
            xmlMapper.writerWithDefaultPrettyPrinter().writeValue(new File("target/student.xml"), stu);
            xmlMapper.writerWithDefaultPrettyPrinter().writeValue(new File("target/orders.xml"), doo);
            xmlMapper.writerWithDefaultPrettyPrinter().writeValue(new File("target/mark.xml"), ma);
            xmlMapper.writerWithDefaultPrettyPrinter().writeValue(new File("target/book.xml"), boo);
            xmlMapper.writerWithDefaultPrettyPrinter().writeValue(new File("target/teacher.xml"), tr);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void jsontodb(){
     ObjectMapper objectMapper = new ObjectMapper();
        try {
            List<Teacher>  ter = objectMapper.readValue(new File("target/teacher1.json"), new TypeReference<List<Teacher>>(){});
            List<Student> stuu = objectMapper.readValue(new File("target/student1.json"), new TypeReference<List<Student>>(){});
            List<Orders> d = objectMapper.readValue(new File("target/orders1.json"), new TypeReference<List<Orders>>(){});
            List<Book> bo = objectMapper.readValue(new File("target/book1.json"), new TypeReference<List<Book>>(){});
            List<Mark> ma = objectMapper.readValue(new File("target/mark1.json"), new TypeReference<List<Mark>>(){});
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();

            for (Student t: stuu) {
                session.save(t);
            }
            for (Book t: bo) {
                session.save(t);
            }
            for (Mark t: ma) {
                session.save(t);
            }
            for (Orders t: d) {
                session.save(t);
            }
            session.getTransaction().commit();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void xmltodb(){
        ObjectMapper xmlMapper = new XmlMapper();
        try {
            List<Teacher>  ter = xmlMapper.readValue(new File("target/teacher1.xml"), new TypeReference<List<Teacher>>(){});
            List<Student> stuu = xmlMapper.readValue(new File("target/student1.xml"), new TypeReference<List<Student>>(){});
            List<Orders> d = xmlMapper.readValue(new File("target/orders1.xml"), new TypeReference<List<Orders>>(){});
            List<Book> bo = xmlMapper.readValue(new File("target/book1.xml"), new TypeReference<List<Book>>(){});
            List<Mark> ma = xmlMapper.readValue(new File("target/mark1.xml"), new TypeReference<List<Mark>>(){});
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();

            for (Student t: stuu) {
                session.save(t);
            }
            for (Book t: bo) {
                session.save(t);
            }
            for (Mark t: ma) {
                session.save(t);
            }
            for (Orders t: d) {
                session.save(t);
            }
            session.getTransaction().commit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void showresult() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        org.hibernate.query.Query query = session.createQuery("SELECT k FROM Teacher k");
        List<Teacher> ts = query.list();
        System.out.println(ts);
        query = session.createQuery("SELECT first_name FROM Student");
        List<Student> st = query.list();
        System.out.println(st);
        query = session.createQuery("SELECT note FROM Mark");
        List<Mark> carord = query.list();
        System.out.println(carord);
        query = session.createQuery("SELECT k FROM Book k");
        List<Book> carcreat = query.list();
        System.out.println(carcreat);

//        System.out.println(carcreat);
        query = session.createQuery("SELECT type FROM Orders");
        List<Orders> del = query.list();
        System.out.println(del);
    }


}
