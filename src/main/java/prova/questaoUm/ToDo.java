package prova.questaoUm;
import javax.persistence.*;
import lombok.*;

@Entity @NoArgsConstructor @Getter @Setter
public class ToDo {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String name;
	private boolean isComplete;
	
}
