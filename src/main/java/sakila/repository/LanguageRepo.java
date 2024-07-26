package sakila.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sakila.model.Language;


@Repository
public interface LanguageRepo extends JpaRepository<Language, Short>{

}
