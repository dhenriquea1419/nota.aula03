public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Ana", "15/08/1980", 8000, "Projeto X");
        Programador programador = new Programador("Daniel", "14/12/2006", 15000, "Java");

        gerente.informarSalario();
        gerente.calcularIdade();
        gerente.informarProjeto();

        programador.informarSalario();
        programador.calcularIdade();
        programador.informarLinguagem();
    }
}
