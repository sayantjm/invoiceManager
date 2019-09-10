package restapi.invoice.invoiceManager.domain;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Builder
@Entity
@Table(name="CONTRACTOR")
public class Contractor {
    @Id
    Long id;

    String name;
    String dni;
    String address;
    String city;
    Integer codPostal;
    String state;
    String bankAccount;
}
