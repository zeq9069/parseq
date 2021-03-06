
package com.linkedin.restli.examples.greetings.client;

import java.util.Date;
import javax.annotation.Generated;
import com.linkedin.restli.client.RestliRequestOptions;
import com.linkedin.restli.client.base.FindRequestBuilderBase;
import com.linkedin.restli.common.ResourceSpec;
import com.linkedin.restli.examples.greetings.api.Greeting;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Request Builder", date = "Thu Mar 31 14:16:21 PDT 2016")
public class CustomTypesFindByDateRequestBuilder
    extends FindRequestBuilderBase<Long, Greeting, CustomTypesFindByDateRequestBuilder>
{


    public CustomTypesFindByDateRequestBuilder(String baseUriTemplate, ResourceSpec resourceSpec, RestliRequestOptions requestOptions) {
        super(baseUriTemplate, Greeting.class, resourceSpec, requestOptions);
        super.name("date");
    }

    public CustomTypesFindByDateRequestBuilder dParam(Date value) {
        super.setReqParam("d", value, Date.class);
        return this;
    }

}
