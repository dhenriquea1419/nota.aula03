class Funcionario {
    String nome;
    String nasc;  
    double salario;

    public Funcionario(String nome, String nasc, double salario) {
        this.nome = nome;
        this.nasc = nasc;
        this.salario = salario;
    }

    public void informarSalario() {
        System.out.println("Salário: " + salario);
    }

    public void calcularIdade() {
        int anoAtual = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        int anoNascimento = Integer.parseInt(nasc.substring(nasc.length() - 4));
        int idade = anoAtual - anoNascimento;
        System.out.println("Idade: " + idade);
    }
}
