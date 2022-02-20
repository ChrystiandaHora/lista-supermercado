import java.util.ArrayList;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    

   System.out.println(" -------Mercadinho Da Hora-------");
   System.out.println("\n Insira sua lista de compras: ");
   System.out.println("\nColoque a mercadoria e o preço ao lado");
   System.out.println("Exemplo: \nCoxinha R$2,50");

   ArrayList<String> listinha = new ArrayList<>();

   Scanner sc = new Scanner(System.in);
   int Produtos = 3;
  
   while(Produtos> 0){
     listinha.add(sc.nextLine());
     Produtos--;
   }
   
   System.out.println("\n-----------------------"); 

   for (int i=0; i<listinha.size(); i++){
     System.out.println(listinha.indexOf(listinha.get(i))+" - "+listinha.get(i));
   }

   System.out.println("\nQual item voce deseja remover? ");

   int tirar = sc.nextInt();
   listinha.remove(tirar);
   System.out.println("\n----------------------------");
   for (int i=0; i<listinha.size(); i++){
     System.out.println(listinha.indexOf(listinha.get(i))+" - "+listinha.get(i));
   }

   System.out.println("\nQual item voce deseja remover? ");
   
   Scanner va = new Scanner(System.in);

   int sair = va.nextInt();
   listinha.remove(sair);
   System.out.println("\n----------------------------");
   for (int i=0; i<listinha.size(); i++){
     System.out.println(listinha.indexOf(listinha.get(i))+" - "+listinha.get(i));
   }

   System.out.println("\nQual item voce deseja remover? ");
   Scanner n1 = new Scanner(System.in);
   int sumiu = n1.nextInt();
   listinha.remove(sumiu);
   for (int i=0; i<listinha.size(); i++){
     System.out.println(listinha.indexOf(listinha.get(i))+" - "+listinha.get(i));
   }

   System.out.println("\nVocê terminou sua lista! \nObrigado, volte sempre!");

  }  //NAO MEXE NESSAS AQUI!
  }
