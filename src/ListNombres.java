import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ListNombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String>nombres = new ArrayList<>();
        boolean seguir = true;

        do{
            System.out.println("Introduce un nombre:");
            String nombre = sc.nextLine();
            if(nombre.equalsIgnoreCase("fin")){
                seguir = false;
            }else {
                nombres.add(nombre);
            }
        }while(seguir);

        for(int i=0; i<nombres.size(); i++){
            System.out.println((i+1) + " " +  nombres.get(i));
        }
    }
}