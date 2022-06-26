/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author Bruno Vieira
 */
public class Sintomas {
    private String febre;
    private String dorCabeca;
    private String secrecao;
    private String dorIrritacao;
    private String tosseSeca;
    private String dificRespiratoria;
    private String doresCorpo;
    private String diarreia;
    private String contatoCovid;
    private String locaisAglomerados;

    public String getFebre() {
       if(febre.equals("0")){
            febre = "5";
        }else{
            febre = "0";
        }
        return this.febre;
    }

    public void setFebre(String febre) {
        this.febre = febre;
    }

    public String getDorCabeca() {
        if(dorCabeca.equals("0")){
            dorCabeca = "1";
        }else{
            dorCabeca = "0";
        }
        return this.dorCabeca;
    }

    public void setDorCabeca(String dorCabeca) {
        this.dorCabeca = dorCabeca;
    }

    public String getSecrecao() {
        if(secrecao.equals("0")){
            secrecao = "1";
        }else{
            secrecao = "0";
        }
        return this.secrecao;
    }

    public void setSecrecao(String secrecao) {
        this.secrecao = secrecao;
    }

    public String getDorIrritacao() {
        if(dorIrritacao.equals("0")){
            dorIrritacao = "1";
        }else{
            dorIrritacao = "0";
        }
        return this.dorIrritacao;
    }

    public void setDorIrritacao(String dorIrritacao) {
        this.dorIrritacao = dorIrritacao;
    }

    public String getTosseSeca() {
        if(tosseSeca.equals("0")){
            tosseSeca = "3";
        }else{
            tosseSeca = "0";
        }
        return this.tosseSeca;
    }

    public void setTosseSeca(String tosseSeca) {
        this.tosseSeca = tosseSeca;
    }

    public String getDificRespiratoria() {
        if(dificRespiratoria.equals("0")){
           dificRespiratoria = "10";
       }else{
           dificRespiratoria = "0";
       }
        return this.dificRespiratoria;
    }

    public void setDificRespiratoria(String dificRespiratoria) {
        this.dificRespiratoria = dificRespiratoria;
    }

    public String getDoresCorpo() {
        if(doresCorpo.equals("0")){
           doresCorpo = "1";
       }else{
           doresCorpo = "0";
       }
        return this.doresCorpo;
    }

    public void setDoresCorpo(String doresCorpo) {
        this.doresCorpo = doresCorpo;
    }

    public String getDiarreia() {
        if(diarreia.equals("0")){
           diarreia = "1";
       }else{
           diarreia = "0";
       }
        return this.diarreia;
    }

    public void setDiarreia(String diarreia) {
        this.diarreia = diarreia;
    }

    public String getContatoCovid() {
        if(contatoCovid.equals("0")){
           contatoCovid = "10";
       }else{
           contatoCovid = "0";
       }
        return this.contatoCovid;
    }

    public void setContatoCovid(String contato) {
        this.contatoCovid = contato;
    }

    public String getLocaisaglomerado() {
        if(locaisAglomerados.equals("0")){
           locaisAglomerados = "3";
       }else{
           locaisAglomerados = "0";
       }
        return this.locaisAglomerados;
    }

    public void setLocaisAglomerados(String locais) {
        this.locaisAglomerados = locais;
    }

    public int soma(int resultado){         
        int feb = Integer.parseInt(getFebre());
        int dorCab = Integer.parseInt(getDorCabeca());
         int secNasal = Integer.parseInt(getSecrecao());
       int dorIrrita = Integer.parseInt(getDorIrritacao());
        int toss = Integer.parseInt(getTosseSeca());
        int difres = Integer.parseInt(getDificRespiratoria());
        int dorCorp = Integer.parseInt(getDoresCorpo());
        int diarr = Integer.parseInt(getDiarreia());
        int contCovid = Integer.parseInt(getContatoCovid());
        int aglo = Integer.parseInt(getLocaisaglomerado()); 
        int resul = feb + dorCab + secNasal + dorIrrita + toss + difres + dorCorp + diarr + contCovid + aglo;     
        
        return resul;
    }   
}
