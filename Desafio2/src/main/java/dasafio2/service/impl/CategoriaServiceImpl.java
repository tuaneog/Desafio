package dasafio2.service.impl;

import dasafio2.model.Categoria;
import dasafio2.repository.CategoriaRepository;
import dasafio2.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public List<Categoria> list() {
        return categoriaRepository.findAll();
    }

    @Override
    public Categoria findById(String id) {
        List<Categoria> categorias = categoriaRepository.findAll();

        for (Categoria categoria : categorias) {
            if (categoria.getId().toString().equals(id)) {
                return categoria;
            }
        }
        return null;
    }

}
