class Programador extends Funcionario {
    String linguagem;

    public Programador(String nome, String nasc, double salario, String linguagem) {
        super(nome, nasc, salario);
        this.linguagem = linguagem;
    }

    public void informarLinguagem() {
        System.out.println("Linguagem: " + linguagem);
    }
}
