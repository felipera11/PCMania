public class Cliente {

    public String nome;
    public long cpf;


    Computador[] comp = new Computador[50]; //levando em consideraçao que ninguem vai comprar mais de 50 pcs de uma vez

    public float total = 0;

    public void calculaTotalCompra(int aux){ //usado para finalizar a compra
        System.out.println("Dados do cliente:");
        System.out.println("Nome: "+nome);
        System.out.println("CPF: "+cpf);
        System.out.println();
        System.out.println("Os seguintes computadores foram comprados:");
        System.out.println();
        for (int i = 0; i < aux; i++) {
            total = total + comp[i].preco;
            comp[i].mostraPCConfigs();
            System.out.println();
        }
        System.out.println("O valor total da compra sera: R$"+total);
        System.out.println("Muito obrigado por comprar na loja PC Mania!!");
    }

    //teste

}
