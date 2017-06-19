package org.launchcode.cheesemvc.models.data;

import org.launchcode.cheesemvc.models.Cheese;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by kajuh_000 on 6/18/2017.
 */

@Repository
@Transactional
public interface CheeseDao extends CrudRepository<Cheese, Integer> {
}
