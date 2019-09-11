package restapi.invoice.invoiceManager.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ContractorDTO {
    private Long id;
    private String name;
    private String dni;
    private String address;
    private String city;
    private Integer codPostal;
    private String state;
    private String bankAccount;
}
