public class Computador {

    String marca;
    float preco;

    SistemaOperacional OS = new SistemaOperacional();
    HardwareBasico HB = new HardwareBasico();
    MemoriaUSB memoria;

    void mostraPCConfigs(){
        System.out.println("Marca: "+marca);
        System.out.println("Preco: R$"+preco);
        System.out.println("Processador: "+HB.cpu);
        System.out.println("Memoria RAM: "+HB.ram+"Gb");
        System.out.println("Memoria: "+HB.hd+"Gb");
        System.out.println("Sistema Operacional: "+OS.nome+ OS.tipo+" bits");
        System.out.println("Memoria USB: "+ memoria.nome + " de "+memoria.capacidade + "Gb");
    }

    void addMemoriaUSB(int musb){
        if (musb==1) {
            memoria.capacidade=16;
            memoria.nome="Pen-drive";
        }
       else if (musb==2) {
            memoria.capacidade=32;
            memoria.nome="Pen-drive";
        }
        else if (musb==3) {
            memoria.capacidade=1000;
            memoria.nome="Hd Externo";
        }
    }
}
