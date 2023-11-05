package br.ufu.poo2.biblioteca.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

import br.ufu.poo2.biblioteca.strategy.PagamentoStrategy;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Multa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double valor;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "livro_id", nullable = false)
    private Livro livro;

    @Temporal(TemporalType.DATE)
    private Date dataEmprestimo;

    @Temporal(TemporalType.DATE)
    private Date dataDevolucao;

    @Temporal(TemporalType.DATE)
    private Date dataMulta;

    @Transient // marking as transient as strategy instances are not to be persisted
    private PagamentoStrategy pagamentoStrategy;

    public Multa(double valor) {

        this.valor = valor;
        this.dataMulta = new Date(); // assuming the fine is generated at the moment of creation
    }

    public boolean realizarPagamento() {
        return pagamentoStrategy.realizarPagamento(valor);
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Long getId() {
        return id;
    }

    public Livro getLivro() {
        return livro;
    }

    public Date getDataMulta() {
        return dataMulta;
    }

    public double getValor() {
        return valor;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public void setDataMulta(Date dataMulta) {
        this.dataMulta = dataMulta;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setPagamentoStrategy(PagamentoStrategy pagamentoStrategy) {
        this.pagamentoStrategy = pagamentoStrategy;
    }
}
