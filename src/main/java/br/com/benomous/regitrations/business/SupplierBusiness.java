package br.com.benomous.regitrations.business;

import br.com.benomous.common.PaginationResult;
import br.com.benomous.regitrations.domains.Supplier;
import br.com.benomous.regitrations.repositories.SupplierRepository;
import br.com.benomous.regitrations.services.SupplierService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;
import java.util.UUID;

@ApplicationScoped
public class SupplierBusiness {

    @Inject
    SupplierService supplierService;

    public Supplier findById(UUID id) {
        return supplierService.findById(id);
    }

    public PaginationResult<Supplier> findAll(int page, int size) {
        return supplierService.findAll(page, size);
    }

    public Supplier save(Supplier supplier) {
        return supplierService.save(supplier);


    }
}
