package pl.pjatk.micjac;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Trzecia {
    public Trzecia (ApplicationContext applicationContext) {
        Pierwsza abc = applicationContext.getBean("pierwsza", Pierwsza.class);
        abc.metodaKlasyPierwszejJeden();

    }
}
