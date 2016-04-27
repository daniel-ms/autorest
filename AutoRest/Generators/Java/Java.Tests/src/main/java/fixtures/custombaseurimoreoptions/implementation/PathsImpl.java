/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.custombaseurimoreoptions.implementation;

import retrofit2.Retrofit;
import fixtures.custombaseurimoreoptions.Paths;
import fixtures.custombaseurimoreoptions.AutoRestParameterizedCustomHostTestClient;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import fixtures.custombaseurimoreoptions.models.ErrorException;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;

/**
 * An instance of this class provides access to all the operations defined
 * in Paths.
 */
public final class PathsImpl implements Paths {
    /** The Retrofit service to perform REST calls. */
    private PathsService service;
    /** The service client containing this operation class. */
    private AutoRestParameterizedCustomHostTestClient client;

    /**
     * Initializes an instance of Paths.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public PathsImpl(Retrofit retrofit, AutoRestParameterizedCustomHostTestClient client) {
        this.service = retrofit.create(PathsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Paths to be
     * used by Retrofit to perform actually REST calls.
     */
    interface PathsService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("customuri/{subscriptionId}/{keyName}")
        Call<ResponseBody> getEmpty(@Path("keyName") String keyName, @Path("subscriptionId") String subscriptionId, @Query("keyVersion") String keyVersion);

    }

    /**
     * Get a 200 to test a valid base uri.
     *
     * @param vault The vault name, e.g. https://myvault
     * @param secret Secret value.
     * @param keyName The key name with value 'key1'.
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> getEmpty(String vault, String secret, String keyName) throws ErrorException, IOException, IllegalArgumentException {
        if (vault == null) {
            throw new IllegalArgumentException("Parameter vault is required and cannot be null.");
        }
        if (secret == null) {
            throw new IllegalArgumentException("Parameter secret is required and cannot be null.");
        }
        if (this.client.dnsSuffix() == null) {
            throw new IllegalArgumentException("Parameter this.client.dnsSuffix() is required and cannot be null.");
        }
        if (keyName == null) {
            throw new IllegalArgumentException("Parameter keyName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String keyVersion = null;
        this.client.restClient().setBaseUrl("{vault}", vault, "{secret}", secret, "{dnsSuffix}", this.client.dnsSuffix());
        Call<ResponseBody> call = service.getEmpty(keyName, this.client.subscriptionId(), keyVersion);
        return getEmptyDelegate(call.execute());
    }

    /**
     * Get a 200 to test a valid base uri.
     *
     * @param vault The vault name, e.g. https://myvault
     * @param secret Secret value.
     * @param keyName The key name with value 'key1'.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getEmptyAsync(String vault, String secret, String keyName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (vault == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter vault is required and cannot be null."));
            return null;
        }
        if (secret == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter secret is required and cannot be null."));
            return null;
        }
        if (this.client.dnsSuffix() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.dnsSuffix() is required and cannot be null."));
            return null;
        }
        if (keyName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter keyName is required and cannot be null."));
            return null;
        }
        if (this.client.subscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null."));
            return null;
        }
        final String keyVersion = null;
        this.client.restClient().setBaseUrl("{vault}", vault, "{secret}", secret, "{dnsSuffix}", this.client.dnsSuffix());
        Call<ResponseBody> call = service.getEmpty(keyName, this.client.subscriptionId(), keyVersion);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getEmptyDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    /**
     * Get a 200 to test a valid base uri.
     *
     * @param vault The vault name, e.g. https://myvault
     * @param secret Secret value.
     * @param keyName The key name with value 'key1'.
     * @param keyVersion The key version. Default value 'v1'.
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> getEmpty(String vault, String secret, String keyName, String keyVersion) throws ErrorException, IOException, IllegalArgumentException {
        if (vault == null) {
            throw new IllegalArgumentException("Parameter vault is required and cannot be null.");
        }
        if (secret == null) {
            throw new IllegalArgumentException("Parameter secret is required and cannot be null.");
        }
        if (this.client.dnsSuffix() == null) {
            throw new IllegalArgumentException("Parameter this.client.dnsSuffix() is required and cannot be null.");
        }
        if (keyName == null) {
            throw new IllegalArgumentException("Parameter keyName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        this.client.restClient().setBaseUrl("{vault}", vault, "{secret}", secret, "{dnsSuffix}", this.client.dnsSuffix());
        Call<ResponseBody> call = service.getEmpty(keyName, this.client.subscriptionId(), keyVersion);
        return getEmptyDelegate(call.execute());
    }

    /**
     * Get a 200 to test a valid base uri.
     *
     * @param vault The vault name, e.g. https://myvault
     * @param secret Secret value.
     * @param keyName The key name with value 'key1'.
     * @param keyVersion The key version. Default value 'v1'.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getEmptyAsync(String vault, String secret, String keyName, String keyVersion, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (vault == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter vault is required and cannot be null."));
            return null;
        }
        if (secret == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter secret is required and cannot be null."));
            return null;
        }
        if (this.client.dnsSuffix() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.dnsSuffix() is required and cannot be null."));
            return null;
        }
        if (keyName == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter keyName is required and cannot be null."));
            return null;
        }
        if (this.client.subscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null."));
            return null;
        }
        this.client.restClient().setBaseUrl("{vault}", vault, "{secret}", secret, "{dnsSuffix}", this.client.dnsSuffix());
        Call<ResponseBody> call = service.getEmpty(keyName, this.client.subscriptionId(), keyVersion);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getEmptyDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Void> getEmptyDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new ServiceResponseBuilder<Void, ErrorException>(this.client.restClient().mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

}
