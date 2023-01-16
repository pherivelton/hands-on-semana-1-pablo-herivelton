package entidades;

import java.util.List;

public class Faturamento {

    String empresa;
    Integer mes;
    Integer ano;
    List<Double> parcelas;
    List<String> datas;

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public List<Double> getParcelas() {
        return parcelas;
    }

    public void setParcelas(List<Double> parcelas) {
        this.parcelas = parcelas;
    }

    public List<String> getDatas() {
        return datas;
    }

    public void setDatas(List<String> datas) {
        this.datas = datas;
    }
}
