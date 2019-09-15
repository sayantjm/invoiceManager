package restapi.invoice.invoiceManager.repository;

import restapi.invoice.invoiceManager.dto.ClientDTO;

public interface ClientRepositoryCustom {
    ClientDTO save(ClientDTO clientDTO);
}
