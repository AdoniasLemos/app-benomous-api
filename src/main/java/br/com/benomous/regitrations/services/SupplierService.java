package br.com.benomous.regitrations.services;

import br.com.benomous.common.PaginationResult;
import br.com.benomous.regitrations.domains.Supplier;
import br.com.benomous.regitrations.repositories.SupplierRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.jboss.logging.Logger;

import java.util.List;
import java.util.UUID;

@ApplicationScoped
public class SupplierService {
    private static final Logger LOG = Logger.getLogger(SupplierService.class);

    @Inject
    SupplierRepository supplierRepository;


    public PaginationResult<Supplier> findAll(int offset, int limit) {
        return supplierRepository.findAllWithPagination(offset, limit);
    }

    public Supplier findById(UUID id) {
        return supplierRepository.findById(id);
    }

    public Supplier save(Supplier supplier) {
        return supplierRepository.save(supplier);
    }

}
