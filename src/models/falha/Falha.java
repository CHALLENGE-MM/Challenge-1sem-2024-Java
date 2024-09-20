package models.falha;

import java.util.Date;

public class Falha {

    private int idFalha;
    private String descricao;
    private Date data;
    private TipoFalha tipoFalha;
    private StatusFalha statusFalha;

    public Falha(int idFalha, String descricao, Date data, TipoFalha tipoFalha, StatusFalha statusFalha) {
        this.idFalha = idFalha;
        this.descricao = descricao;
        this.data = data;
        this.tipoFalha = tipoFalha;
        this.statusFalha = statusFalha;
    }

    public int getIdFalha() {
        return idFalha;
    }

    public void setIdFalha(int idFalha) {
        this.idFalha = idFalha;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public TipoFalha getTipoFalha() {
        return tipoFalha;
    }

    public void setTipoFalha(TipoFalha tipoFalha) {
        this.tipoFalha = tipoFalha;
    }

    public StatusFalha getStatusFalha() {
        return statusFalha;
    }

    public void setStatusFalha(StatusFalha statusFalha) {
        this.statusFalha = statusFalha;
    }
}
