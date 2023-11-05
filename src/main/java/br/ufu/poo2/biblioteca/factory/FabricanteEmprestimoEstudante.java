package br.ufu.poo2.biblioteca.factory;

import br.ufu.poo2.biblioteca.model.Emprestimo;
import br.ufu.poo2.biblioteca.model.EmprestimoEstudante;
import br.ufu.poo2.biblioteca.model.Livro;
import br.ufu.poo2.biblioteca.model.Usuario;

import java.util.Date;

public class FabricanteEmprestimoEstudante implements FabricaDeEmprestimo{
    @Override
    public EmprestimoEstudante criarEmprestimo(Long id, Usuario usuario, Livro livro, Date dataEmprestimo, Date dataDevolucao) {
        EmprestimoEstudante estudante = new EmprestimoEstudante();
        estudante.setId(id);
        estudante.setUsuario(usuario);
        estudante.setLivro(livro);
        estudante.setDataEmprestimo(dataEmprestimo);
        estudante.setDataDevolucao(dataDevolucao);
        return estudante;
    }
}
