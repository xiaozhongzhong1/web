import javax.servlet.Servlet;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.Enumeration;

/**
 * 感觉没啥用啊，不知道作用在什么地方
 */
@WebListener
public class MainServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        final Enumeration<Servlet> servlets = sce.getServletContext().getServlets();
        while (servlets.hasMoreElements()){
            final Servlet servlet = servlets.nextElement();
            System.out.println(servlet.getServletInfo()+"初始化了");
        }

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        final Enumeration<Servlet> servlets = sce.getServletContext().getServlets();
        while (servlets.hasMoreElements()){
            final Servlet servlet = servlets.nextElement();
            System.out.println(servlet.getServletInfo()+"销毁了");
        }
    }
}
