package modelo;

import java.util.ArrayList;

public class Trajeto {
    ArrayList<Coordenada> percurso = new ArrayList<Coordenada>();

    public Trajeto(int x, int y) {
        percurso.add(new Coordenada(x, y));
    }

    public void set_cordenada(int a, int b) {
        percurso.add(new Coordenada(a, b));
    }

    public Coordenada get_cordenada(int i) {
        return percurso.get(i);
    }

    public int get_size() {
        return percurso.size();
    }

    public Trajeto get_percurso01(){
        Trajeto percurso01 = new Trajeto(0, 0);
        percurso01.set_cordenada(1, 0);
        percurso01.set_cordenada(2, 0);
        percurso01.set_cordenada(2, 1);
        percurso01.set_cordenada(3, 1);
        percurso01.set_cordenada(3, 0);
        percurso01.set_cordenada(4, 0);
        percurso01.set_cordenada(5, 0);
        percurso01.set_cordenada(5, 1);
        percurso01.set_cordenada(5, 2);
        percurso01.set_cordenada(5, 3);
        percurso01.set_cordenada(5, 4);
        percurso01.set_cordenada(5, 5);
        percurso01.set_cordenada(4, 5);
        percurso01.set_cordenada(4, 4);
        percurso01.set_cordenada(4, 3);
        percurso01.set_cordenada(3, 3);
        percurso01.set_cordenada(3, 2);
        percurso01.set_cordenada(2, 2);
        percurso01.set_cordenada(2, 3);
        percurso01.set_cordenada(1, 3);
        percurso01.set_cordenada(1, 4);
        percurso01.set_cordenada(1, 5);
        percurso01.set_cordenada(0, 5);
        percurso01.set_cordenada(0, 4);
        percurso01.set_cordenada(0, 3);
        percurso01.set_cordenada(0, 2);
        percurso01.set_cordenada(0, 1);
        percurso01.set_cordenada(0, 0);
        return percurso01;
    }

    public Trajeto get_percurso02(){
        Trajeto percurso02 = new Trajeto(0, 0);
        percurso02.set_cordenada(1, 0);
        percurso02.set_cordenada(2, 0);
        percurso02.set_cordenada(3, 0);
        percurso02.set_cordenada(4, 0);
        percurso02.set_cordenada(5, 0);
        percurso02.set_cordenada(5, 1);
        percurso02.set_cordenada(5, 2);
        percurso02.set_cordenada(5, 3);
        percurso02.set_cordenada(5, 4);
        percurso02.set_cordenada(5, 5);
        percurso02.set_cordenada(4, 5);
        percurso02.set_cordenada(3, 5);
        percurso02.set_cordenada(3, 4);
        percurso02.set_cordenada(3, 3);
        percurso02.set_cordenada(3, 2);
        percurso02.set_cordenada(2, 2);
        percurso02.set_cordenada(2, 3);
        percurso02.set_cordenada(2, 4);
        percurso02.set_cordenada(2, 5);
        percurso02.set_cordenada(1, 5);
        percurso02.set_cordenada(0, 5);
        percurso02.set_cordenada(0, 4);
        percurso02.set_cordenada(0, 3);
        percurso02.set_cordenada(0, 2);
        percurso02.set_cordenada(0, 1);
        percurso02.set_cordenada(0, 0);
        return percurso02;
    }

    public Trajeto get_percurso05(){
        Trajeto percurso05 = new Trajeto(0, 0);
        percurso05.set_cordenada(1, 0);
        percurso05.set_cordenada(2, 0);
        percurso05.set_cordenada(3, 0);
        percurso05.set_cordenada(4, 0);
        percurso05.set_cordenada(5, 0);
        percurso05.set_cordenada(5, 1);
        percurso05.set_cordenada(5, 2);
        percurso05.set_cordenada(5, 3);
        percurso05.set_cordenada(5, 4);
        percurso05.set_cordenada(5, 5);
        percurso05.set_cordenada(4, 5);
        percurso05.set_cordenada(3, 5);
        percurso05.set_cordenada(2, 5);
        percurso05.set_cordenada(1, 5);
        percurso05.set_cordenada(0, 5);
        percurso05.set_cordenada(0, 4);
        percurso05.set_cordenada(0, 3);
        percurso05.set_cordenada(0, 2);
        percurso05.set_cordenada(0, 1);
        percurso05.set_cordenada(0, 0);
        return percurso05;
    }

    public Trajeto get_percurso12(){
        Trajeto percurso12 = new Trajeto(1, 0);
        percurso12.set_cordenada(2, 0);
        percurso12.set_cordenada(3, 0);
        percurso12.set_cordenada(3, 1);
        percurso12.set_cordenada(3, 2);
        percurso12.set_cordenada(3, 3);
        percurso12.set_cordenada(3, 4);
        percurso12.set_cordenada(3, 5);
        percurso12.set_cordenada(2, 5);
        percurso12.set_cordenada(1, 5);
        percurso12.set_cordenada(1, 4);
        percurso12.set_cordenada(1, 3);
        percurso12.set_cordenada(1, 2);
        percurso12.set_cordenada(1, 1);
        percurso12.set_cordenada(1, 0);
        return percurso12;
    }

