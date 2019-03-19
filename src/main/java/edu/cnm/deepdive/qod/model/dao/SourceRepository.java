package edu.cnm.deepdive.qod.model.dao;

import edu.cnm.deepdive.qod.model.entity.Source;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;

public interface SourceRepository extends CrudRepository<Source, UUID> {

  List<Source> findAllByOrderByNameAsc();//Spring boot will implement this

  List<Source> findAllByNameContainingOrderByNameAsc(String fragment);

  Optional<Source> findById(UUID id);

}
