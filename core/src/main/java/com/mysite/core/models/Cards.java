package com.mysite.core.models;

import com.adobe.cq.dam.cfm.ContentFragment;
import com.adobe.cq.export.json.ExporterConstants;
import com.mysite.core.resources.ResourceTypes;
import com.mysite.core.util.Utils;
import lombok.Getter;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

import static com.mysite.core.resources.ResourceConstants.*;

@Model(
    adaptables   = Resource.class,
    resourceType = ResourceTypes.CARDS,
    defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
@Exporter(
    name       = ExporterConstants.SLING_MODEL_EXPORTER_NAME,
    extensions = ExporterConstants.SLING_MODEL_EXTENSION
)
public class Cards {

    @SlingObject
    private ResourceResolver resourceResolver;

    @ChildResource(name = "cfCards")
    private List<Resource> cfCards;

    @Getter
    private List<CardItem> cards = new ArrayList<>();

    @PostConstruct
    protected void init() {
        if (cfCards != null && !cfCards.isEmpty()) {
            for (Resource path : cfCards) {
                String cfPath = path.getValueMap().get("cfPath", String.class);
                if (cfPath != null) {
                    Resource cfResource = resourceResolver.getResource(cfPath);
                    if (cfResource != null) {
                        ContentFragment cf = cfResource.adaptTo(ContentFragment.class);
                        if (cf != null) {
                            String title = Utils.getCfElementContentString(cf, BLOG_TITLE);
                            String description = Utils.getCfElementContentString(cf, BLOG_DESCRIPTION);
                            String unit = Utils.getCfElementContentString(cf, BLOG_UNIT);
                            String duration = Utils.getCfElementContentString(cf, BLOG_DURATION);

                            String imagePath = Utils.getCfElementContentString(cf, BLOG_IMAGE);

                            cards.add(new CardItem(imagePath, description, Float.parseFloat(duration), unit));
                        }
                    }
                }
            }
        }
    }
}