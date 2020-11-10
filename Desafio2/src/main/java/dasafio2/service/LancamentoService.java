package dasafio2.service;

import dasafio2.model.Lancamento;

import java.util.List;

public interface LancamentoService {

    Lancamento findById(int id);

    List<Lancamento> findByCategoria(Long categoria);

    List<Lancamento> list();

    List<Lancamento> findByMesLancamento(Long mes_lancamento);
}
