public class ProgramaConta {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.setNumero(12345);
        cc.setTitular("Maria");
        cc.depositar(1000.0);
        cc.setLimite(500);

    if(cc.sacar(1500)){
    System.out.println("Saque realizado com sucesso na conta corrente.");     
    }
    else{
    System.out.println("Saldo insuficiente.");
    }


        ContaPoupanca cp = new ContaPoupanca();
        cp.setNumero(54321);
        cp.setTitular("João");
        cp.depositar(2000.0);
        cp.setRendimento(0.05);

        if(cp.sacar(2100)){
            System.out.println("Saque realizado com sucesso na conta Poupança.");     
        }
        else{
            System.out.println("Saldo insuficiente.");
        }

        //imprimir dados da conta corrente
        System.out.println("Conta Corrente");
        System.out.println("Número: " + cc.getNumero());
        System.out.println("Titular: " + cc.getTitular());
        System.out.println("Saldo: " + cc.getSaldo());

        //imprimir dados da conta poupança
        System.out.println("Conta Poupança:");
        System.out.println("Número: " + cp.getNumero());
        System.out.println("Titular: " + cp.getTitular());
        System.out.println("Saldo: " + cp.getSaldo());

        Diretor diretor = new Diretor();
        diretor.setSenha(1234);

        Gerente gerente = new Gerente();
        gerente.setSenha(5678);

        Cliente cliente = new Cliente();
        cliente.setSenha(9999);

        System.out.println("Diretor autenticado - "
                + diretor.autenticar(1234));

        System.out.println("Gerente autenticado - "
                + gerente.autenticar(5678));

        System.out.println("Cliente autenticado - "
                + cliente.autenticar(9999));
}
}