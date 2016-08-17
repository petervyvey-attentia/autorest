/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azurespecials.implementation;

import retrofit2.Retrofit;
import fixtures.azurespecials.SkipUrlEncodings;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceResponseBuilder;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import fixtures.azurespecials.models.ErrorException;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in SkipUrlEncodings.
 */
public final class SkipUrlEncodingsImpl implements SkipUrlEncodings {
    /** The Retrofit service to perform REST calls. */
    private SkipUrlEncodingsService service;
    /** The service client containing this operation class. */
    private AutoRestAzureSpecialParametersTestClientImpl client;

    /**
     * Initializes an instance of SkipUrlEncodingsImpl.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public SkipUrlEncodingsImpl(Retrofit retrofit, AutoRestAzureSpecialParametersTestClientImpl client) {
        this.service = retrofit.create(SkipUrlEncodingsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for SkipUrlEncodings to be
     * used by Retrofit to perform actually REST calls.
     */
    interface SkipUrlEncodingsService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("azurespecials/skipUrlEncoding/method/path/valid/{unencodedPathParam}")
        Observable<Response<ResponseBody>> getMethodPathValid(@Path(value = "unencodedPathParam", encoded = true) String unencodedPathParam, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("azurespecials/skipUrlEncoding/path/path/valid/{unencodedPathParam}")
        Observable<Response<ResponseBody>> getPathPathValid(@Path(value = "unencodedPathParam", encoded = true) String unencodedPathParam, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("azurespecials/skipUrlEncoding/swagger/path/valid/{unencodedPathParam}")
        Observable<Response<ResponseBody>> getSwaggerPathValid(@Path(value = "unencodedPathParam", encoded = true) String unencodedPathParam, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("azurespecials/skipUrlEncoding/method/query/valid")
        Observable<Response<ResponseBody>> getMethodQueryValid(@Query(value = "q1", encoded = true) String q1, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("azurespecials/skipUrlEncoding/method/query/null")
        Observable<Response<ResponseBody>> getMethodQueryNull(@Query(value = "q1", encoded = true) String q1, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("azurespecials/skipUrlEncoding/path/query/valid")
        Observable<Response<ResponseBody>> getPathQueryValid(@Query(value = "q1", encoded = true) String q1, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("azurespecials/skipUrlEncoding/swagger/query/valid")
        Observable<Response<ResponseBody>> getSwaggerQueryValid(@Query(value = "q1", encoded = true) String q1, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Get method with unencoded path parameter with value 'path1/path2/path3'.
     *
     * @param unencodedPathParam Unencoded path parameter with value 'path1/path2/path3'
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> getMethodPathValid(String unencodedPathParam) throws ErrorException, IOException, IllegalArgumentException {
        return getMethodPathValidAsync(unencodedPathParam).toBlocking().single();
    }

    /**
     * Get method with unencoded path parameter with value 'path1/path2/path3'.
     *
     * @param unencodedPathParam Unencoded path parameter with value 'path1/path2/path3'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<Void> getMethodPathValidAsync(String unencodedPathParam, final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.create(getMethodPathValidAsync(unencodedPathParam), serviceCallback);
    }

    /**
     * Get method with unencoded path parameter with value 'path1/path2/path3'.
     *
     * @param unencodedPathParam Unencoded path parameter with value 'path1/path2/path3'
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> getMethodPathValidAsync(String unencodedPathParam) {
        if (unencodedPathParam == null) {
            throw new IllegalArgumentException("Parameter unencodedPathParam is required and cannot be null.");
        }
        return service.getMethodPathValid(unencodedPathParam, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = getMethodPathValidDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (ErrorException | IOException exception) {
                        return Observable.error(exception);
                    }
                }
            });
    }

    private ServiceResponse<Void> getMethodPathValidDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Void, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get method with unencoded path parameter with value 'path1/path2/path3'.
     *
     * @param unencodedPathParam Unencoded path parameter with value 'path1/path2/path3'
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> getPathPathValid(String unencodedPathParam) throws ErrorException, IOException, IllegalArgumentException {
        return getPathPathValidAsync(unencodedPathParam).toBlocking().single();
    }

    /**
     * Get method with unencoded path parameter with value 'path1/path2/path3'.
     *
     * @param unencodedPathParam Unencoded path parameter with value 'path1/path2/path3'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<Void> getPathPathValidAsync(String unencodedPathParam, final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.create(getPathPathValidAsync(unencodedPathParam), serviceCallback);
    }

    /**
     * Get method with unencoded path parameter with value 'path1/path2/path3'.
     *
     * @param unencodedPathParam Unencoded path parameter with value 'path1/path2/path3'
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> getPathPathValidAsync(String unencodedPathParam) {
        if (unencodedPathParam == null) {
            throw new IllegalArgumentException("Parameter unencodedPathParam is required and cannot be null.");
        }
        return service.getPathPathValid(unencodedPathParam, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = getPathPathValidDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (ErrorException | IOException exception) {
                        return Observable.error(exception);
                    }
                }
            });
    }

    private ServiceResponse<Void> getPathPathValidDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Void, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get method with unencoded path parameter with value 'path1/path2/path3'.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> getSwaggerPathValid() throws ErrorException, IOException {
        return getSwaggerPathValidAsync().toBlocking().single();
    }

    /**
     * Get method with unencoded path parameter with value 'path1/path2/path3'.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<Void> getSwaggerPathValidAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.create(getSwaggerPathValidAsync(), serviceCallback);
    }

    /**
     * Get method with unencoded path parameter with value 'path1/path2/path3'.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> getSwaggerPathValidAsync() {
        final String unencodedPathParam = "path1/path2/path3";
        return service.getSwaggerPathValid(unencodedPathParam, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = getSwaggerPathValidDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (ErrorException | IOException exception) {
                        return Observable.error(exception);
                    }
                }
            });
    }

    private ServiceResponse<Void> getSwaggerPathValidDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new AzureServiceResponseBuilder<Void, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get method with unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'.
     *
     * @param q1 Unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> getMethodQueryValid(String q1) throws ErrorException, IOException, IllegalArgumentException {
        return getMethodQueryValidAsync(q1).toBlocking().single();
    }

    /**
     * Get method with unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'.
     *
     * @param q1 Unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<Void> getMethodQueryValidAsync(String q1, final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.create(getMethodQueryValidAsync(q1), serviceCallback);
    }

    /**
     * Get method with unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'.
     *
     * @param q1 Unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> getMethodQueryValidAsync(String q1) {
        if (q1 == null) {
            throw new IllegalArgumentException("Parameter q1 is required and cannot be null.");
        }
        return service.getMethodQueryValid(q1, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = getMethodQueryValidDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (ErrorException | IOException exception) {
                        return Observable.error(exception);
                    }
                }
            });
    }

    private ServiceResponse<Void> getMethodQueryValidDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Void, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get method with unencoded query parameter with value null.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> getMethodQueryNull() throws ErrorException, IOException {
        return getMethodQueryNullAsync().toBlocking().single();
    }

    /**
     * Get method with unencoded query parameter with value null.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<Void> getMethodQueryNullAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.create(getMethodQueryNullAsync(), serviceCallback);
    }

    /**
     * Get method with unencoded query parameter with value null.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> getMethodQueryNullAsync() {
        final String q1 = null;
        return service.getMethodQueryNull(q1, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = getMethodQueryNullDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (ErrorException | IOException exception) {
                        return Observable.error(exception);
                    }
                }
            });
    }

    /**
     * Get method with unencoded query parameter with value null.
     *
     * @param q1 Unencoded query parameter with value null
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> getMethodQueryNull(String q1) throws ErrorException, IOException {
        return getMethodQueryNullAsync(q1).toBlocking().single();
    }

    /**
     * Get method with unencoded query parameter with value null.
     *
     * @param q1 Unencoded query parameter with value null
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<Void> getMethodQueryNullAsync(String q1, final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.create(getMethodQueryNullAsync(q1), serviceCallback);
    }

    /**
     * Get method with unencoded query parameter with value null.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> getMethodQueryNullAsync(String q1) {
        return service.getMethodQueryNull(q1, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = getMethodQueryNullDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (ErrorException | IOException exception) {
                        return Observable.error(exception);
                    }
                }
            });
    }

    private ServiceResponse<Void> getMethodQueryNullDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new AzureServiceResponseBuilder<Void, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get method with unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'.
     *
     * @param q1 Unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> getPathQueryValid(String q1) throws ErrorException, IOException, IllegalArgumentException {
        return getPathQueryValidAsync(q1).toBlocking().single();
    }

    /**
     * Get method with unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'.
     *
     * @param q1 Unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<Void> getPathQueryValidAsync(String q1, final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.create(getPathQueryValidAsync(q1), serviceCallback);
    }

    /**
     * Get method with unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'.
     *
     * @param q1 Unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> getPathQueryValidAsync(String q1) {
        if (q1 == null) {
            throw new IllegalArgumentException("Parameter q1 is required and cannot be null.");
        }
        return service.getPathQueryValid(q1, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = getPathQueryValidDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (ErrorException | IOException exception) {
                        return Observable.error(exception);
                    }
                }
            });
    }

    private ServiceResponse<Void> getPathQueryValidDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Void, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Get method with unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the {@link ServiceResponse} object if successful.
     */
    public ServiceResponse<Void> getSwaggerQueryValid() throws ErrorException, IOException {
        return getSwaggerQueryValidAsync().toBlocking().single();
    }

    /**
     * Get method with unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public ServiceCall<Void> getSwaggerQueryValidAsync(final ServiceCallback<Void> serviceCallback) {
        return ServiceCall.create(getSwaggerQueryValidAsync(), serviceCallback);
    }

    /**
     * Get method with unencoded query parameter with value 'value1&amp;q2=value2&amp;q3=value3'.
     *
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> getSwaggerQueryValidAsync() {
        final String q1 = "value1&q2=value2&q3=value3";
        return service.getSwaggerQueryValid(q1, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = getSwaggerQueryValidDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (ErrorException | IOException exception) {
                        return Observable.error(exception);
                    }
                }
            });
    }

    private ServiceResponse<Void> getSwaggerQueryValidDelegate(Response<ResponseBody> response) throws ErrorException, IOException {
        return new AzureServiceResponseBuilder<Void, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

}
