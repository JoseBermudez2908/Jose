package ProjectoLobos.CTL;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import java.sql.Date;
@Entity
@Table(name = "xat")
public class xat {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
private int id=0;
	@Column(name = "sender")

private String sender;
	@Column(name = "idPArtida")
private Partida partida;
	@Lob
	@Column(name = "content")

private String content ;
	@Column(name = "Date")

private Date date;
}
