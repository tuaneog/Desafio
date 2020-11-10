package dasafio2.repository;

import dasafio2.model.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class CategoriaHeroku implements CategoriaRepository{

    @Autowired
    private RestTemplate restTemplate;

    public List<Categoria> findAll() {
        ResponseEntity<Categoria[]> response =
                restTemplate.getForEntity(
                        "https://desafio-it-server.herokuapp.com/categorias",
                        Categoria[].class);

        Categoria[] categorias = response.getBody();

        return Arrays.asList(categorias);
    }
}
