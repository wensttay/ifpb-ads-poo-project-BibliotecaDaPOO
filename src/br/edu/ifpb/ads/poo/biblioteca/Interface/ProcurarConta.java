/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.poo.biblioteca.Interface;

import br.edu.ifpb.ads.poo.biblioteca.Controllers.GeralControl;
import br.edu.ifpb.ads.poo.biblioteca.Controllers.ProcurarContaControl;
import br.edu.ifpb.ads.poo.biblioteca.Dao.BibliotecaDAO;
import br.edu.ifpb.ads.poo.biblioteca.Entidades.Aluno;
import br.edu.ifpb.ads.poo.biblioteca.Entidades.Constans;
import br.edu.ifpb.ads.poo.biblioteca.Entidades.Funcionario;
import java.awt.Frame;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @version 1.0
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 07/01/2017 - 12:01:31
 */
public class ProcurarConta extends javax.swing.JFrame {

    BibliotecaDAO bibliotecaDAO;
    GeralControl geralControl;
    ProcurarContaControl procurarContaControl;
    Frame logadoFrame;

    /**
     * Creates new form ProcurarConta
     */
    /**
     *
     * @throws IOException error de arquivos
     */
    public ProcurarConta() throws IOException {
        initComponents();
        this.procurarContaControl = new ProcurarContaControl();
        this.bibliotecaDAO = new BibliotecaDAO();

        for (String i : Constans.CARGOS) {
            this.cargojComboBox.addItem(i);
        }

        for (String i : Constans.SETORES) {
            this.setorjComboBox.addItem(i);
        }
    }

