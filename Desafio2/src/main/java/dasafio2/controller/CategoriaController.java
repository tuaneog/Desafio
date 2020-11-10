package dasafio2.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import dasafio2.model.Categoria;
import dasafio2.service.CategoriaService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CategoriaController {

    @Autowired
    private ConversionService conversionService;

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping(value = "/categorias")
    public List<Categoria> list() {
        System.out.println("Listando categorias ");
        List<Categoria> categorias = categoriaService.list();

        System.out.println("Retornando categorias " + categorias.size());
        return categorias;
    }

    @GetMapping(value = "/categoria/{id}")
    public Categoria get(@PathVariable String id) {
        System.out.println("buscando categoria por ID " + id);

        Categoria categoria = categoriaService.findById(id);
        System.out.println("Encontrado categoria: " + categoria);

        return categoria;
    }

}
