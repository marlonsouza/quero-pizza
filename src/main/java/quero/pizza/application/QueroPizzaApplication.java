package quero.pizza.application;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/api")
public class QueroPizzaApplication extends Application {
    
    private final Set<Class<?>> classes = new HashSet<>();
    
    public QueroPizzaApplication(){
        classes.add(QueroPizzaApi.class);
        classes.add(FilterApplication.class);
    }

    @Override
    public Set<Class<?>> getClasses() {
        return classes;
    }
    
}
