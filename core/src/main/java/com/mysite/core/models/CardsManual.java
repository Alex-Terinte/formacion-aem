package com.mysite.core.models;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import lombok.Getter;

import com.mysite.core.resources.ResourceTypes;

import java.util.List;

@Getter
@Model(
        adaptables = { SlingHttpServletRequest.class, Resource.class },
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        resourceType = {ResourceTypes.CARDS}
)
public class CardsManual {
    @ChildResource(name = "cards")
    private List<CardManualItem> cards;

    @PostConstruct
    protected void init(){
        System.out.println("CardsManual init");
    }
}