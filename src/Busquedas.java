public class Busquedas {
    public static int busquedaLineal(int[] arreglo, int valorBuscado) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valorBuscado) {
                return i; // retorna el índice donde se encuentra el valor buscado
            }
        }
        return -1; // si el valor no se encuentra en el arreglo, retorna -1
    }

    public static int busquedaBinaria(int[] arreglo, int valorBuscado) {
        int inicio = 0;
        int fin = arreglo.length - 1;
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            if (arreglo[medio] == valorBuscado) {
                return medio; // retorna el índice donde se encuentra el valor buscado
            } else if (arreglo[medio] < valorBuscado) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return -1; // si el valor no se encuentra en el arreglo, retorna -1
    }

    public static void main(String[] args) {

    }
}
