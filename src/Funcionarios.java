import java.util.Date;

public class Funcionarios {
    private String nome;
    private long cpf;
    private String tel;
    private String dataNasc;
    private String dataAg;
    private String periodo;

    public Funcionarios(String nome, long cpf, String tel, String dataNasc, String dataAg, String periodo) {
        this.nome = nome;
        this.cpf = cpf;
        this.tel = tel;
        this.dataNasc = dataNasc;
        this.dataAg = dataAg;
        this.periodo = periodo;
    }

    public String getNome() {
        return nome;
    }

    public long getCpf() {
        return cpf;
    }

    public String getTel() {
        return tel;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public String getDataAg() {
        return dataAg;
    }

    public String getPeriodo() {
        return periodo;
    }


}
