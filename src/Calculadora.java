import java.util.ArrayList;

public class Calculadora {

    public void soma (ArrayList<Float> lista1, ArrayList<Float> lista2){

        ArrayList<Float> lista3 = new ArrayList<Float>();

        for (int i = 0; i < 5; i++){
            lista3.add(lista1.get(i) + lista2.get(i));
        }

        System.out.println(lista3);
    }

    public void subtracao(ArrayList<Float> lista1, ArrayList<Float> lista2){

        ArrayList<Float> lista3 = new ArrayList<Float>();

        for (int i = 0; i < 5; i++){
            lista3.add(lista1.get(i) - lista2.get(i));
        }

        System.out.println(lista3);
    }

    public void multiplicacao(ArrayList<Float> lista1, ArrayList<Float> lista2){

        ArrayList<Float> lista3 = new ArrayList<Float>();

        for (int i = 0; i < 5; i++){
            lista3.add(lista1.get(i) * lista2.get(i));
        }

        System.out.println(lista3);
    }

    public void divisao(ArrayList<Float> lista1, ArrayList<Float> lista2){

        ArrayList<Float> lista3 = new ArrayList<Float>();

        for (int i = 0; i < 5; i++){
            lista3.add(lista1.get(i) / lista2.get(i));
        }

        System.out.println(lista3);
    }
}
