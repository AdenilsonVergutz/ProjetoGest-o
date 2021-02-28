package controladores;

import javax.swing.table.DefaultTableModel;

public class Acao {

    // Método para cadastro de Salas
    public void cadastrar(String NomeSala, double LotacaoSala) {

        // Criar objeto
        Salas p = new Salas();
        p.setNomeSala(NomeSala);
        p.setLotacaoSala(LotacaoSala);

        // Adicionar ao ArrayList
        Salas.dados.add(p);

    }

    public void CadastrarPessoa(String NomePessoa, String SobrenomePessoa, String NomeSala) {

        // Criar objeto
        Pessoa c = new Pessoa();
        c.setNomePessoa(NomePessoa);
        c.setSobrenomePessoa(SobrenomePessoa);
        c.setNomeSala(NomeSala);

        // Adicionar ao ArrayList
        Pessoa.dados.add(c);

    }

    public void CadastrarEspacos(String NomeEspaco, int LotacaoEspaco) {

        // Criar objeto
        Espacos f = new Espacos();
        f.setNomeEspaco(NomeEspaco);
        f.setLotacaoEspaco(LotacaoEspaco);

        // Adicionar o valor ao ArrayList
        Espacos.dados.add(f);

    }

    // Método para retornar os dados da Sala
    public DefaultTableModel listarSalas() {

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nome:");
        modelo.addColumn("Capacidade:");

        for (int indice = 0; indice < Salas.dados.size(); indice++) {
            modelo.addRow(new Object[] { Salas.dados.get(indice).getNomeSala(),
                    Salas.dados.get(indice).getLotacaoSala(), Salas.dados.get(indice) });

        }

        // Retorno
        return modelo;

    }

    // Método para retornar os dados da Pessoa
    public DefaultTableModel listarPessoa() {

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nome:");
        modelo.addColumn("Sobrenome:");
        modelo.addColumn("Sala:");

        for (int indice = 0; indice < Pessoa.dados.size(); indice++) {
            modelo.addRow(new Object[] { Pessoa.dados.get(indice).getNomePessoa(),
                    Pessoa.dados.get(indice).getSobrenomePessoa(), Pessoa.dados.get(indice).getNomeSala() });
        }

        // Retorno
        return modelo;

    }

    // Método para retornar os dados do Espaço
    public DefaultTableModel listarEspacos() {

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nome:");
        modelo.addColumn("Lotação:");

        for (int indice = 0; indice < Espacos.dados.size(); indice++) {
            modelo.addRow(new Object[] { Espacos.dados.get(indice).getNomeEspaco(),
                    Espacos.dados.get(indice).getLotacaoEspaco() });

        }

        // Retorno
        return modelo;

    }

    // Método para alterar
    public void alterar(String NomeSala, double LotacaoSala, int obterLinha) {

        // Criar objeto
        Salas p = new Salas();
        p.setNomeSala(NomeSala);
        p.setLotacaoSala(LotacaoSala);

        // Realizar a alteração
        Salas.dados.set(obterLinha, p);

    }

    // Método para alterar
    public void alterarPessoa(String NomePessoa, String SobrenomePessoa, int obterLinha) {

        // Criar objeto
        Pessoa c = new Pessoa();
        c.setNomePessoa(NomePessoa);
        c.setSobrenomePessoa(SobrenomePessoa);

        // Realizar a alteração do Pessoa
        Pessoa.dados.set(obterLinha, c);

    }

    // Método para alterar
    public void alterarEspaco(String NomeEspaco, String LotacaoEspaco, int obterLinha) {

        // Criar objeto
        Espacos f = new Espacos();

        // Realizar a alteração do Espaco
        Espacos.dados.set(obterLinha, f);

    }

}