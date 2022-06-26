/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mapaps1;

import Classes.CadPaciente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author franc
 */
public class Principal {
    public static void main(String[] args){
        CadPaciente p1 = new CadPaciente();
        List<CadPaciente> lis = new ArrayList<CadPaciente>();
        int res = 0;        
        while(true){
            try{
                String cpf = JOptionPane.showInputDialog(null, "Informe seu Cpf");
                if(cpf.equals("SAIR")){
                    System.exit(0);
                }else{
                    p1.setCpf(Integer.parseInt(cpf));
                }   
                String idade = JOptionPane.showInputDialog(null,"Informe sua idade");
                p1.setIdade(Integer.parseInt(idade));
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"caractere não permitido, informe somente números! tente novamente");
                String cpf = JOptionPane.showInputDialog(null, "Informe seu Cpf");
                if(cpf.equals("SAIR")){
                    System.exit(0);
                }else{
                    p1.setCpf(Integer.parseInt(cpf));
                }
                String idade = JOptionPane.showInputDialog(null,"Informe sua idade");
                p1.setIdade(Integer.parseInt(idade));
            }         


            try{
                String nome = JOptionPane.showInputDialog(null,"informe seu nome");
                p1.setNome(nome);            
                String sexo = JOptionPane.showInputDialog("Informe seu sexo: ");
                p1.setSexo(sexo);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"caractere não permitido, informe somente letras! tente novamente");
                String nome = JOptionPane.showInputDialog(null,"informe seu nome");
                p1.setNome(nome);            
                String sexo = JOptionPane.showInputDialog("Informe seu sexo: ");
                p1.setSexo(sexo);
            }

            JOptionPane.showMessageDialog(null,"CADASTRO REALIZADO COM SUCESSO.");
            JOptionPane.showMessageDialog(null,"****QUESTIONÁRIO****");
            int febre = JOptionPane.showConfirmDialog(null,"Tem febre? ");
            p1.setFebre(Integer.toString(febre));
            int dorCabeca = JOptionPane.showConfirmDialog(null,"Tem dor de Cabeça?");
            p1.setDorCabeca(Integer.toString(dorCabeca));
            int secrecao = JOptionPane.showConfirmDialog(null,"Tem secreção nasal ou espirros? ");
            p1.setSecrecao(Integer.toString(secrecao));
            int dorIrritacao = JOptionPane.showConfirmDialog(null,"Tem dor/irritação na garganta? ");
            p1.setDorIrritacao(Integer.toString(dorIrritacao));
            int tosse = JOptionPane.showConfirmDialog(null,"Tem tosse seca? ");
            p1.setTosseSeca(Integer.toString(tosse));
            int dificuldadeResp = JOptionPane.showConfirmDialog(null,"Tem dificuldade respiratória? ");
            p1.setDificRespiratoria(Integer.toString(dificuldadeResp));
            int doresCorpo = JOptionPane.showConfirmDialog(null,"Tem dores no corpo? ");
            p1.setDoresCorpo(Integer.toString(doresCorpo));
            int diarreia = JOptionPane.showConfirmDialog(null,"Tem diarreia? ");
            p1.setDiarreia(Integer.toString(diarreia));
            int contatoCovid = JOptionPane.showConfirmDialog(null,"Esteve em contato, nos últimos 14 dias, com um caso diagnosticado com COVID-19? ");
            p1.setContatoCovid(Integer.toString(contatoCovid));
            int aglomeracao = JOptionPane.showConfirmDialog(null,"Esteve em locais com grande aglomeração?");
            p1.setLocaisAglomerados(Integer.toString(aglomeracao));     


        if(p1.soma(res) <= 9){           
            JOptionPane.showMessageDialog(null,"Local de Atendimento Ala de Risco Baixo");
                }else if(p1.soma(res) > 9 && p1.soma(res) <= 19){           
                JOptionPane.showMessageDialog(null,"Local de Atendimento Ala de Risco Médio");
                }else if(p1.soma(res) > 19){           
            JOptionPane.showMessageDialog(null,"Local de Atendimento Ala de Risco Alto");
            }
            lis.add(p1);  
        }  
    }

}