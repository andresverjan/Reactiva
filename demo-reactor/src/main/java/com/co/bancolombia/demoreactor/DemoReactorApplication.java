package com.co.bancolombia.demoreactor;

import com.co.bancolombia.demoreactor.model.Person;
import io.reactivex.Observable;
import io.reactivex.subjects.BehaviorSubject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Mono;

import java.util.List;


@SpringBootApplication
public class DemoReactorApplication {

    //public static final Logger log = (Logger) LoggerFactory.getLogger(DemoReactorApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(DemoReactorApplication.class, args);

        List<Person> students = List.of(
                new Person("1", "Juan", "Pérez", "123456789", 30, "Aries"),
                new Person("2","María", "Gómez", "987654321", 25, "Virgo"),
                new Person("3","Carlos", "Martínez", "555444333", 40, "Capricorn"),
                new Person("4","Laura", "Rodríguez", "111222333", 35, "Taurus"),
                new Person("5","Pedro", "Sánchez", "999888777", 28, "Leo"),
                new Person("6","Ana", "Fernández", "666777888", 22, "Aquarius"),
                new Person("7","David", "López", "333222111", 45, "Cancer"),
                new Person("8","Sofía", "Díaz", "777666555", 32, "Geminis"),
                new Person("9","Javier", "Hernández", "888999000", 27, "Scorpio"),
                new Person("10","Elena", "García", "112233445", 33, "Libra"),
                new Person("11","Pablo", "Muñoz", "554433221", 38, "Pisces"),
                new Person("12","Rosa", "Jiménez", "998877665", 29, "Sagittarius")
        );

        BehaviorSubject<List<Person>> observableList = BehaviorSubject.createDefault(students);

        // list changes
        observableList
                .flatMapIterable(student -> students)
                        .map(Person::getFirstName)
                                .subscribe(System.out::println);

        // modified list
        students.get(3).setFirstName("Helena");
        observableList.onNext(students);


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
