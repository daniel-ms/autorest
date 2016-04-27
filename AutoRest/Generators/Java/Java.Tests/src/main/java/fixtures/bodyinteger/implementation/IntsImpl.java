/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.bodyinteger.implementation;

import retrofit2.Retrofit;
import fixtures.bodyinteger.Ints;
import fixtures.bodyinteger.AutoRestIntegerTestService;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import fixtures.bodyinteger.models.ErrorException;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.PUT;
import retrofit2.Response;

/**
 * An instance of this class provides access to all the operations defined
 * in Ints.
 */
public final class IntsImpl implements Ints {
    /** The Retrofit service to perform REST calls. */
    private IntsService service;
    /** The service client containing this operation class. */
    private AutoRestIntegerTestService client;

    /**
     * Initializes an instance of Ints.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public IntsImpl(Retrofit retrofit, AutoRestIntegerTestService client) {
        this.service = retrofit.create(IntsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Ints to be
     * used by Retrofit to perform actually REST calls.
     */
    interface IntsService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("int/null")
        Call<ResponseBody> getNull();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("int/invalid")
        Call<ResponseBody> getInvalid();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("int/overflowint32")
        Call<ResponseBody> getOverflowInt32();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("int/underflowint32")
        Call<ResponseBody> getUnderflowInt32();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("int/overflowint64")
        Call<ResponseBody> getOverflowInt64();

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("int/underflowint64")
        Call<ResponseBody> getUnderflowInt64();

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("int/max/32")
        Call<ResponseBody> putMax32(@Body int intBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("int/max/64")
        Call<ResponseBody> putMax64(@Body long intBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("int/min/32")
        Call<ResponseBody> putMin32(@Body int intBody);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("int/min/64")
        Call<ResponseBody> putMin64(@Body long intBody);

    }

    /**
     * Get null Int value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the int object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Integer> getNull() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getNull();
        return getNullDelegate(call.execute());
    }

    /**
     * Get null Int value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getNullAsync(final ServiceCallback<Integer> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        Call<ResponseBody> call = service.getNull();
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Integer>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getNullDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Integer> getNullDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Integer, ErrorException>(this.client.restClient().mapperAdapter())
                .register(200, new TypeToken<Integer>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get invalid Int value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the int object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Integer> getInvalid() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getInvalid();
        return getInvalidDelegate(call.execute());
    }

    /**
     * Get invalid Int value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getInvalidAsync(final ServiceCallback<Integer> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        Call<ResponseBody> call = service.getInvalid();
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Integer>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getInvalidDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Integer> getInvalidDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Integer, ErrorException>(this.client.restClient().mapperAdapter())
                .register(200, new TypeToken<Integer>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get overflow Int32 value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the int object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Integer> getOverflowInt32() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getOverflowInt32();
        return getOverflowInt32Delegate(call.execute());
    }

    /**
     * Get overflow Int32 value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getOverflowInt32Async(final ServiceCallback<Integer> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        Call<ResponseBody> call = service.getOverflowInt32();
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Integer>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getOverflowInt32Delegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Integer> getOverflowInt32Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Integer, ErrorException>(this.client.restClient().mapperAdapter())
                .register(200, new TypeToken<Integer>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get underflow Int32 value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the int object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Integer> getUnderflowInt32() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getUnderflowInt32();
        return getUnderflowInt32Delegate(call.execute());
    }

    /**
     * Get underflow Int32 value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getUnderflowInt32Async(final ServiceCallback<Integer> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        Call<ResponseBody> call = service.getUnderflowInt32();
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Integer>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getUnderflowInt32Delegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Integer> getUnderflowInt32Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Integer, ErrorException>(this.client.restClient().mapperAdapter())
                .register(200, new TypeToken<Integer>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get overflow Int64 value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the long object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Long> getOverflowInt64() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getOverflowInt64();
        return getOverflowInt64Delegate(call.execute());
    }

    /**
     * Get overflow Int64 value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getOverflowInt64Async(final ServiceCallback<Long> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        Call<ResponseBody> call = service.getOverflowInt64();
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Long>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getOverflowInt64Delegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Long> getOverflowInt64Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Long, ErrorException>(this.client.restClient().mapperAdapter())
                .register(200, new TypeToken<Long>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get underflow Int64 value.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the long object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Long> getUnderflowInt64() throws ErrorException, IOException {
        Call<ResponseBody> call = service.getUnderflowInt64();
        return getUnderflowInt64Delegate(call.execute());
    }

    /**
     * Get underflow Int64 value.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall getUnderflowInt64Async(final ServiceCallback<Long> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        Call<ResponseBody> call = service.getUnderflowInt64();
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Long>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(getUnderflowInt64Delegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Long> getUnderflowInt64Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Long, ErrorException>(this.client.restClient().mapperAdapter())
                .register(200, new TypeToken<Long>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put max int32 value.
     *
     * @param intBody the int value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> putMax32(int intBody) throws ErrorException, IOException {
        Call<ResponseBody> call = service.putMax32(intBody);
        return putMax32Delegate(call.execute());
    }

    /**
     * Put max int32 value.
     *
     * @param intBody the int value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall putMax32Async(int intBody, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        Call<ResponseBody> call = service.putMax32(intBody);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(putMax32Delegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Void> putMax32Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>(this.client.restClient().mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put max int64 value.
     *
     * @param intBody the long value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> putMax64(long intBody) throws ErrorException, IOException {
        Call<ResponseBody> call = service.putMax64(intBody);
        return putMax64Delegate(call.execute());
    }

    /**
     * Put max int64 value.
     *
     * @param intBody the long value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall putMax64Async(long intBody, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        Call<ResponseBody> call = service.putMax64(intBody);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(putMax64Delegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Void> putMax64Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>(this.client.restClient().mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put min int32 value.
     *
     * @param intBody the int value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> putMin32(int intBody) throws ErrorException, IOException {
        Call<ResponseBody> call = service.putMin32(intBody);
        return putMin32Delegate(call.execute());
    }

    /**
     * Put min int32 value.
     *
     * @param intBody the int value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall putMin32Async(int intBody, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        Call<ResponseBody> call = service.putMin32(intBody);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(putMin32Delegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Void> putMin32Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>(this.client.restClient().mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Put min int64 value.
     *
     * @param intBody the long value
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> putMin64(long intBody) throws ErrorException, IOException {
        Call<ResponseBody> call = service.putMin64(intBody);
        return putMin64Delegate(call.execute());
    }

    /**
     * Put min int64 value.
     *
     * @param intBody the long value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall putMin64Async(long intBody, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        Call<ResponseBody> call = service.putMin64(intBody);
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(putMin64Delegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponse<Void> putMin64Delegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new ServiceResponseBuilder<Void, ErrorException>(this.client.restClient().mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

}
