
public class Prom {
    private static int suma =0;
    public void promedioCiclo(int arreglo[]){
        float sumita=0;
        for(int i=0; i<arreglo.length;i++){
            sumita=sumita+arreglo[i];
            //System.out.println(arreglo[i]);
        }
        float promedio = sumita / arreglo.length;
        System.out.println("Promedio: "+ promedio);
    }
    
    
    public static float promedioRecur(int arreglo[],int pos){
        if (pos<arreglo.length) {
            suma = suma +arreglo[pos];
            promedioRecur(arreglo, pos+1);
        }
        return (float) suma / (float) arreglo.length;
    }
}