    public ProcurarConta(GeralControl geralControl, JFrame logadoFrame) throws IOException {
        initComponents();
        this.procurarContaControl = new ProcurarContaControl();
        this.bibliotecaDAO = new BibliotecaDAO();
        this.geralControl = geralControl;
        this.logadoFrame = logadoFrame;

        for (String i : Constans.CARGOS) {
            this.cargojComboBox.addItem(i);
        }

        for (String i : Constans.SETORES) {
            this.setorjComboBox.addItem(i);
        }

        for (String i : Constans.CURSOS) {
            this.cursojComboBox.addItem(i);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        emailjTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        nomejTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        procurarjButton = new javax.swing.JButton();
        editarjButton = new javax.swing.JButton();
        salvarjButton = new javax.swing.JButton();
        excluirjButton = new javax.swing.JButton();
        cancelarjButton = new javax.swing.JButton();
        alterar_SenhajButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        matriculajFormattedTextField = new javax.swing.JFormattedTextField();
        cargojComboBox = new javax.swing.JComboBox();
        setorjComboBox = new javax.swing.JComboBox();
        cursojComboBox = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        enderecojTextField1 = new javax.swing.JTextField();
        telefonejFormattedTextField1 = new javax.swing.JFormattedTextField();
        CPFjFormattedTextField = new javax.swing.JFormattedTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Procurar Conta");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        jLabel2.setText("Matrícula");

        jPanel12.setBackground(new java.awt.Color(153, 153, 153));
        jPanel12.setPreferredSize(new java.awt.Dimension(111, 111));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 122, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel3.setText("CPF");

        emailjTextField1.setEditable(false);
        emailjTextField1.setMaximumSize(new java.awt.Dimension(6, 113));
        emailjTextField1.setMinimumSize(new java.awt.Dimension(6, 113));
        emailjTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailjTextField1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Email");

        jLabel14.setText("Endereço");

        jLabel16.setText("Telefone");

        nomejTextField1.setEditable(false);
        nomejTextField1.setMaximumSize(new java.awt.Dimension(6, 113));
        nomejTextField1.setMinimumSize(new java.awt.Dimension(6, 113));
        nomejTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomejTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome");

        procurarjButton.setText("Procurar");
        procurarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procurarjButtonActionPerformed(evt);
            }
        });

        editarjButton.setText("Editar");
        editarjButton.setEnabled(false);
        editarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarjButtonActionPerformed(evt);
            }
        });

        salvarjButton.setText("Salvar");
        salvarjButton.setEnabled(false);
        salvarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarjButtonActionPerformed(evt);
            }
        });

        excluirjButton.setText("Excluir");
        excluirjButton.setEnabled(false);
        excluirjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirjButtonActionPerformed(evt);
            }
        });

        cancelarjButton.setText("Cancelar");
        cancelarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarjButtonActionPerformed(evt);
            }
        });

        alterar_SenhajButton.setText("Alterar Senha");
        alterar_SenhajButton.setEnabled(false);
        alterar_SenhajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterar_SenhajButtonActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        matriculajFormattedTextField.setEditable(false);
        try {
            matriculajFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-###-###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        matriculajFormattedTextField.setToolTipText("");

        cargojComboBox.setEnabled(false);
        cargojComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargojComboBoxActionPerformed(evt);
            }
        });

        setorjComboBox.setEnabled(false);

        cursojComboBox.setEnabled(false);

        jLabel20.setText("Curso");

        enderecojTextField1.setEditable(false);
        enderecojTextField1.setMaximumSize(new java.awt.Dimension(6, 113));
        enderecojTextField1.setMinimumSize(new java.awt.Dimension(6, 113));
        enderecojTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecojTextField1ActionPerformed(evt);
            }
        });

        telefonejFormattedTextField1.setEditable(false);
        try {
            telefonejFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+## (###) ####-#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            CPFjFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel17.setText("Cargo");

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Setor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(469, 469, 469)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(editarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(salvarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(excluirjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(alterar_SenhajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cancelarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(procurarjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(CPFjFormattedTextField)
                            .addComponent(telefonejFormattedTextField1)
                            .addComponent(enderecojTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nomejTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(emailjTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(matriculajFormattedTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(setorjComboBox, 0, 180, Short.MAX_VALUE)
                            .addComponent(cargojComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cursojComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(setorjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(matriculajFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cargojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel20)
                    .addComponent(cursojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(enderecojTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(telefonejFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(CPFjFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(editarjButton)
                                    .addComponent(salvarjButton)
                                    .addComponent(excluirjButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(alterar_SenhajButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cancelarjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(procurarjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void alterar_SenhajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterar_SenhajButtonActionPerformed
        try {
            AlterarSenhaFrame alterarSenhaFrame = new AlterarSenhaFrame(this.procurarContaControl.getUsuario());
            alterarSenhaFrame.setVisible(true);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado", "File Error", JOptionPane.ERROR_MESSAGE);
        }

        this.salvarjButton.setEnabled(false);
        this.editarjButton.setEnabled(false);
        this.alterar_SenhajButton.setEnabled(false);
        this.excluirjButton.setEnabled(false);
        this.procurarjButton.setEnabled(true);
        this.CPFjFormattedTextField.setEditable(true);

        this.nomejTextField1.setEditable(false);
        this.matriculajFormattedTextField.setEditable(false);
        this.enderecojTextField1.setEditable(false);
        this.emailjTextField1.setEditable(false);
        this.telefonejFormattedTextField1.setEditable(false);
        this.cargojComboBox.setEnabled(false);
        this.setorjComboBox.setEnabled(false);
        this.cursojComboBox.setEnabled(false);

        this.CPFjFormattedTextField.setText("");
        this.nomejTextField1.setText("");
        this.matriculajFormattedTextField.setText("");
        this.enderecojTextField1.setText("");
        this.emailjTextField1.setText("");
        this.telefonejFormattedTextField1.setText("");
        this.cargojComboBox.setSelectedItem("<none>");
        this.setorjComboBox.setSelectedItem("<none>");
        this.cursojComboBox.setSelectedItem("<none>");
    }//GEN-LAST:event_alterar_SenhajButtonActionPerformed

    private void cancelarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarjButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelarjButtonActionPerformed

    private void excluirjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirjButtonActionPerformed

        if (this.procurarContaControl.getUsuario().equals(geralControl.getFuncionario_Logado())) {
            try {
                int resposta = JOptionPane.showConfirmDialog(null, "Deseja mesmo excluir sua conta?", "Aviso", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION, null);

                if (resposta == 0) {
                    this.bibliotecaDAO.removeFuncionario(this.geralControl.getFuncionario_Logado());
                    this.dispose();
                    this.logadoFrame.dispose();
                    LoginFrame novo = new LoginFrame();
                    novo.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Operação Cancelada");
                }

            } catch (IOException | ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Arquivo não encontrado", "File Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            try {
                int resposta = JOptionPane.showConfirmDialog(null, "Deseja mesmo excluir a conta: "
                        + this.procurarContaControl.getUsuario().getNome() + " ?",
                        "Aviso", JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION, null);

                if (resposta == 0) {
                    if (this.procurarContaControl.getUsuario() instanceof Funcionario) {
                        this.bibliotecaDAO.removeFuncionario((Funcionario) this.procurarContaControl.getUsuario());
                    } else if (this.procurarContaControl.getUsuario() instanceof Aluno) {
                        this.bibliotecaDAO.removeAluno((Aluno) this.procurarContaControl.getUsuario());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Operação Cancelada");
                }
            } catch (IOException | ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Arquivo não encontrado", "File Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        this.nomejTextField1.setEditable(false);
        this.matriculajFormattedTextField.setEditable(false);
        this.enderecojTextField1.setEditable(false);
        this.emailjTextField1.setEditable(false);
        this.telefonejFormattedTextField1.setEditable(false);
        this.cargojComboBox.setEnabled(false);
        this.setorjComboBox.setEnabled(false);
        this.cursojComboBox.setEnabled(false);

    }//GEN-LAST:event_excluirjButtonActionPerformed

    private void salvarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarjButtonActionPerformed
        if (this.nomejTextField1.getText() == null || this.nomejTextField1.getText().equals("")
                || this.matriculajFormattedTextField.getText() == null || this.matriculajFormattedTextField.getText().equals("")) {
            this.nomejTextField1.setText(this.procurarContaControl.getUsuario().getNome());
            this.matriculajFormattedTextField.setText(this.procurarContaControl.getUsuario().getMatricula());
            JOptionPane.showMessageDialog(null, "Os campos Nome, Matricula são obrigatorios!");
        } else {
            try {
                if (procurarContaControl.getUsuario() != null) {
                    if (procurarContaControl.getUsuario() instanceof Funcionario) {
                        String cargo = (String) this.cargojComboBox.getSelectedItem();
                        String setor = (String) this.setorjComboBox.getSelectedItem();
                        Funcionario funcionarioPraDeletar = new Funcionario(cargo, setor,
                                this.nomejTextField1.getText(), this.enderecojTextField1.getText(), this.emailjTextField1.getText(),
                                this.matriculajFormattedTextField.getText(), this.CPFjFormattedTextField.getText(), this.telefonejFormattedTextField1.getText(),
                                procurarContaControl.getUsuario().getSenha());

                        if (funcionarioPraDeletar.equals(this.geralControl.getFuncionario_Logado())) {
                            this.geralControl.setFuncionario_Logado(funcionarioPraDeletar);
                        }

                        this.bibliotecaDAO.editFuncionarios(funcionarioPraDeletar);

                    } else if (procurarContaControl.getUsuario() instanceof Aluno) {
                        String curso = (String) this.cursojComboBox.getSelectedItem();
                        Aluno alunoPraDeletar = new Aluno(curso, this.nomejTextField1.getText(),
                                this.enderecojTextField1.getText(), this.emailjTextField1.getText(),
                                this.matriculajFormattedTextField.getText(), this.CPFjFormattedTextField.getText(), this.telefonejFormattedTextField1.getText(),
                                procurarContaControl.getUsuario().getSenha());

                        this.bibliotecaDAO.editAlunos(alunoPraDeletar);
                    }
                }
            } catch (IOException | ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Não existe nenhuma conta com esse CPF", "Error", JOptionPane.INFORMATION_MESSAGE);
            }

            this.salvarjButton.setEnabled(false);
            this.editarjButton.setEnabled(false);
            this.alterar_SenhajButton.setEnabled(false);
            this.excluirjButton.setEnabled(false);
            this.procurarjButton.setEnabled(true);
            this.CPFjFormattedTextField.setEditable(true);

            this.nomejTextField1.setEditable(false);
            this.matriculajFormattedTextField.setEditable(false);
            this.enderecojTextField1.setEditable(false);
            this.emailjTextField1.setEditable(false);
            this.telefonejFormattedTextField1.setEditable(false);
            this.cargojComboBox.setEnabled(false);
            this.setorjComboBox.setEnabled(false);
            this.cursojComboBox.setEnabled(false);

            this.CPFjFormattedTextField.setText("");
            this.nomejTextField1.setText("");
            this.matriculajFormattedTextField.setText("");
            this.enderecojTextField1.setText("");
            this.emailjTextField1.setText("");
            this.telefonejFormattedTextField1.setText("");
            this.cargojComboBox.setSelectedItem("<none>");
            this.setorjComboBox.setSelectedItem("<none>");
            this.cursojComboBox.setSelectedItem("<none>");
        }

    }//GEN-LAST:event_salvarjButtonActionPerformed

    private void editarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarjButtonActionPerformed
        this.salvarjButton.setEnabled(true);
        this.excluirjButton.setEnabled(false);
        this.alterar_SenhajButton.setEnabled(false);
        this.procurarjButton.setEnabled(false);
        this.editarjButton.setEnabled(false);

        this.CPFjFormattedTextField.setEditable(false);
        this.nomejTextField1.setEditable(true);
        this.matriculajFormattedTextField.setEditable(true);
        this.enderecojTextField1.setEditable(true);
        this.emailjTextField1.setEditable(true);
        this.telefonejFormattedTextField1.setEditable(true);

        if (this.procurarContaControl.getUsuario() instanceof Funcionario) {
            this.cargojComboBox.setEnabled(true);
            this.setorjComboBox.setEnabled(true);
        } else {
            this.cursojComboBox.setEnabled(true);
        }
    }//GEN-LAST:event_editarjButtonActionPerformed

    private void procurarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procurarjButtonActionPerformed
        try {
            Funcionario aux = this.procurarContaControl.procurarFuncionario(this.CPFjFormattedTextField.getText());

            if (aux != null) {
                procurarContaControl.setUsuario(aux);
                this.nomejTextField1.setText(aux.getNome());
                this.matriculajFormattedTextField.setText(aux.getMatricula());
                this.emailjTextField1.setText(aux.getEmail());
                this.enderecojTextField1.setText(aux.getEndereco());
                this.telefonejFormattedTextField1.setText(aux.getTelefone());

                for (String i : Constans.CARGOS) {
                    if (aux.getCargo().equals(i)) {
                        this.cargojComboBox.setSelectedItem(i);
                        break;
                    }
                }

                for (String i : Constans.SETORES) {
                    if (aux.getSetor().equals(i)) {
                        this.setorjComboBox.setSelectedItem(i);
                        break;
                    }
                }
                this.editarjButton.setEnabled(true);
                this.excluirjButton.setEnabled(true);
                this.alterar_SenhajButton.setEnabled(true);
            } else {
                Aluno aux2 = this.procurarContaControl.procurarAluno(this.CPFjFormattedTextField.getText());

                if (aux2 != null) {
                    procurarContaControl.setUsuario(aux2);
                    this.nomejTextField1.setText(aux2.getNome());
                    this.matriculajFormattedTextField.setText(aux2.getMatricula());
                    this.emailjTextField1.setText(aux2.getEmail());
                    this.enderecojTextField1.setText(aux2.getEndereco());
                    this.telefonejFormattedTextField1.setText(aux2.getTelefone());

                    for (String i : Constans.CURSOS) {
                        if (aux2.getCurso().equals(i)) {
                            this.cursojComboBox.setSelectedItem(i);
                            break;
                        }
                    }

                    this.editarjButton.setEnabled(true);
                    this.excluirjButton.setEnabled(true);
                    this.alterar_SenhajButton.setEnabled(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Não existe nenhuma conta com esse CPF", "Error", JOptionPane.INFORMATION_MESSAGE);
                }
            }

        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado", "File Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_procurarjButtonActionPerformed

    private void enderecojTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecojTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecojTextField1ActionPerformed

    private void nomejTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomejTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomejTextField1ActionPerformed

    private void emailjTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailjTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailjTextField1ActionPerformed

    private void cargojComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargojComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cargojComboBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProcurarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProcurarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProcurarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProcurarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ProcurarConta().setVisible(true);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Arquivo não encontrado", "File Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField CPFjFormattedTextField;
    private javax.swing.JButton alterar_SenhajButton;
    private javax.swing.JButton cancelarjButton;
    private javax.swing.JComboBox cargojComboBox;
    private javax.swing.JComboBox cursojComboBox;
    private javax.swing.JButton editarjButton;
    private javax.swing.JTextField emailjTextField1;
    private javax.swing.JTextField enderecojTextField1;
    private javax.swing.JButton excluirjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JFormattedTextField matriculajFormattedTextField;
    private javax.swing.JTextField nomejTextField1;
    private javax.swing.JButton procurarjButton;
    private javax.swing.JButton salvarjButton;
    private javax.swing.JComboBox setorjComboBox;
    private javax.swing.JFormattedTextField telefonejFormattedTextField1;
    // End of variables declaration//GEN-END:variables
}
