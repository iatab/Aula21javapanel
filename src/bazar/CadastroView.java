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


        criarTextField("Descricao do item", this.tfNome);
        criarTextField("Ano do Item", this.tfAno);
        criarTextField("Valor do Item", this.tfValor);

        criarBotao("salvar", new BotaoSalvarHandler());

        //incluir codigos

        criarBotao("Voltar", new BotaoVoltarHandler());

        setSize(new Dimension(500, 500));
        setPreferredSize(new Dimension(500,500));
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void criarLabel (String texto){
        JLabel label = new JLabel(texto);
        label.setPreferredSize(new Dimension(400,40));
        this.painel.add(label);
    }

    private void criarTextField(String texto, JTextField caixaTexto){
        criarLabel(texto);
        caixaTexto = new JTextField();
        caixaTexto.setPreferredSize(new Dimension(400,40));
        this.painel.add(caixaTexto);
        //tem que criar 3x para cada caixa de texto
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
    private void criarItem() {
//            String ano = this.tfAno.getText(); // para pegar texto
        // item item = new item(nome, ano, valor);
        //this.service.inseriritem(..);
        JOptionPane.showMessageDialog(null, "Cadastro salvo com sucesso!");
    }

    private  class BotaoSalvarHandler implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {

//            setVisible(false);
            criarItem();

        }
    }


}
