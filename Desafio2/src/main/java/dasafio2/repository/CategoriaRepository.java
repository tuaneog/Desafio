package dasafio2.repository;

import dasafio2.model.Categoria;
import java.util.List;

public interface CategoriaRepository {
    List<Categoria> findAll();
}
