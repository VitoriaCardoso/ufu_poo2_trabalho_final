package br.ufu.poo2.biblioteca.factory;

import br.ufu.poo2.biblioteca.model.Emprestimo;
import br.ufu.poo2.biblioteca.model.Livro;
import br.ufu.poo2.biblioteca.model.Usuario;

import java.util.Date;

public interface FabricaDeEmprestimo {
    Emprestimo criarEmprestimo(Long id, Usuario usuario, Livro livro, Date dataEmprestimo,Date dataDevolucao);
}
