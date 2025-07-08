package uade.edu.ar.Cocinapp.DTO;
import lombok.Getter;
import lombok.Setter;
import uade.edu.ar.Cocinapp.Entidades.Rol;
import lombok.AllArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
public class PerfilDTO {

	public PerfilDTO() {
		// TODO Auto-generated constructor stub
	}
	private String nombre;
    private String biografia;
	private String alias;
	private String avatar;
	private Rol rol;
     
	
}
