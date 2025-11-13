package bazar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuInicialView extends JFrame {

    private JPanel painel;


    public MenuInicialView() {
        setTitle("Menu Inicial");
        setLayout(new FlowLayout());

        this.painel = new JPanel();
        this.painel.setLayout(new FlowLayout());
        this.painel.setPreferredSize(new Dimension(500, 200));
        add(this.painel);

        criarBotao("Cadastrar", new BotaoCadastrarHandler());
        criarBotao("Sair", new BotaoSairHandler());

        setSize(new Dimension(500, 300));
        setPreferredSize(new Dimension(500, 200));
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    private void criarBotao(String label, ActionListener listener) {
        JButton botao = new JButton(label);
        botao.addActionListener(listener);
        botao.setPreferredSize(new Dimension(300, 80));
        this.painel.add(botao);
    }


    private static class BotaoCadastrarHandler implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("cliquei");

        }
    }

    private static class BotaoSairHandler implements  ActionListener{


        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);

        }
    }

}
