package aplicacion;

import java.util.List;

import dominio.Mates;
public class Principal {
    public static void main (String [] args) {
        /* 1. */System.out.println(Mates.sumatorio(9));
        /* 2. */System.out.println(Mates.factorial(5));
        /* 3. */System.out.println(Mates.potencia(3,4));
        /* 4. */System.out.println(Mates.sumaLista(List.of(3, 5, 10, 20, 25)));
        /* 5. */System.out.println(Mates.media(List.of(3, 5, 10, 20, 25)));
        /* 6. */System.out.println(Mates.desviacionTipica(List.of(3,5,10,20,25)));
        /* 7. */System.out.println(Mates.sumaPares(12));
        /* 8. */System.out.println(Mates.sumaParesLista(List.of(3,5,10,20,25)));
        /* 9. */System.out.println(Mates.listaPares(List.of(3,5,10,20,25)));
        /* 10. */System.out.println(Mates.listaPares(13));
        /* 11. */System.out.println(Mates.productoEscalar(List.of(1,3), List.of(2,4)));
    }
    
}
