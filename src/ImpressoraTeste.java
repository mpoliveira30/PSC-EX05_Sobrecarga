import java.util.Scanner;

public class ImpressoraTeste {
        
    public static void main(String[] args) {
        
        int Inum1, Inum2;
        float Fnum3, Fnum4, Fnum5;
        String nome1, nome2, nome3;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Inteiros");
        Inum1 = scan.nextInt();
        Inum2 = scan.nextInt();
        
        System.out.println("Floats");
        Fnum3 = scan.nextFloat();
        Fnum4 = scan.nextFloat();
        Fnum5 = scan.nextFloat();
        
        System.out.println("String");
        nome1 = scan.nextLine();
        nome2 = scan.nextLine();
        nome3 = scan.nextLine();
        
        Impressora imp = new Impressora();
       
        
        imp.Exibir(Fnum3);
        imp.Exibir(nome3, Fnum5);
        imp.Exibir(Fnum5, nome3);
        imp.Exibir(Fnum4, Fnum5);
        imp.Exibir(nome1, nome2, nome3);
        imp.Exibir(Inum1, Inum2, nome3);
        
        
        
    }
    
}
