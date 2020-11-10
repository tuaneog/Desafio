package dasafio2.model;

public class Lancamento {

    private int id;
    private Double valor;
    private String origem;
    private Long categoria;
    private Long mes_lancamento;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public Long getCategoria() {
        return categoria;
    }

    public void setCategoria(Long categoria) {
        this.categoria = categoria;
    }

    public Long getMes_lancamento() {
        return mes_lancamento;
    }

    public void setMes_lancamento(Long mes_lancamento) {
        this.mes_lancamento = mes_lancamento;
    }

    @Override
    public String toString() {
        return "Lancamento{" +
                "id='" + id + '\'' +
                ", valor=" + valor +
                ", origem='" + origem + '\'' +
                ", categoria='" + categoria + '\'' +
                ", mes_lancamento='" + mes_lancamento + '\'' +
                '}';
    }
}
