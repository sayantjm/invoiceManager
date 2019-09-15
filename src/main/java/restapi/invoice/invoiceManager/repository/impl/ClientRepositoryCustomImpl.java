package restapi.invoice.invoiceManager.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import restapi.invoice.invoiceManager.domain.Client;
import restapi.invoice.invoiceManager.dto.ClientDTO;
import restapi.invoice.invoiceManager.repository.ClientRepository;
import restapi.invoice.invoiceManager.repository.ClientRepositoryCustom;

import javax.persistence.EntityManager;

@Repository
public class ClientRepositoryCustomImpl implements ClientRepositoryCustom {

    @Autowired
    private EntityManager entityManager;

    @Override
    public ClientDTO save(ClientDTO clientDTO) {
        Client client = new Client();
        client.fromDto(clientDTO);
        entityManager.persist(client);
        return client.toDto();
    }
}
