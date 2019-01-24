package com.busyunit.embassy.service.resource;

import com.busyunit.embassy.service.controller.EmployeeController;
import com.busyunit.embassy.service.controller.NavigationController;
import com.busyunit.embassy.service.model.Navigation;
import com.busyunit.embassy.service.model.PageCategory;
import lombok.Getter;
import org.springframework.hateoas.ResourceSupport;

import java.util.Collection;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@Getter
public class ArticleResource extends ResourceSupport {

    private final Navigation navigation;
   // private Collection<PageCategory> categories;

    public ArticleResource(Navigation navigation) {
        this.navigation = navigation;
        final Long id = navigation.getId();
        add(linkTo(methodOn(NavigationController.class).get(id)).withSelfRel());
        //add(linkTo(EmployeeController.class).withRel("/api/v1/staff"));
       // add(linkTo(methodOn(NavigationController.;
    }
}
