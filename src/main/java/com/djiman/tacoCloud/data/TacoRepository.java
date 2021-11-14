package com.djiman.tacoCloud.data;

import com.djiman.tacoCloud.model.Taco;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository extends CrudRepository<Taco,Long> {
//    Taco save(Taco design);
}
