public class Main {
    public static void main(String[] args) {
        Funcionarios funcionarios1 = new Funcionarios("Diniz", 1234223222, "1929209023", "02-01-2022", "04-09-2022", "manhã");
        Funcionarios funcionarios2 = new Funcionarios("Lucas", 1395048329, "1929280423", "11-01-2022", "01-11-2022", "tarde");
        Funcionarios funcionarios3 = new Funcionarios("Zé pier", 1209393811, "1109709023", "02-09-2022", "10-09-2022", "noite");

        Funcionarios[] minhaLista = new Funcionarios[3];
        minhaLista[0] = funcionarios1;
        minhaLista[1] = funcionarios2;
        minhaLista[2] = funcionarios3;

        for (int i = 0; i < minhaLista.length; i++){
            System.out.println(minhaLista[i].toString());
        }
    }
}