/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodystring.implementation;

import fixtures.bodystring.AutoRestSwaggerBATService;
import fixtures.bodystring.Strings;
import fixtures.bodystring.Enums;
import com.microsoft.rest.ServiceClient;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the AutoRestSwaggerBATService class.
 */
public final class AutoRestSwaggerBATServiceImpl extends ServiceClient implements AutoRestSwaggerBATService {

    /**
     * Gets the Strings object to access its operations.
     * @return the Strings object.
     */
    public Strings strings() {
        return new StringsImpl(restClient().retrofit(), this);
    }

    /**
     * Gets the Enums object to access its operations.
     * @return the Enums object.
     */
    public Enums enums() {
        return new EnumsImpl(restClient().retrofit(), this);
    }

    /**
     * Initializes an instance of AutoRestSwaggerBATService client.
     */
    public AutoRestSwaggerBATServiceImpl() {
        this("http://localhost");
    }

    /**
     * Initializes an instance of AutoRestSwaggerBATService client.
     *
     * @param baseUrl the base URL of the host
     */
    public AutoRestSwaggerBATServiceImpl(String baseUrl) {
        super(baseUrl);
    }

    /**
     * Initializes an instance of AutoRestSwaggerBATService client.
     *
     * @param restClient the pre-configured {@link RestClient} object
     */
    public AutoRestSwaggerBATServiceImpl(RestClient restClient) {
        super(restClient);
    }
}
