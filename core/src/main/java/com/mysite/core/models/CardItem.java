package com.mysite.core.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Getter
@AllArgsConstructor
public class CardItem {

    @ValueMapValue
    private String image;

    @ValueMapValue
    private String description;

    @ValueMapValue
    private Float readingTime;

    @ValueMapValue
    private String readingUnitTime;
}
