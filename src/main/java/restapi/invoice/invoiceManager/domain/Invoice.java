package restapi.invoice.invoiceManager.domain;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Date;

@Data
@Builder
@Entity
@Table(name="INVOICE")
public class Invoice {
    @Id
    Long id;

    Date createdDate;
    String invoiceNumber;
    Double percentageIVA;

    @OneToMany(targetEntity = Contractor.class)
    Long contractorId;


}
