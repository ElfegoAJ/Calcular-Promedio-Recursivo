import java.util.Arrays;

public class mainPromedio {

    public static void main(String[] args) {
        int arreglo[] = { 10, 9, 8, 10, 9 };
        Prom obj = new Prom();
        
        System.out.println("++++++++++Promedio con ciclo++++++++++");
        obj.promedioCiclo(arreglo);
        System.out.println("El promedio de las calificaciones "+Arrays.toString(arreglo)+" con recursividad "+ "es: "+Prom.promedioRecur(arreglo, 0));
		
    }

}
