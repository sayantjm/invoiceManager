package restapi.invoice.invoiceManager.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ClientDTO {
    private Long id;
    private String name;
    private String cif;
    private String address;
    private Integer codPostal;
    private String city;
    private String state;
    private String phoneNumber;
    private String mobil;
}
