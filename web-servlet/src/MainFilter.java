import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

@WebFilter(filterName = "MainFilter", urlPatterns = { "/*" })
public class MainFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        final Iterator<Map.Entry<String, String[]>> iterator = servletRequest.getParameterMap().entrySet().iterator();
        while (iterator.hasNext()) {
            final Map.Entry<String, String[]> next = iterator.next();
            String key = next.getKey();
            final String[] value = next.getValue();
            System.out.println("key:" + key + "; value:" + value.toString());
        }
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
