package dasafio2.service;

import dasafio2.model.Categoria;

import java.util.List;

public interface CategoriaService {

    List<Categoria> list();
    Categoria findById(String id);
}
