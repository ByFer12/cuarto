import java.util.Scanner;

public class cuarto {
    public static void main(String[] args) {
        int edad,cantidad=10,contador=0,aux=0,aux2=0;
        Scanner ent = new Scanner(System.in);
        while(contador<cantidad){
            System.out.println("Ingrese la edad de la persona: "+(contador+1));
            edad=ent.nextInt();
            if(edad>aux){
                aux=edad;

            }else if(edad<aux && edad>aux2){
                aux2=edad;
              
            }
            contador++;
         
        }
        System.out.println("La edad mayor es: "+aux);
        System.out.println("La edad menor es: "+aux2);

    }
    
}
