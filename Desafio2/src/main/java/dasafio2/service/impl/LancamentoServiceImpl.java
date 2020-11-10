package dasafio2.service.impl;

import dasafio2.model.Lancamento;
import dasafio2.repository.LancamentoRepository;
import dasafio2.service.LancamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.ArrayList;

@Component
public class LancamentoServiceImpl implements LancamentoService {

    @Autowired
    private LancamentoRepository lancamentoRepository;

    @Override
    public Lancamento findById(int id) {
        List<Lancamento> lancamentos = lancamentoRepository.findAll();

        for (Lancamento lancamento : lancamentos) { //passando por todos os lançamentos da lista para encontrar o Id
            if (lancamento.getId() == (id)) {
                return lancamento;
            }
        }
        return null;
    }

    @Override
    public List<Lancamento> findByCategoria(Long categoria) {
        List<Lancamento> todosLancamentos = lancamentoRepository.findAll();
        List<Lancamento> resultado = new ArrayList<>(); //os lancamentos que interessam serâo passados para esta lista
        for (Lancamento lancamento : todosLancamentos) {
            if (lancamento.getCategoria() == (categoria)) {
                resultado.add(lancamento); //estou adicionando todos os lançamentos da categoria na lista
            }
        }
        return resultado;
    }

    @Override
    public List<Lancamento> list() {
        return lancamentoRepository.findAll();
    }

    @Override
    public List<Lancamento> findByMesLancamento(Long mes_lancamento) {
        List<Lancamento> todosLancamentos = lancamentoRepository.findAll();
        List<Lancamento> lancamentosDoMes = new ArrayList<>();
            for (Lancamento lancamento : todosLancamentos) {
                if (lancamento.getMes_lancamento() == (mes_lancamento)) {
                    lancamentosDoMes.add(lancamento);
                }
            }

        return lancamentosDoMes;
    }
}
