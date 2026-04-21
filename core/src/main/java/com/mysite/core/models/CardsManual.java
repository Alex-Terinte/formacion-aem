package com.mysite.core.models;

import javax.annotation.Resource;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import lombok.Getter;

import com.mysite.core.resources.ResourceTypes;

@Getter
@Model(
        adaptables = { SlingHttpServletRequest.class, Resource.class },
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,
        resourceType = {ResourceTypes.CARDS}
)
public class CardsManual {
    @ValueMapValue
    private String title;

    @ValueMapValue
    private String description;

    @ValueMapValue
    private String primaryCtaLabel;

    @ValueMapValue
    private String primaryCtaLink;

    @ValueMapValue
    private String secondaryCtaLabel;

    @ValueMapValue
    private String secondaryCtaLink;
}