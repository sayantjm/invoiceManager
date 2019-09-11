package restapi.invoice.invoiceManager.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ConstructionDTO {
    private Long id;
    private String name;
}
