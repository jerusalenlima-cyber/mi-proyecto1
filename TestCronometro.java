public class TestCronometro {
    public static void main(String[] args) {
      
        int[] numeros = new int[100000];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100000);
        }

        Cronometro cronometro = new Cronometro();

    
        ordenacionPorSeleccion(numeros);

      
        cronometro.detener();

        
        System.out.println("El tiempo de ejecución de la ordenación de 100,000 números fue: " 
                           + cronometro.lapsoDeTiempo() + " milisegundos.");
    }

    
    public static void ordenacionPorSeleccion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            int temp = arr[indiceMinimo];
            arr[indiceMinimo] = arr[i];
            arr[i] = temp;
        }
    }
}
