package desafio.dio.gof;

import desafio.dio.gof.facade.Facade;
import desafio.dio.gof.singleton.SingletonEager;
import desafio.dio.gof.singleton.SingletonLazy;
import desafio.dio.gof.singleton.SingletonLazyHolder;
import desafio.dio.gof.strategy.*;

public class Teste {

    public static void main(String[] args) {
        //Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);


        //Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();


        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();


        robo.setComportamento(defensivo);
        robo.mover();


        //Facade
        Facade facade = new Facade();
        facade.migrarCliente("João", "1591000");


    }
}

