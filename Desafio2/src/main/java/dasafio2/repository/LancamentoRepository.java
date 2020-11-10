package dasafio2.repository;

import dasafio2.model.Lancamento;

import java.util.List;

public interface LancamentoRepository {
    List<Lancamento> findAll();
}
