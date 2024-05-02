package com.github.seratch.jslack;

import com.github.seratch.jslack.api.audit.AuditClient;
import com.github.seratch.jslack.api.methods.MethodsClient;
import com.github.seratch.jslack.api.status.v1.LegacyStatusClient;
import com.github.seratch.jslack.api.status.v2.StatusClient;
import com.github.seratch.jslack.common.http.listener.DetailedLoggingListener;
import com.github.seratch.jslack.common.http.listener.HttpResponseListener;
import com.github.seratch.jslack.common.http.listener.ResponsePrettyPrintingListener;

import java.util.ArrayList;
import java.util.List;

public class SlackConfig {

    public static final SlackConfig DEFAULT = new SlackConfig() {

        void throwException() {
            throw new UnsupportedOperationException("This config is immutable");
        }

        @Override
        public void setPrettyResponseLoggingEnabled(boolean prettyResponseLoggingEnabled) {
            throwException();
        }

        @Override
        public void setLibraryMaintainerMode(boolean libraryMaintainerMode) {
            throwException();
        }

        @Override
        public void setTokenExistenceVerificationEnabled(boolean tokenExistenceVerificationEnabled) {
            throwException();
        }

        @Override
        public void setHttpClientResponseHandlers(List<HttpResponseListener> httpClientResponseHandlers) {
            throwException();
        }

        @Override
        public void setAuditEndpointUrlPrefix(String auditEndpointUrlPrefix) {
            throwException();
        }

        @Override
        public void setMethodsEndpointUrlPrefix(String methodsEndpointUrlPrefix) {
            throwException();
        }

        @Override
        public void setStatusEndpointUrlPrefix(String statusEndpointUrlPrefix) {
            throwException();
        }

        @Override
        public void setLegacyStatusEndpointUrlPrefix(String legacyStatusEndpointUrlPrefix) {
            throwException();
        }
    };

    public SlackConfig() {
        getHttpClientResponseHandlers().add(new DetailedLoggingListener());
        getHttpClientResponseHandlers().add(new ResponsePrettyPrintingListener());
    }

    private boolean prettyResponseLoggingEnabled = false;

    /**
     * Don't enable this flag in production. This flag enables some validation features for development.
     */
    private boolean libraryMaintainerMode = false;

    /**
     * Slack Web API client verifies the existence of tokens before sending HTTP requests to Slack servers.
     */
    private boolean tokenExistenceVerificationEnabled = false;

    private List<HttpResponseListener> httpClientResponseHandlers = new ArrayList<>();

    private String auditEndpointUrlPrefix = AuditClient.ENDPOINT_URL_PREFIX;

    private String methodsEndpointUrlPrefix = MethodsClient.ENDPOINT_URL_PREFIX;

    private String statusEndpointUrlPrefix = StatusClient.ENDPOINT_URL_PREFIX;

    private String legacyStatusEndpointUrlPrefix = LegacyStatusClient.ENDPOINT_URL_PREFIX;

    public boolean isPrettyResponseLoggingEnabled() {
        return this.prettyResponseLoggingEnabled;
    }

    public boolean isLibraryMaintainerMode() {
        return this.libraryMaintainerMode;
    }

    public boolean isTokenExistenceVerificationEnabled() {
        return this.tokenExistenceVerificationEnabled;
    }

    public List<HttpResponseListener> getHttpClientResponseHandlers() {
        return this.httpClientResponseHandlers;
    }

    public String getAuditEndpointUrlPrefix() {
        return this.auditEndpointUrlPrefix;
    }

    public String getMethodsEndpointUrlPrefix() {
        return this.methodsEndpointUrlPrefix;
    }

    public String getStatusEndpointUrlPrefix() {
        return this.statusEndpointUrlPrefix;
    }

    public String getLegacyStatusEndpointUrlPrefix() {
        return this.legacyStatusEndpointUrlPrefix;
    }

    public void setPrettyResponseLoggingEnabled(boolean prettyResponseLoggingEnabled) {
        this.prettyResponseLoggingEnabled = prettyResponseLoggingEnabled;
    }

    public void setLibraryMaintainerMode(boolean libraryMaintainerMode) {
        this.libraryMaintainerMode = libraryMaintainerMode;
    }

    public void setTokenExistenceVerificationEnabled(boolean tokenExistenceVerificationEnabled) {
        this.tokenExistenceVerificationEnabled = tokenExistenceVerificationEnabled;
    }

    public void setHttpClientResponseHandlers(List<HttpResponseListener> httpClientResponseHandlers) {
        this.httpClientResponseHandlers = httpClientResponseHandlers;
    }

    public void setAuditEndpointUrlPrefix(String auditEndpointUrlPrefix) {
        this.auditEndpointUrlPrefix = auditEndpointUrlPrefix;
    }

    public void setMethodsEndpointUrlPrefix(String methodsEndpointUrlPrefix) {
        this.methodsEndpointUrlPrefix = methodsEndpointUrlPrefix;
    }

    public void setStatusEndpointUrlPrefix(String statusEndpointUrlPrefix) {
        this.statusEndpointUrlPrefix = statusEndpointUrlPrefix;
    }

    public void setLegacyStatusEndpointUrlPrefix(String legacyStatusEndpointUrlPrefix) {
        this.legacyStatusEndpointUrlPrefix = legacyStatusEndpointUrlPrefix;
    }
}