    public Trajeto get_percurso08(){
        Trajeto percurso08 = new Trajeto(0, 1);
        percurso08.set_cordenada(1, 1);
        percurso08.set_cordenada(2, 1);
        percurso08.set_cordenada(3, 1);
        percurso08.set_cordenada(4, 1);
        percurso08.set_cordenada(5, 1);
        percurso08.set_cordenada(5, 2);
        percurso08.set_cordenada(5, 3);
        percurso08.set_cordenada(4, 3);
        percurso08.set_cordenada(3, 3);
        percurso08.set_cordenada(2, 3);
        percurso08.set_cordenada(1, 3);
        percurso08.set_cordenada(0, 3);
        percurso08.set_cordenada(0, 2);
        percurso08.set_cordenada(0, 1);
        return percurso08;
    }

    public Trajeto get_percurso18A(){
        Trajeto percurso18A = new Trajeto(5, 5);
        percurso18A.set_cordenada(5, 4);
        percurso18A.set_cordenada(5, 3);
        percurso18A.set_cordenada(5, 2);
        percurso18A.set_cordenada(4, 2);
        percurso18A.set_cordenada(3, 2);
        percurso18A.set_cordenada(2, 2);
        percurso18A.set_cordenada(2, 3);
        percurso18A.set_cordenada(2, 4);
        percurso18A.set_cordenada(2, 5);
        percurso18A.set_cordenada(3, 5);
        percurso18A.set_cordenada(4, 5);
        percurso18A.set_cordenada(5, 5);
        return percurso18A;
    }

    public Trajeto get_percurso13(){
        Trajeto percurso13 = new Trajeto(2, 0);
        percurso13.set_cordenada(3, 0);
        percurso13.set_cordenada(4, 0);
        percurso13.set_cordenada(4, 1);
        percurso13.set_cordenada(4, 2);
        percurso13.set_cordenada(4, 3);
        percurso13.set_cordenada(4, 4);
        percurso13.set_cordenada(4, 5);
        percurso13.set_cordenada(3, 5);
        percurso13.set_cordenada(2, 5);
        percurso13.set_cordenada(2, 4);
        percurso13.set_cordenada(2, 3);
        percurso13.set_cordenada(2, 2);
        percurso13.set_cordenada(2, 1);
        percurso13.set_cordenada(2, 0);
        return percurso13;
    }

    public Trajeto get_percurso21A(){
        Trajeto percurso21A = new Trajeto(1, 0);
        percurso21A.set_cordenada(1, 1);
        percurso21A.set_cordenada(1, 2);
        percurso21A.set_cordenada(0, 2);
        percurso21A.set_cordenada(0, 3);
        percurso21A.set_cordenada(1, 3);
        percurso21A.set_cordenada(1, 4);
        percurso21A.set_cordenada(1, 5);
        percurso21A.set_cordenada(2, 5);
        percurso21A.set_cordenada(3, 5);
        percurso21A.set_cordenada(4, 5);
        percurso21A.set_cordenada(4, 4);
        percurso21A.set_cordenada(4, 3);
        percurso21A.set_cordenada(5, 3);
        percurso21A.set_cordenada(5, 2);
        percurso21A.set_cordenada(4, 2);
        percurso21A.set_cordenada(4, 1);
        percurso21A.set_cordenada(4, 0);
        percurso21A.set_cordenada(3, 0);
        percurso21A.set_cordenada(2, 0);
        percurso21A.set_cordenada(1, 0);
        return percurso21A;
    }

    public Trajeto get_percurso22A(){
        Trajeto percurso22A = new Trajeto(2, 0);
        percurso22A.set_cordenada(2, 1);
        percurso22A.set_cordenada(1, 1);
        percurso22A.set_cordenada(0, 1);
        percurso22A.set_cordenada(0, 2);
        percurso22A.set_cordenada(0, 3);
        percurso22A.set_cordenada(0, 4);
        percurso22A.set_cordenada(1, 4);
        percurso22A.set_cordenada(2, 4);
        percurso22A.set_cordenada(2, 5);
        percurso22A.set_cordenada(3, 5);
        percurso22A.set_cordenada(3, 4);
        percurso22A.set_cordenada(4, 4);
        percurso22A.set_cordenada(5, 4);
        percurso22A.set_cordenada(5, 3);
        percurso22A.set_cordenada(5, 2);
        percurso22A.set_cordenada(5, 1);
        percurso22A.set_cordenada(4, 1);
        percurso22A.set_cordenada(3, 1);
        percurso22A.set_cordenada(3, 0);
        percurso22A.set_cordenada(2, 0);
        return percurso22A;
    }
}