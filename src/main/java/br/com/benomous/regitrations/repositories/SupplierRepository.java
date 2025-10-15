package br.com.benomous.regitrations.repositories;

import br.com.benomous.common.PaginationResult;
import br.com.benomous.regitrations.domains.Supplier;
import io.quarkus.hibernate.orm.panache.PanacheQuery;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import io.quarkus.panache.common.Page;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

@ApplicationScoped
public class SupplierRepository implements PanacheRepositoryBase<Supplier, UUID> {

    public Supplier findByFullName(String name) {
        return find("fullName", name).firstResult();
    }

    public Supplier findById(Long id) {
        return find("id", id).firstResult();
    }

    public PaginationResult<Supplier> findAllWithPagination(int offset, int limit) {
        PanacheQuery<Supplier> query = find("active", true);

        if(query.list() != null && !query.list().isEmpty()) {
            return new PaginationResult<>(offset,limit, query.pageCount(), query.list());
        }
        throw new NoSuchElementException("Supplier not found");
    }

    @Transactional
    public Supplier save(Supplier supplier) {
        if(isPersistent(supplier))  {
            persist(supplier);
        }
        return supplier;
    }
}
