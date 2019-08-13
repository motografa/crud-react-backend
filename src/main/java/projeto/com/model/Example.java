package projeto.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="example")
public class Example {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_example")
	private Long idExample;
	
	@Column(name="name_example")
	private String nameExample;
	
}
