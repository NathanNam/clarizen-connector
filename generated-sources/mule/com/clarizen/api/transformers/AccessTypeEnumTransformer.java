
package com.clarizen.api.transformers;

import javax.annotation.Generated;
import com.clarizen.api.AccessType;
import org.mule.api.transformer.DiscoverableTransformer;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractTransformer;
import org.mule.transformer.types.DataTypeFactory;

@Generated(value = "Mule DevKit Version 3.4.3", date = "2014-08-21T04:41:47-05:00", comments = "Build 3.4.3.1620.30ea288")
public class AccessTypeEnumTransformer
    extends AbstractTransformer
    implements DiscoverableTransformer
{

    private int weighting = DiscoverableTransformer.DEFAULT_PRIORITY_WEIGHTING;

    public AccessTypeEnumTransformer() {
        registerSourceType(DataTypeFactory.create(String.class));
        setReturnClass(AccessType.class);
        setName("AccessTypeEnumTransformer");
    }

    protected Object doTransform(Object src, String encoding)
        throws TransformerException
    {
        AccessType result = null;
        result = Enum.valueOf(AccessType.class, ((String) src));
        return result;
    }

    public int getPriorityWeighting() {
        return weighting;
    }

    public void setPriorityWeighting(int weighting) {
        this.weighting = weighting;
    }

}
