package dasafio2.repository;

import dasafio2.model.Lancamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
public class LancamentoHeroku implements LancamentoRepository {

    @Autowired
    private RestTemplate restTemplate;

    public List<Lancamento> findAll(){
        ResponseEntity<Lancamento[]> response = restTemplate.getForEntity(
                "https://desafio-it-server.herokuapp.com/lancamentos",
                Lancamento[].class);

        Lancamento[] lancamentos = response.getBody();

        return Arrays.asList(lancamentos);
    }
}
