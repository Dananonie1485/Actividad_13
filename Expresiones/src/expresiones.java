import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class expresiones {

    private static String[] Palabras ={
            "Daniel","Agua","Cajón","Kpop", "Jorge", "Uvas", "Xochitl", "Fabula", "Estres", "Computadora", "Danonino", "Gato", "Hilo","Pato"
    };

    public static List<String> fillList(List list, int size){

        Random rand = new Random();

        for(int i= 0; i<size; i++){
            list.add(Palabras[rand.nextInt(Palabras.length)]);

        }

        return list;
    }


    public static void main(String[] args) {

        List<String> list = new ArrayList();

        //orden alfabetico
        Comparator<String> alphabeticalAnon = new Comparator<String>() {
            public int compare(String string1, String string2) {
                return Integer.compare(string1.charAt(0), string2.charAt(0));
            }
        };

        //orden tamaño
        Comparator<String> sizeAnon = new Comparator<String>(){
            public int compare(String string1, String string2) {
                return Integer.compare(string1.length(), string2.length());
            }
        };

        //alfabeto
        Comparator<String> alphabeticalLambda = (String string1, String string2) -> Integer.compare(string1.charAt(0), string2.charAt(0));

        //longitud/tamaño
        Comparator<String> sizeLambda = (String string1, String string2) -> Integer.compare(string1.length(), string2.length());

        //Método de referencia alfabetico
        Comparator<String> alphabeticalMethod = alphabeticalAnon::compare;

        //Método de referencia tamaño
        Comparator<String> sizeMethod = sizeAnon::compare;

        System.out.println("\nOrden alfabetico");
        fillList(list,14);
        list.sort(alphabeticalAnon);
        System.out.println("Lista: \n" + list);
        list.clear();

        System.out.println("\nOrden tamaño");
        fillList(list,14);
        list.sort(sizeAnon);
        System.out.println(" Lista: \n" + list);
        list.clear();

        System.out.println("\nOrden alfabetico por Lambda ");
        fillList(list,14);
        list.sort(alphabeticalLambda);
        System.out.println(" Lista: \n" + list);
        list.clear();

        System.out.println("\nOrden tamaño por Lambda ");
        fillList(list,14);
        list.sort(sizeLambda);
        System.out.println("Lista: \n" + list);
        list.clear();

        System.out.println("\nOrdenar alfabetico con método");
        fillList(list,14);
        list.sort(alphabeticalMethod);
        System.out.println(" Lista: \n" + list);
        list.clear();

        System.out.println("\n Ordenar tamaño con método");
        fillList(list,14);
        list.sort(sizeMethod);
        System.out.println(" Lista: \n" + list);
        list.clear();

    }

}//fin de la clase