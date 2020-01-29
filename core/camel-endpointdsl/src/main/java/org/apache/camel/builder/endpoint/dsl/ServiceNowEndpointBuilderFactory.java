/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * The servicenow component is used to integrate Camel with ServiceNow cloud
 * services.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface ServiceNowEndpointBuilderFactory {


    /**
     * Builder for endpoint for the ServiceNow component.
     */
    public interface ServiceNowEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedServiceNowEndpointBuilder advanced() {
            return (AdvancedServiceNowEndpointBuilder) this;
        }
        /**
         * Set this parameter to true to return only scorecards where the
         * indicator Display field is selected. Set this parameter to all to
         * return scorecards with any Display field value. This parameter is
         * true by default.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: true
         * Group: producer
         */
        default ServiceNowEndpointBuilder display(String display) {
            doSetProperty("display", display);
            return this;
        }
        /**
         * Return the display value (true), actual value (false), or both (all)
         * for reference fields (default: false).
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default ServiceNowEndpointBuilder displayValue(String displayValue) {
            doSetProperty("displayValue", displayValue);
            return this;
        }
        /**
         * True to exclude Table API links for reference fields (default:
         * false).
         * 
         * The option is a: <code>java.lang.Boolean</code> type.
         * 
         * Default:
         * Group: producer
         */
        default ServiceNowEndpointBuilder excludeReferenceLink(
                Boolean excludeReferenceLink) {
            doSetProperty("excludeReferenceLink", excludeReferenceLink);
            return this;
        }
        /**
         * True to exclude Table API links for reference fields (default:
         * false).
         * 
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * 
         * Default:
         * Group: producer
         */
        default ServiceNowEndpointBuilder excludeReferenceLink(
                String excludeReferenceLink) {
            doSetProperty("excludeReferenceLink", excludeReferenceLink);
            return this;
        }
        /**
         * Set this parameter to true to return only scorecards that are
         * favorites of the querying user.
         * 
         * The option is a: <code>java.lang.Boolean</code> type.
         * 
         * Default:
         * Group: producer
         */
        default ServiceNowEndpointBuilder favorites(Boolean favorites) {
            doSetProperty("favorites", favorites);
            return this;
        }
        /**
         * Set this parameter to true to return only scorecards that are
         * favorites of the querying user.
         * 
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * 
         * Default:
         * Group: producer
         */
        default ServiceNowEndpointBuilder favorites(String favorites) {
            doSetProperty("favorites", favorites);
            return this;
        }
        /**
         * Set this parameter to true to always return all available aggregates
         * for an indicator, including when an aggregate has already been
         * applied. If a value is not specified, this parameter defaults to
         * false and returns no aggregates.
         * 
         * The option is a: <code>java.lang.Boolean</code> type.
         * 
         * Default:
         * Group: producer
         */
        default ServiceNowEndpointBuilder includeAggregates(
                Boolean includeAggregates) {
            doSetProperty("includeAggregates", includeAggregates);
            return this;
        }
        /**
         * Set this parameter to true to always return all available aggregates
         * for an indicator, including when an aggregate has already been
         * applied. If a value is not specified, this parameter defaults to
         * false and returns no aggregates.
         * 
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * 
         * Default:
         * Group: producer
         */
        default ServiceNowEndpointBuilder includeAggregates(
                String includeAggregates) {
            doSetProperty("includeAggregates", includeAggregates);
            return this;
        }
        /**
         * Set this parameter to true to return all available aggregates for an
         * indicator when no aggregate has been applied. If a value is not
         * specified, this parameter defaults to false and returns no
         * aggregates.
         * 
         * The option is a: <code>java.lang.Boolean</code> type.
         * 
         * Default:
         * Group: producer
         */
        default ServiceNowEndpointBuilder includeAvailableAggregates(
                Boolean includeAvailableAggregates) {
            doSetProperty("includeAvailableAggregates", includeAvailableAggregates);
            return this;
        }
        /**
         * Set this parameter to true to return all available aggregates for an
         * indicator when no aggregate has been applied. If a value is not
         * specified, this parameter defaults to false and returns no
         * aggregates.
         * 
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * 
         * Default:
         * Group: producer
         */
        default ServiceNowEndpointBuilder includeAvailableAggregates(
                String includeAvailableAggregates) {
            doSetProperty("includeAvailableAggregates", includeAvailableAggregates);
            return this;
        }
        /**
         * Set this parameter to true to return all available breakdowns for an
         * indicator. If a value is not specified, this parameter defaults to
         * false and returns no breakdowns.
         * 
         * The option is a: <code>java.lang.Boolean</code> type.
         * 
         * Default:
         * Group: producer
         */
        default ServiceNowEndpointBuilder includeAvailableBreakdowns(
                Boolean includeAvailableBreakdowns) {
            doSetProperty("includeAvailableBreakdowns", includeAvailableBreakdowns);
            return this;
        }
        /**
         * Set this parameter to true to return all available breakdowns for an
         * indicator. If a value is not specified, this parameter defaults to
         * false and returns no breakdowns.
         * 
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * 
         * Default:
         * Group: producer
         */
        default ServiceNowEndpointBuilder includeAvailableBreakdowns(
                String includeAvailableBreakdowns) {
            doSetProperty("includeAvailableBreakdowns", includeAvailableBreakdowns);
            return this;
        }
        /**
         * Set this parameter to true to return all notes associated with the
         * score. The note element contains the note text as well as the author
         * and timestamp when the note was added.
         * 
         * The option is a: <code>java.lang.Boolean</code> type.
         * 
         * Default:
         * Group: producer
         */
        default ServiceNowEndpointBuilder includeScoreNotes(
                Boolean includeScoreNotes) {
            doSetProperty("includeScoreNotes", includeScoreNotes);
            return this;
        }
        /**
         * Set this parameter to true to return all notes associated with the
         * score. The note element contains the note text as well as the author
         * and timestamp when the note was added.
         * 
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * 
         * Default:
         * Group: producer
         */
        default ServiceNowEndpointBuilder includeScoreNotes(
                String includeScoreNotes) {
            doSetProperty("includeScoreNotes", includeScoreNotes);
            return this;
        }
        /**
         * Set this parameter to true to return all scores for a scorecard. If a
         * value is not specified, this parameter defaults to false and returns
         * only the most recent score value.
         * 
         * The option is a: <code>java.lang.Boolean</code> type.
         * 
         * Default:
         * Group: producer
         */
        default ServiceNowEndpointBuilder includeScores(Boolean includeScores) {
            doSetProperty("includeScores", includeScores);
            return this;
        }
        /**
         * Set this parameter to true to return all scores for a scorecard. If a
         * value is not specified, this parameter defaults to false and returns
         * only the most recent score value.
         * 
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * 
         * Default:
         * Group: producer
         */
        default ServiceNowEndpointBuilder includeScores(String includeScores) {
            doSetProperty("includeScores", includeScores);
            return this;
        }
        /**
         * True to set raw value of input fields (default: false).
         * 
         * The option is a: <code>java.lang.Boolean</code> type.
         * 
         * Default:
         * Group: producer
         */
        default ServiceNowEndpointBuilder inputDisplayValue(
                Boolean inputDisplayValue) {
            doSetProperty("inputDisplayValue", inputDisplayValue);
            return this;
        }
        /**
         * True to set raw value of input fields (default: false).
         * 
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * 
         * Default:
         * Group: producer
         */
        default ServiceNowEndpointBuilder inputDisplayValue(
                String inputDisplayValue) {
            doSetProperty("inputDisplayValue", inputDisplayValue);
            return this;
        }
        /**
         * Set this parameter to true to return only scorecards for key
         * indicators.
         * 
         * The option is a: <code>java.lang.Boolean</code> type.
         * 
         * Default:
         * Group: producer
         */
        default ServiceNowEndpointBuilder key(Boolean key) {
            doSetProperty("key", key);
            return this;
        }
        /**
         * Set this parameter to true to return only scorecards for key
         * indicators.
         * 
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * 
         * Default:
         * Group: producer
         */
        default ServiceNowEndpointBuilder key(String key) {
            doSetProperty("key", key);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default ServiceNowEndpointBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default ServiceNowEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Defines both request and response models.
         * 
         * The option is a: <code>java.util.Map&lt;java.lang.String,
         * java.lang.Class&lt;java.lang.Object&gt;&gt;</code> type.
         * 
         * Default:
         * Group: producer
         */
        default ServiceNowEndpointBuilder models(
                Map<String, Class<Object>> models) {
            doSetProperty("models", models);
            return this;
        }
        /**
         * Defines both request and response models.
         * 
         * The option will be converted to a
         * <code>java.util.Map&lt;java.lang.String,
         * java.lang.Class&lt;java.lang.Object&gt;&gt;</code> type.
         * 
         * Default:
         * Group: producer
         */
        default ServiceNowEndpointBuilder models(String models) {
            doSetProperty("models", models);
            return this;
        }
        /**
         * Enter the maximum number of scorecards each query can return. By
         * default this value is 10, and the maximum is 100.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Default: 10
         * Group: producer
         */
        default ServiceNowEndpointBuilder perPage(Integer perPage) {
            doSetProperty("perPage", perPage);
            return this;
        }
        /**
         * Enter the maximum number of scorecards each query can return. By
         * default this value is 10, and the maximum is 100.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Default: 10
         * Group: producer
         */
        default ServiceNowEndpointBuilder perPage(String perPage) {
            doSetProperty("perPage", perPage);
            return this;
        }
        /**
         * The ServiceNow release to target, default to Helsinki See
         * https://docs.servicenow.com.
         * 
         * The option is a:
         * <code>org.apache.camel.component.servicenow.ServiceNowRelease</code>
         * type.
         * 
         * Default: HELSINKI
         * Group: producer
         */
        default ServiceNowEndpointBuilder release(ServiceNowRelease release) {
            doSetProperty("release", release);
            return this;
        }
        /**
         * The ServiceNow release to target, default to Helsinki See
         * https://docs.servicenow.com.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.servicenow.ServiceNowRelease</code>
         * type.
         * 
         * Default: HELSINKI
         * Group: producer
         */
        default ServiceNowEndpointBuilder release(String release) {
            doSetProperty("release", release);
            return this;
        }
        /**
         * Defines the request model.
         * 
         * The option is a: <code>java.util.Map&lt;java.lang.String,
         * java.lang.Class&lt;java.lang.Object&gt;&gt;</code> type.
         * 
         * Default:
         * Group: producer
         */
        default ServiceNowEndpointBuilder requestModels(
                Map<String, Class<Object>> requestModels) {
            doSetProperty("requestModels", requestModels);
            return this;
        }
        /**
         * Defines the request model.
         * 
         * The option will be converted to a
         * <code>java.util.Map&lt;java.lang.String,
         * java.lang.Class&lt;java.lang.Object&gt;&gt;</code> type.
         * 
         * Default:
         * Group: producer
         */
        default ServiceNowEndpointBuilder requestModels(String requestModels) {
            doSetProperty("requestModels", requestModels);
            return this;
        }
        /**
         * The default resource, can be overridden by header
         * CamelServiceNowResource.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default:
         * Group: producer
         */
        default ServiceNowEndpointBuilder resource(String resource) {
            doSetProperty("resource", resource);
            return this;
        }
        /**
         * Defines the response model.
         * 
         * The option is a: <code>java.util.Map&lt;java.lang.String,
         * java.lang.Class&lt;java.lang.Object&gt;&gt;</code> type.
         * 
         * Default:
         * Group: producer
         */
        default ServiceNowEndpointBuilder responseModels(
                Map<String, Class<Object>> responseModels) {
            doSetProperty("responseModels", responseModels);
            return this;
        }
        /**
         * Defines the response model.
         * 
         * The option will be converted to a
         * <code>java.util.Map&lt;java.lang.String,
         * java.lang.Class&lt;java.lang.Object&gt;&gt;</code> type.
         * 
         * Default:
         * Group: producer
         */
        default ServiceNowEndpointBuilder responseModels(String responseModels) {
            doSetProperty("responseModels", responseModels);
            return this;
        }
        /**
         * Specify the value to use when sorting results. By default, queries
         * sort records by value.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default:
         * Group: producer
         */
        default ServiceNowEndpointBuilder sortBy(String sortBy) {
            doSetProperty("sortBy", sortBy);
            return this;
        }
        /**
         * Specify the sort direction, ascending or descending. By default,
         * queries sort records in descending order. Use sysparm_sortdir=asc to
         * sort in ascending order.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default:
         * Group: producer
         */
        default ServiceNowEndpointBuilder sortDir(String sortDir) {
            doSetProperty("sortDir", sortDir);
            return this;
        }
        /**
         * True to suppress auto generation of system fields (default: false).
         * 
         * The option is a: <code>java.lang.Boolean</code> type.
         * 
         * Default:
         * Group: producer
         */
        default ServiceNowEndpointBuilder suppressAutoSysField(
                Boolean suppressAutoSysField) {
            doSetProperty("suppressAutoSysField", suppressAutoSysField);
            return this;
        }
        /**
         * True to suppress auto generation of system fields (default: false).
         * 
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * 
         * Default:
         * Group: producer
         */
        default ServiceNowEndpointBuilder suppressAutoSysField(
                String suppressAutoSysField) {
            doSetProperty("suppressAutoSysField", suppressAutoSysField);
            return this;
        }
        /**
         * Set this value to true to remove the Link header from the response.
         * The Link header allows you to request additional pages of data when
         * the number of records matching your query exceeds the query limit.
         * 
         * The option is a: <code>java.lang.Boolean</code> type.
         * 
         * Default:
         * Group: producer
         */
        default ServiceNowEndpointBuilder suppressPaginationHeader(
                Boolean suppressPaginationHeader) {
            doSetProperty("suppressPaginationHeader", suppressPaginationHeader);
            return this;
        }
        /**
         * Set this value to true to remove the Link header from the response.
         * The Link header allows you to request additional pages of data when
         * the number of records matching your query exceeds the query limit.
         * 
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * 
         * Default:
         * Group: producer
         */
        default ServiceNowEndpointBuilder suppressPaginationHeader(
                String suppressPaginationHeader) {
            doSetProperty("suppressPaginationHeader", suppressPaginationHeader);
            return this;
        }
        /**
         * The default table, can be overridden by header CamelServiceNowTable.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default:
         * Group: producer
         */
        default ServiceNowEndpointBuilder table(String table) {
            doSetProperty("table", table);
            return this;
        }
        /**
         * Set this parameter to true to return only scorecards that have a
         * target.
         * 
         * The option is a: <code>java.lang.Boolean</code> type.
         * 
         * Default:
         * Group: producer
         */
        default ServiceNowEndpointBuilder target(Boolean target) {
            doSetProperty("target", target);
            return this;
        }
        /**
         * Set this parameter to true to return only scorecards that have a
         * target.
         * 
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * 
         * Default:
         * Group: producer
         */
        default ServiceNowEndpointBuilder target(String target) {
            doSetProperty("target", target);
            return this;
        }
        /**
         * Gets only those categories whose parent is a catalog.
         * 
         * The option is a: <code>java.lang.Boolean</code> type.
         * 
         * Default:
         * Group: producer
         */
        default ServiceNowEndpointBuilder topLevelOnly(Boolean topLevelOnly) {
            doSetProperty("topLevelOnly", topLevelOnly);
            return this;
        }
        /**
         * Gets only those categories whose parent is a catalog.
         * 
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * 
         * Default:
         * Group: producer
         */
        default ServiceNowEndpointBuilder topLevelOnly(String topLevelOnly) {
            doSetProperty("topLevelOnly", topLevelOnly);
            return this;
        }
        /**
         * The proxy host name.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default:
         * Group: proxy
         */
        default ServiceNowEndpointBuilder proxyHost(String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * The proxy port number.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Default:
         * Group: proxy
         */
        default ServiceNowEndpointBuilder proxyPort(Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * The proxy port number.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Default:
         * Group: proxy
         */
        default ServiceNowEndpointBuilder proxyPort(String proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * The ServiceNow REST API url.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default:
         * Group: security
         */
        default ServiceNowEndpointBuilder apiUrl(String apiUrl) {
            doSetProperty("apiUrl", apiUrl);
            return this;
        }
        /**
         * OAuth2 ClientID.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default:
         * Group: security
         */
        default ServiceNowEndpointBuilder oauthClientId(String oauthClientId) {
            doSetProperty("oauthClientId", oauthClientId);
            return this;
        }
        /**
         * OAuth2 ClientSecret.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default:
         * Group: security
         */
        default ServiceNowEndpointBuilder oauthClientSecret(
                String oauthClientSecret) {
            doSetProperty("oauthClientSecret", oauthClientSecret);
            return this;
        }
        /**
         * OAuth token Url.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default:
         * Group: security
         */
        default ServiceNowEndpointBuilder oauthTokenUrl(String oauthTokenUrl) {
            doSetProperty("oauthTokenUrl", oauthTokenUrl);
            return this;
        }
        /**
         * ServiceNow account password, MUST be provided.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Default:
         * Group: security
         */
        default ServiceNowEndpointBuilder password(String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * Password for proxy authentication.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default:
         * Group: security
         */
        default ServiceNowEndpointBuilder proxyPassword(String proxyPassword) {
            doSetProperty("proxyPassword", proxyPassword);
            return this;
        }
        /**
         * Username for proxy authentication.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default:
         * Group: security
         */
        default ServiceNowEndpointBuilder proxyUserName(String proxyUserName) {
            doSetProperty("proxyUserName", proxyUserName);
            return this;
        }
        /**
         * To configure security using SSLContextParameters. See
         * http://camel.apache.org/camel-configuration-utilities.html.
         * 
         * The option is a:
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         * 
         * Default:
         * Group: security
         */
        default ServiceNowEndpointBuilder sslContextParameters(
                Object sslContextParameters) {
            doSetProperty("sslContextParameters", sslContextParameters);
            return this;
        }
        /**
         * To configure security using SSLContextParameters. See
         * http://camel.apache.org/camel-configuration-utilities.html.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         * 
         * Default:
         * Group: security
         */
        default ServiceNowEndpointBuilder sslContextParameters(
                String sslContextParameters) {
            doSetProperty("sslContextParameters", sslContextParameters);
            return this;
        }
        /**
         * ServiceNow user account name, MUST be provided.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Default:
         * Group: security
         */
        default ServiceNowEndpointBuilder userName(String userName) {
            doSetProperty("userName", userName);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the ServiceNow component.
     */
    public interface AdvancedServiceNowEndpointBuilder
            extends
                EndpointProducerBuilder {
        default ServiceNowEndpointBuilder basic() {
            return (ServiceNowEndpointBuilder) this;
        }
        /**
         * The ServiceNow REST API version, default latest.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default:
         * Group: advanced
         */
        default AdvancedServiceNowEndpointBuilder apiVersion(String apiVersion) {
            doSetProperty("apiVersion", apiVersion);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedServiceNowEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedServiceNowEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * The date format used for Json serialization/deserialization.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: yyyy-MM-dd
         * Group: advanced
         */
        default AdvancedServiceNowEndpointBuilder dateFormat(String dateFormat) {
            doSetProperty("dateFormat", dateFormat);
            return this;
        }
        /**
         * The date-time format used for Json serialization/deserialization.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: yyyy-MM-dd HH:mm:ss
         * Group: advanced
         */
        default AdvancedServiceNowEndpointBuilder dateTimeFormat(
                String dateTimeFormat) {
            doSetProperty("dateTimeFormat", dateTimeFormat);
            return this;
        }
        /**
         * To configure http-client.
         * 
         * The option is a:
         * <code>org.apache.cxf.transports.http.configuration.HTTPClientPolicy</code> type.
         * 
         * Default:
         * Group: advanced
         */
        default AdvancedServiceNowEndpointBuilder httpClientPolicy(
                Object httpClientPolicy) {
            doSetProperty("httpClientPolicy", httpClientPolicy);
            return this;
        }
        /**
         * To configure http-client.
         * 
         * The option will be converted to a
         * <code>org.apache.cxf.transports.http.configuration.HTTPClientPolicy</code> type.
         * 
         * Default:
         * Group: advanced
         */
        default AdvancedServiceNowEndpointBuilder httpClientPolicy(
                String httpClientPolicy) {
            doSetProperty("httpClientPolicy", httpClientPolicy);
            return this;
        }
        /**
         * Sets Jackson's ObjectMapper to use for request/reply.
         * 
         * The option is a:
         * <code>com.fasterxml.jackson.databind.ObjectMapper</code> type.
         * 
         * Default:
         * Group: advanced
         */
        default AdvancedServiceNowEndpointBuilder mapper(Object mapper) {
            doSetProperty("mapper", mapper);
            return this;
        }
        /**
         * Sets Jackson's ObjectMapper to use for request/reply.
         * 
         * The option will be converted to a
         * <code>com.fasterxml.jackson.databind.ObjectMapper</code> type.
         * 
         * Default:
         * Group: advanced
         */
        default AdvancedServiceNowEndpointBuilder mapper(String mapper) {
            doSetProperty("mapper", mapper);
            return this;
        }
        /**
         * To configure proxy authentication.
         * 
         * The option is a:
         * <code>org.apache.cxf.configuration.security.ProxyAuthorizationPolicy</code> type.
         * 
         * Default:
         * Group: advanced
         */
        default AdvancedServiceNowEndpointBuilder proxyAuthorizationPolicy(
                Object proxyAuthorizationPolicy) {
            doSetProperty("proxyAuthorizationPolicy", proxyAuthorizationPolicy);
            return this;
        }
        /**
         * To configure proxy authentication.
         * 
         * The option will be converted to a
         * <code>org.apache.cxf.configuration.security.ProxyAuthorizationPolicy</code> type.
         * 
         * Default:
         * Group: advanced
         */
        default AdvancedServiceNowEndpointBuilder proxyAuthorizationPolicy(
                String proxyAuthorizationPolicy) {
            doSetProperty("proxyAuthorizationPolicy", proxyAuthorizationPolicy);
            return this;
        }
        /**
         * Set this parameter to true to retrieve the target record when using
         * import set api. The import set result is then replaced by the target
         * record.
         * 
         * The option is a: <code>java.lang.Boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedServiceNowEndpointBuilder retrieveTargetRecordOnImport(
                Boolean retrieveTargetRecordOnImport) {
            doSetProperty("retrieveTargetRecordOnImport", retrieveTargetRecordOnImport);
            return this;
        }
        /**
         * Set this parameter to true to retrieve the target record when using
         * import set api. The import set result is then replaced by the target
         * record.
         * 
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedServiceNowEndpointBuilder retrieveTargetRecordOnImport(
                String retrieveTargetRecordOnImport) {
            doSetProperty("retrieveTargetRecordOnImport", retrieveTargetRecordOnImport);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedServiceNowEndpointBuilder synchronous(
                boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedServiceNowEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * The time format used for Json serialization/deserialization.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: HH:mm:ss
         * Group: advanced
         */
        default AdvancedServiceNowEndpointBuilder timeFormat(String timeFormat) {
            doSetProperty("timeFormat", timeFormat);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.servicenow.ServiceNowRelease</code>
     * enum.
     */
    enum ServiceNowRelease {
        FUJI,
        GENEVA,
        HELSINKI;
    }

    public interface ServiceNowBuilders {
        /**
         * ServiceNow (camel-servicenow)
         * The servicenow component is used to integrate Camel with ServiceNow
         * cloud services.
         * 
         * Category: api,cloud,management
         * Since: 2.18
         * Maven coordinates: org.apache.camel:camel-servicenow
         * 
         * Syntax: <code>servicenow:instanceName</code>
         * 
         * Path parameter: instanceName (required)
         * The ServiceNow instance name
         */
        default ServiceNowEndpointBuilder servicenow(String path) {
            return ServiceNowEndpointBuilderFactory.servicenow(path);
        }
    }
    /**
     * ServiceNow (camel-servicenow)
     * The servicenow component is used to integrate Camel with ServiceNow cloud
     * services.
     * 
     * Category: api,cloud,management
     * Since: 2.18
     * Maven coordinates: org.apache.camel:camel-servicenow
     * 
     * Syntax: <code>servicenow:instanceName</code>
     * 
     * Path parameter: instanceName (required)
     * The ServiceNow instance name
     */
    static ServiceNowEndpointBuilder servicenow(String path) {
        class ServiceNowEndpointBuilderImpl extends AbstractEndpointBuilder implements ServiceNowEndpointBuilder, AdvancedServiceNowEndpointBuilder {
            public ServiceNowEndpointBuilderImpl(String path) {
                super("servicenow", path);
            }
        }
        return new ServiceNowEndpointBuilderImpl(path);
    }
}