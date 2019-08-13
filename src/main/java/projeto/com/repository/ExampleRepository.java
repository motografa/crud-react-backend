package projeto.com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import projeto.com.model.Example;

@Repository
public interface ExampleRepository extends CrudRepository<Example, Long> {
	
	//https://www.concretepage.com/spring-boot/spring-boot-crudrepository-example

		//List<Article> findByTitle(String title);
	    //List<Article> findDistinctByCategory(String category);
	    //List<Article> findByTitleAndCategory(String title, String category);

	    //@Query("SELECT a FROM Article a WHERE a.title=:title and a.category=:category")
	    //List<Article> fetchArticles(@Param("title") String title, @Param("category") String category);
	    
}
