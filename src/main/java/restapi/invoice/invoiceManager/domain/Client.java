package restapi.invoice.invoiceManager.domain;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Data
@Builder
@Entity
@Table(name="CLIENT")
public class Client {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long id;

    String name;
    String cif;
    String address;
    Integer codPostal;
    String city;
    String state;
    String phoneNumber;
    String mobil;
}
