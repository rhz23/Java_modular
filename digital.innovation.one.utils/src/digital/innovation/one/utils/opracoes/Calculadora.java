package digital.innovation.one.utils.opracoes;

import digital.innovation.one.utils.opracoes.internal.DivHelper;
import digital.innovation.one.utils.opracoes.internal.MultHelper;
import digital.innovation.one.utils.opracoes.internal.SubHelper;
import digital.innovation.one.utils.opracoes.internal.SumHelper;

public class Calculadora {

    private SumHelper sumHelper;
    private SubHelper subHelper;
    private MultHelper multHelper;
    private DivHelper divHelper;


    public Calculadora(){
        sumHelper = new SumHelper();
        subHelper = new SubHelper();
        multHelper = new MultHelper();
        divHelper = new DivHelper();
    }

    public int sum(int a, int b){
        return sumHelper.execute(a, b);
    }

    public int sub(int a, int b){
        return subHelper.execute(a, b);
    }

    public int mult(int a, int b){
        return multHelper.execute(a, b);
    }

    public int div(int a, int b){
        return divHelper.execute(a, b);
    }
}
