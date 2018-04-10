

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Table(name = "domainEvent")
public class DomainEvent {


    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "Name")
    private String name;

    @Column(name = "date")
    private LocalDateTime date;

    @Column(name = "type")
    private String type;

    @Column(name = "status")
    private String status;

    public String getName() {
        return name;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public String getType() {
        return type;
    }

    public String getStatus() { return status;}
}
