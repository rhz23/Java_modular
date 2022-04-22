package digital.innovation.one;

import digital.innovation.one.utils.opracoes.Calculadora;

public class Runner {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.sum(3, 3));
        System.out.println(calculadora.div(15, 3));


    }
}
