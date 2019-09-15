package restapi.invoice.invoiceManager.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import restapi.invoice.invoiceManager.domain.Client;
import restapi.invoice.invoiceManager.dto.ClientDTO;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long>, ClientRepositoryCustom {
}
