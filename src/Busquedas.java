public class Busquedas {
    public static int busquedaLineal(int[] arreglo, int valorBuscado) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valorBuscado) {
                return i; // retorna el índice donde se encuentra el valor buscado
            }
        }
        return -1; // si el valor no se encuentra en el arreglo, retorna -1
    }


    public static void main(String[] args) {

    }
}
