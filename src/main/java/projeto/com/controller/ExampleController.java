package projeto.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import projeto.com.model.Example;
import projeto.com.repository.ExampleRepository;

@RestController
//@RequestMapping("/example")
public class ExampleController {
	
	@Autowired
	private ExampleRepository exampleRepository;
	
	@RequestMapping("/")
	public String getExample(){
		return "Bem vindo";
	}
	
	@RequestMapping("/find/{id}")
	public ResponseEntity<Example> getExampleById(@PathVariable("id") Long id){
		Example ex = exampleRepository.findOne(id);
		return new ResponseEntity<Example>(ex, HttpStatus.OK);
	}
	
	@RequestMapping("/save")
	public ResponseEntity<Void> saveExample(@RequestBody Example ex, UriComponentsBuilder builder) {
		exampleRepository.save(ex);
		
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED); 
	}
	
	//Article savedArticle = articleRepository.save(article); 
	
	//Article obj = articleRepository.findById(articleId).get();
	//Iterable<Article> articles = articleRepository.findAll();
	
	//articleRepository.delete(article); 
}
