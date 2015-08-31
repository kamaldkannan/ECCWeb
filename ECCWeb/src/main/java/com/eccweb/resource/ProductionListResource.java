package com.eccweb.resource;
import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductionListResource extends ResourceSupport {
    private List<ProductionResource> productions = new ArrayList<ProductionResource>();

    public List<ProductionResource> getProductions() {
        return productions;
    }

    public void setProductions(List<ProductionResource> productions) {
        this.productions = productions;
    }
}
