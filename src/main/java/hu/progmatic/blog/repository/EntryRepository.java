package hu.progmatic.blog.repository;

import hu.progmatic.blog.model.Entry;
import org.springframework.data.repository.CrudRepository;

public interface EntryRepository extends CrudRepository<Entry, Long> {
}
