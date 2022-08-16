
import java.util.Arrays;
import java.util.Scanner;

public class Serie1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez la taille du tableau : ");
        int size = sc.nextInt();
        int tab[] = new int[size];

        
        
        for (int i = 0; i < size; i++) {
            System.out.println("Entrez les éléments du tableau positive : ");   
               
                if (tab[i]>0){
                     tab[i]= sc.nextInt();
                   
                }else {
                     System.out.println("l'élement du tableau est negative entrez un élément positive :");
                }
                
            
        }
        System.out.println("Les éléments du tableau " + Arrays.toString(tab));
    }
}
