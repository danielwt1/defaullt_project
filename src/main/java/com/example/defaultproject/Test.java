package com.example.defaultproject;

import com.example.defaultproject.basemodels.Articulos;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;


@RestController

public class Test {

    @GetMapping()
    public ResponseEntity<Flux<Articulos>> getFlux() {
        Articulos art1 = new Articulos("Computador","Es un computador",500);
        Articulos art2 = new Articulos("Televisor","Es un Televisor",200);
        Articulos art3 = new Articulos("Batidora","Es un Batidora",900);
        Articulos art4 = new Articulos("Freidora","Es un Freidora",1500);
        Articulos art5 = new Articulos("Lavadora","Es un Lavadora",1500);
        Articulos art6 = new Articulos("play 5","Es un play",800);

        Flux<Articulos> test2 =Flux.just(art1,art2,art3,art4,art5,art6);
        return new ResponseEntity<>(test2,HttpStatus.OK);
    }


}
