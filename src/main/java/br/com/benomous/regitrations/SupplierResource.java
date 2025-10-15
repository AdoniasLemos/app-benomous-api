package br.com.benomous.regitrations;

import br.com.benomous.regitrations.business.SupplierBusiness;
import br.com.benomous.regitrations.domains.Supplier;
import br.com.benomous.regitrations.services.SupplierService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;

import java.net.URI;
import java.util.UUID;

@Path("/suppliers")
@Produces("application/json")
@Consumes("application/json")
public class SupplierResource {

    @Inject
    SupplierBusiness supplierBusiness;

    @GET
    @Path("/{id}")
    public Response findById(UUID id) {
        return Response.ok(supplierBusiness.findById(id)).build();
    }

    @GET
    public Response findAll(@QueryParam("page") @DefaultValue(value = "1") int page, @QueryParam("size") @DefaultValue(value = "30") int size) {
        return Response.ok(supplierBusiness.findAll(page, size)).build();
    }

    @POST
    public Response create(Supplier supplier) {
         response = supplierBusiness.save(supplier);
        return Response.created(URI.create("/suppliers/"+response.getId())).build();
    }
}