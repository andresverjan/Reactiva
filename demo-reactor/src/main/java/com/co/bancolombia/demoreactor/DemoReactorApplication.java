package com.co.bancolombia.demoreactor;

import com.co.bancolombia.demoreactor.model.Person;
import io.reactivex.Observable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Mono;



@SpringBootApplication
public class DemoReactorApplication {

    //public static final Logger log = (Logger) LoggerFactory.getLogger(DemoReactorApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(DemoReactorApplication.class, args);

        reactor();
        rxjava2();

    }


    public static void reactor(){
        Mono.just(new Person("1", "Juan", "Pérez", "123456789", 30, "Aries"))
                .subscribe(p -> System.out.println("[Reactor] Persona: " + p));
    }

    public static void rxjava2(){
        Observable.just(new Person("1", "Juan", "Pérez", "123456789", 30, "Aries"))
                .subscribe(p -> System.out.println("[rxjava2] Persona: " + p));
    }


}
