package dasafio2.controller;

import dasafio2.service.LancamentoService;
import dasafio2.model.Lancamento;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class LancamentoController {

    @Autowired
    private ConversionService conversionService;

    @Autowired
    private LancamentoService lancamentoService;

    @GetMapping(value = "/lancamentos")
    public List<Lancamento> list() {
        System.out.println("Listando lançamentos ");
        List<Lancamento> lancamentos = lancamentoService.list();

        System.out.println("Retornando lançamentos " + lancamentos.size());
        return lancamentos;
    }

    @GetMapping(value = "/lancamento/{id}")
    public Lancamento get(@PathVariable int id){
        System.out.println("Buscando lancamento por ID " + id);

        Lancamento lancamento = lancamentoService.findById(id);
        System.out.println("Encontrando lançamento: " + lancamento);

        return lancamento;
   }

   @GetMapping(value = "/lancamentos/categoria/{categoria}")
    public List<Lancamento> ListLancamentosCategoria (@PathVariable Long categoria){
       System.out.println("Buscando lançamentos por categoria " + categoria);

       List<Lancamento> lancamentos = lancamentoService.findByCategoria(categoria);
       System.out.println("Encontrando lançamentos por categoria: " + lancamentos);

       return lancamentos;
   }

   @GetMapping(value = "/lancamentos/mes/{mes_lancamento}")
    public List<Lancamento> ListLancamentosMes (@PathVariable Long mes_lancamento){
       System.out.println("Buscando lançamentos por mês " + mes_lancamento);

       List<Lancamento> lancamentos = lancamentoService.findByMesLancamento(mes_lancamento);
       System.out.println("Encontrando lançamentos por mês: " + lancamentos);

       return  lancamentos;
   }
}
