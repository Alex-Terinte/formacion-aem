package com.mysite.core.models;

import lombok.Getter;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Getter
@Model(adaptables = { Resource.class }, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class CardManualItem {

    @ValueMapValue
    private String imageUrl;

    @ValueMapValue
    private String imageAlt;

    @ValueMapValue
    private String description;

    @ValueMapValue
    private String viewLink;

    @ValueMapValue
    private String editLink;

    @ValueMapValue
    private String readingTime;
}
