package Hib;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/*
 * This class follows the singleton pattern.
 */

@SuppressWarnings("deprecation")
public class DBControl

{

	private static final SessionFactory sessionFactory;

	static{
		Configuration config = new Configuration();

		config.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");

		config.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");

		//change the next line of code to match your MySQL URL and port

		config.setProperty("hibernate.connection.url", "jdbc:mysql://gabjames-org-mysql.gabjames.org:3306/cit360_team_e_skills_db");

		//change the next two lines of code to match your MySQL user name and password.

		config.setProperty("hibernate.connection.username", "teameadmin");

		config.setProperty("hibernate.connection.password", "c!t360T3amE");

		//change the pool size to reflect how many users you expect your application to have initially

		config.setProperty("hibernate.connection.pool_size", "1");

		config.setProperty("hibernate.connection.autocommit", "true");

		config.setProperty("hibernate.cache.provider_class", "org.hibernate.cache.NoCacheProvider");

		/*
		 * un-comment the next line of code if you want to be able to drop and recreate tables for 
		 * your data classes listed below.  This is generally a bad idea for security reasons.
		 */

		config.setProperty("hibernate.hbm2ddl.auto", "create-drop");

		config.setProperty("hibernate.show_sql", "true");

		config.setProperty("hibernate.transaction.factory_class", "org.hibernate.transaction.JDBCTransactionFactory");

		config.setProperty("hibernate.current_session_context_class", "thread");
                
                config.addAnnotatedClass(DB_jason_json.class);
		

		/*
		 *  Add your classes here that you want to match your database tables
		 */

		config.addAnnotatedClass(DB_jason_json.class);


		StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder().applySettings(config.getProperties());
		
		ServiceRegistry serviceRegistry = serviceRegistryBuilder.build();
		sessionFactory = config.buildSessionFactory(serviceRegistry);

	}

	public static SessionFactory getSessionFactory(){

		return sessionFactory;

	}

	//make a private default constructor so that no other HibernateUtil can be created.

	private DBControl (){

	}

}