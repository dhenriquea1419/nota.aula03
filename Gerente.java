class Gerente extends Funcionario {
    String projeto;

    public Gerente(String nome, String nasc, double salario, String projeto) {
        super(nome, nasc, salario);
        this.projeto = projeto;
    }

    public void informarProjeto() {
        System.out.println("Projeto: " + projeto);
    }
}
