import java.util.Scanner;


public class MainClass {

    public static void main(String[] args) {

        MemoriaUSB mem1 = new MemoriaUSB();
        MemoriaUSB mem2 = new MemoriaUSB();
        MemoriaUSB mem3 = new MemoriaUSB();

        Computador pc1 = new Computador();
        pc1.marca = "Positivo";
        pc1.preco = 1300;
        pc1.HB.cpu = "Pentium Core I3";
        pc1.HB.freq = 1200;
        pc1.HB.ram = 4;
        pc1.HB.hd = 500;
        pc1.OS.nome = "Linux Ubuntu";
        pc1.OS.tipo = 32;
        pc1.memoria = mem1;
        pc1.addMemoriaUSB(1);

        Computador pc2 = new Computador();
        pc2.marca = "Acer";
        pc2.preco = 1800;
        pc2.HB.cpu = "Pentium Core I5";
        pc2.HB.freq = 2260;
        pc2.HB.ram = 8;
        pc2.HB.hd = 1000;
        pc2.OS.nome = "Windows 8";
        pc2.OS.tipo = 64;
        pc2.memoria = mem2;
        pc2.addMemoriaUSB(2);

        Computador pc3 = new Computador();
        pc3.marca = "Vaio";
        pc3.preco = 2800;
        pc3.HB.cpu = "Pentium Core I7";
        pc3.HB.freq = 3500;
        pc3.HB.ram = 16;
        pc3.HB.hd = 2000;
        pc3.OS.nome = "Windows 10";
        pc3.OS.tipo = 64;
        pc3.memoria = mem3;
        pc3.addMemoriaUSB(3);

        Scanner input = new Scanner(System.in);

        Cliente c1 = new Cliente();

        System.out.println("Entre com seu nome:");
        String nome = input.nextLine();
        c1.nome = nome;
        System.out.println("Entre com seu CPF:");
        long cpf = input.nextLong();
        c1.cpf = cpf;

        int add;
        int aux = 0;

        System.out.println("Modelos de computadores disponiveis em nossa loja:");

        System.out.println("COMPUTADOR 1:");
        pc1.mostraPCConfigs();
        System.out.println();

        System.out.println("COMPUTADOR 2:");
        pc2.mostraPCConfigs();
        System.out.println();

        System.out.println("COMPUTADOR 3:");
        pc3.mostraPCConfigs();
        System.out.println();

        System.out.println("Digite os numeros 1, 2 ou 3 para selecionar os" +
                "seguintes modelos de computadores. Para finalizar sua " +
                "compra, digite o numero 0");

        while(true){
            add = input.nextInt();
            if(add==1){
                c1.comp[aux] = pc1;
                aux++;
            }
            else if(add==2){
                c1.comp[aux] = pc2;
                aux++;
            }
            else if(add==3){
                c1.comp[aux] = pc3;
                aux++;
            }
            else if(add==0){
                c1.calculaTotalCompra(aux);
                break;
            }
            else System.out.println("Digite um valor valido!!!");
        }

    }

}
