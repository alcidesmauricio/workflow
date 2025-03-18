package pacote.onde.esta; 

public class Documento {
    private long cnpj;

    private String numerodocumento;

    // Construtor padrão
    public Documento() {
    }

    // Construtor com parâmetro
    public Documento(long cnpj) {
        this.cnpj = cnpj;
    }

    public Documento(String numerodocumento) {
        this.numerodocumento = numerodocumento;
    }


    // Getter para cnpj
    public long getCnpj() {
        return cnpj;
    }

    // Setter para cnpj
    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    // Getter para cnpj
    public String getnumerodocumento() {
        return numerodocumento;
    }

    // Setter para cnpj
    public void setnumerodocumento(String numerodocumento) {
        this.numerodocumento = numerodocumento;
    }

    // Método para exibir informações do objeto
    @Override
    public String toString() {
        return "Documento{" +
                "cnpj=" + cnpj +
                '}';
    }
}