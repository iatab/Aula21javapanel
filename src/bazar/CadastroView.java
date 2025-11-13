package bazar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroView extends JFrame {


    private JPanel painel;
    private JTextField tfNome;
    private JTextField tfAno;
    private JTextField tfValor;

    public CadastroView() {
        setTitle("Cadastro de Itens");
        setLayout(new FlowLayout());

        this.painel = new JPanel();
        this.painel.setLayout(new FlowLayout());
        this.painel.setPreferredSize(new Dimension(500, 500));
        add(painel);

        //incluir codigos

        criarBotao("Voltar", new BotaoVoltarHandler());

        setSize(new Dimension(500, 500));
        setPreferredSize(new Dimension(500,500));
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    private void criarBotao(String label, ActionListener listener) {
        JButton botao = new JButton(label);
        botao.addActionListener(listener);
        botao.setPreferredSize(new Dimension(300, 80));
        this.painel.add(botao);
    }


    private  class BotaoVoltarHandler implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
//            System.out.println("cliquei");
            setVisible(false);
        }
    }
}
