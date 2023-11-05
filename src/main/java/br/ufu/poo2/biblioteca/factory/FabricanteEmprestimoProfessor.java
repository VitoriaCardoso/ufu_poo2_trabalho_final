package br.ufu.poo2.biblioteca.factory;

import br.ufu.poo2.biblioteca.model.*;

import java.util.Date;

public class FabricanteEmprestimoProfessor implements FabricaDeEmprestimo{
    @Override
    public EmprestimoProfessor criarEmprestimo(Long id, Usuario usuario, Livro livro, Date dataEmprestimo, Date dataDevolucao) {
        EmprestimoProfessor professor = new EmprestimoProfessor();
        professor.setId(id);
        professor.setUsuario(usuario);
        professor.setLivro(livro);
        professor.setDataEmprestimo(dataEmprestimo);
        professor.setDataDevolucao(dataDevolucao);
        return professor;
    }
}
