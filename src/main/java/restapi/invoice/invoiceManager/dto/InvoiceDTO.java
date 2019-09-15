package restapi.invoice.invoiceManager.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import restapi.invoice.invoiceManager.domain.InvoiceDetail;

import java.util.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InvoiceDTO {
    private Long id;

    private Date createdDate;

    private String invoiceNumber;

    private Double percentageIVA;

    private ClientDTO client;

    private ContractorDTO contractor;

    private Set<InvoiceDetailDTO> details = new HashSet<>();
}
