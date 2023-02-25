public class Busquedas {
    //Creando el método del algoritmo de Búsqueda Lineal
    public static int busquedaLineal(int[] arreglo, int valorBuscado) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valorBuscado) {
                return i; // retorna el índice donde se encuentra el valor buscado
            }
        }
        return -1; // si el valor no se encuentra en el arreglo, retorna -1
    }

    //Creando código del método para el algoritmo de la Búsqueda Binaria
    public static int busquedaBinaria(int[] arreglo2, int valorBuscado2) {
        int inicio = 0;
        int fin = arreglo2.length - 1;
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            if (arreglo2[medio] == valorBuscado2) {
                return medio; // retorna el índice donde se encuentra el valor buscado
            } else if (arreglo2[medio] < valorBuscado2) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return -1; // si el valor no se encuentra en el arreglo, retorna -1
    }

    public static void main(String[] args) {
        int arreglo[] = {5, 8, 9, 3, 1, 0}; //Valor Buscado = 0 se encuentra en la posición 5
        int valorBuscado = 0;
        int indice = busquedaLineal(arreglo, valorBuscado);

        int arreglo2[] = {5, 6, 1, 0, 4, 2}; //Valor Buscado = 4 se encuentra en la posición 4
        int valorBuscado2 = 4;
        int indice2 = busquedaBinaria(arreglo2, valorBuscado2);

        if (indice ==-1){
            System.out.println("El valor " + valorBuscado + " No se encuentra en el arreglo");
        } else {
            System.out.println("El valor " + valorBuscado + " se encuentra en la posición [" + indice + "] del arreglo");
        }

        if (indice2 ==-1){
            System.out.println("El valor " + valorBuscado2 + " No se encuentra en el arreglo");
        } else {
            System.out.println("El valor " + valorBuscado2 + " se encuentra en la posición [" + indice2 + "] del arreglo");
        }



    }


}
