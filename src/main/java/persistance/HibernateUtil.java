package persistance;

////import org.hibernate.SessionFactory;
////import org.hibernate.cfg.Configuration;
////import org.hibernate.service.ServiceRegistry;
////import org.hibernate.service.ServiceRegistryBuilder;
//import org.hibernate.service.ServiceRegistry;
//
//import javax.security.auth.login.Configuration;


import entity.Student;
import entity.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


import javax.imageio.spi.ServiceRegistry;

public class HibernateUtil {



//    private static SessionFactory configureSessionFactory() throws
//            HibernateException {
//        Configuration configuration = new Configuration();
//        configuration.configure();
//        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings
//                (configuration.getProperties()).buildServiceRegistry();
//        SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
//        return sessionFactory;
//    }

    private static final SessionFactory sessionFactory = buildSessionFactory();
    private static StandardServiceRegistry serviceRegistry;

    private static SessionFactory buildSessionFactory() {
        try {
//            SessionFactory sessionFactory = new
//                    Configuration ( ).configure ( ).buildSessionFactory ( );
//            Session session=sessionFactory.openSession();
//            Transaction tx=session.beginTransaction();
//            tx.commit();
//            return null;
            org.hibernate.cfg.Configuration configuration = new Configuration().configure();
            configuration.configure("hibernate.cfg.xml");
            StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();

            return configuration.buildSessionFactory(serviceRegistry);
        }
        catch(Exception e){
            e.printStackTrace();
            return null;}
//        catch (Throwable ex) {
////            System.err.println("Initial SessionFactory creation failed." + ex);
//            throw new ExceptionInInitializerError(ex);
//        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
        getSessionFactory().close();
    }
}
