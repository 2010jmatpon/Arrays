package tablasMultiplicar;

public class A42TablaMultiplicar {
    public static void main(String[] args) {

    }
    int [][] creaTablaMultiplicar (int numero) {
        int [][] tabla = new int [10][3];
        for (int i = 0; i < tabla.length; i++){
            tabla [i][0] = numero;
            for (int j = 0; j < tabla[i].length; j ++){
                tabla [i][j+1] = i + 1;
            }
        }
        return tabla;
    }

}
