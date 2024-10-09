package edu.fatec.lp2;

import edu.fatec.lp2.exercicio1.Contato;
import edu.fatec.lp2.exercicio1.Mensagem;
import edu.fatec.lp2.exercicio1.MsgTexto;

public class Main {
    public static void main(String[] args) {
         MsgTexto msgTexto = new MsgTexto(10, new Contato("Matui", "99999999"), "Hoje mesmo", "Tatudo bom?");

        Mensagem msg = msgTexto.sendMessage("Oi, tudo bem?");

        System.out.println("msg: " + msg);
    }
}