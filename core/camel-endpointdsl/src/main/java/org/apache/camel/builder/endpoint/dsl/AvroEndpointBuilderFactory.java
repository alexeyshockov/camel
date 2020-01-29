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

import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * Working with Apache Avro for data serialization.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface AvroEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Avro component.
     */
    public interface AvroEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedAvroEndpointConsumerBuilder advanced() {
            return (AdvancedAvroEndpointConsumerBuilder) this;
        }
        /**
         * Avro protocol to use.
         * 
         * The option is a: <code>org.apache.avro.Protocol</code> type.
         * 
         * Default:
         * Group: common
         */
        default AvroEndpointConsumerBuilder protocol(Object protocol) {
            doSetProperty("protocol", protocol);
            return this;
        }
        /**
         * Avro protocol to use.
         * 
         * The option will be converted to a
         * <code>org.apache.avro.Protocol</code> type.
         * 
         * Default:
         * Group: common
         */
        default AvroEndpointConsumerBuilder protocol(String protocol) {
            doSetProperty("protocol", protocol);
            return this;
        }
        /**
         * Avro protocol to use defined by the FQN class name.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default:
         * Group: common
         */
        default AvroEndpointConsumerBuilder protocolClassName(
                String protocolClassName) {
            doSetProperty("protocolClassName", protocolClassName);
            return this;
        }
        /**
         * Avro protocol location.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default:
         * Group: common
         */
        default AvroEndpointConsumerBuilder protocolLocation(
                String protocolLocation) {
            doSetProperty("protocolLocation", protocolLocation);
            return this;
        }
        /**
         * If protocol object provided is reflection protocol. Should be used
         * only with protocol parameter because for protocolClassName protocol
         * type will be auto detected.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: common
         */
        default AvroEndpointConsumerBuilder reflectionProtocol(
                boolean reflectionProtocol) {
            doSetProperty("reflectionProtocol", reflectionProtocol);
            return this;
        }
        /**
         * If protocol object provided is reflection protocol. Should be used
         * only with protocol parameter because for protocolClassName protocol
         * type will be auto detected.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: common
         */
        default AvroEndpointConsumerBuilder reflectionProtocol(
                String reflectionProtocol) {
            doSetProperty("reflectionProtocol", reflectionProtocol);
            return this;
        }
        /**
         * If true, consumer parameter won't be wrapped into array. Will fail if
         * protocol specifies more then 1 parameter for the message.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: common
         */
        default AvroEndpointConsumerBuilder singleParameter(
                boolean singleParameter) {
            doSetProperty("singleParameter", singleParameter);
            return this;
        }
        /**
         * If true, consumer parameter won't be wrapped into array. Will fail if
         * protocol specifies more then 1 parameter for the message.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: common
         */
        default AvroEndpointConsumerBuilder singleParameter(
                String singleParameter) {
            doSetProperty("singleParameter", singleParameter);
            return this;
        }
        /**
         * Authority to use (username and password).
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default:
         * Group: common
         */
        default AvroEndpointConsumerBuilder uriAuthority(String uriAuthority) {
            doSetProperty("uriAuthority", uriAuthority);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default AvroEndpointConsumerBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default AvroEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Avro component.
     */
    public interface AdvancedAvroEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AvroEndpointConsumerBuilder basic() {
            return (AvroEndpointConsumerBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a: <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         * 
         * Default:
         * Group: consumer (advanced)
         */
        default AdvancedAvroEndpointConsumerBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         * 
         * Default:
         * Group: consumer (advanced)
         */
        default AdvancedAvroEndpointConsumerBuilder exceptionHandler(
                String exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a: <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Default:
         * Group: consumer (advanced)
         */
        default AdvancedAvroEndpointConsumerBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Default:
         * Group: consumer (advanced)
         */
        default AdvancedAvroEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
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
        default AdvancedAvroEndpointConsumerBuilder basicPropertyBinding(
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
        default AdvancedAvroEndpointConsumerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
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
        default AdvancedAvroEndpointConsumerBuilder synchronous(
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
        default AdvancedAvroEndpointConsumerBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Avro component.
     */
    public interface AvroEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedAvroEndpointProducerBuilder advanced() {
            return (AdvancedAvroEndpointProducerBuilder) this;
        }
        /**
         * Avro protocol to use.
         * 
         * The option is a: <code>org.apache.avro.Protocol</code> type.
         * 
         * Default:
         * Group: common
         */
        default AvroEndpointProducerBuilder protocol(Object protocol) {
            doSetProperty("protocol", protocol);
            return this;
        }
        /**
         * Avro protocol to use.
         * 
         * The option will be converted to a
         * <code>org.apache.avro.Protocol</code> type.
         * 
         * Default:
         * Group: common
         */
        default AvroEndpointProducerBuilder protocol(String protocol) {
            doSetProperty("protocol", protocol);
            return this;
        }
        /**
         * Avro protocol to use defined by the FQN class name.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default:
         * Group: common
         */
        default AvroEndpointProducerBuilder protocolClassName(
                String protocolClassName) {
            doSetProperty("protocolClassName", protocolClassName);
            return this;
        }
        /**
         * Avro protocol location.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default:
         * Group: common
         */
        default AvroEndpointProducerBuilder protocolLocation(
                String protocolLocation) {
            doSetProperty("protocolLocation", protocolLocation);
            return this;
        }
        /**
         * If protocol object provided is reflection protocol. Should be used
         * only with protocol parameter because for protocolClassName protocol
         * type will be auto detected.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: common
         */
        default AvroEndpointProducerBuilder reflectionProtocol(
                boolean reflectionProtocol) {
            doSetProperty("reflectionProtocol", reflectionProtocol);
            return this;
        }
        /**
         * If protocol object provided is reflection protocol. Should be used
         * only with protocol parameter because for protocolClassName protocol
         * type will be auto detected.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: common
         */
        default AvroEndpointProducerBuilder reflectionProtocol(
                String reflectionProtocol) {
            doSetProperty("reflectionProtocol", reflectionProtocol);
            return this;
        }
        /**
         * If true, consumer parameter won't be wrapped into array. Will fail if
         * protocol specifies more then 1 parameter for the message.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: common
         */
        default AvroEndpointProducerBuilder singleParameter(
                boolean singleParameter) {
            doSetProperty("singleParameter", singleParameter);
            return this;
        }
        /**
         * If true, consumer parameter won't be wrapped into array. Will fail if
         * protocol specifies more then 1 parameter for the message.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: common
         */
        default AvroEndpointProducerBuilder singleParameter(
                String singleParameter) {
            doSetProperty("singleParameter", singleParameter);
            return this;
        }
        /**
         * Authority to use (username and password).
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default:
         * Group: common
         */
        default AvroEndpointProducerBuilder uriAuthority(String uriAuthority) {
            doSetProperty("uriAuthority", uriAuthority);
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
        default AvroEndpointProducerBuilder lazyStartProducer(
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
        default AvroEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Avro component.
     */
    public interface AdvancedAvroEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AvroEndpointProducerBuilder basic() {
            return (AvroEndpointProducerBuilder) this;
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
        default AdvancedAvroEndpointProducerBuilder basicPropertyBinding(
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
        default AdvancedAvroEndpointProducerBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
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
        default AdvancedAvroEndpointProducerBuilder synchronous(
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
        default AdvancedAvroEndpointProducerBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Avro component.
     */
    public interface AvroEndpointBuilder
            extends
                AvroEndpointConsumerBuilder,
                AvroEndpointProducerBuilder {
        default AdvancedAvroEndpointBuilder advanced() {
            return (AdvancedAvroEndpointBuilder) this;
        }
        /**
         * Avro protocol to use.
         * 
         * The option is a: <code>org.apache.avro.Protocol</code> type.
         * 
         * Default:
         * Group: common
         */
        default AvroEndpointBuilder protocol(Object protocol) {
            doSetProperty("protocol", protocol);
            return this;
        }
        /**
         * Avro protocol to use.
         * 
         * The option will be converted to a
         * <code>org.apache.avro.Protocol</code> type.
         * 
         * Default:
         * Group: common
         */
        default AvroEndpointBuilder protocol(String protocol) {
            doSetProperty("protocol", protocol);
            return this;
        }
        /**
         * Avro protocol to use defined by the FQN class name.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default:
         * Group: common
         */
        default AvroEndpointBuilder protocolClassName(String protocolClassName) {
            doSetProperty("protocolClassName", protocolClassName);
            return this;
        }
        /**
         * Avro protocol location.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default:
         * Group: common
         */
        default AvroEndpointBuilder protocolLocation(String protocolLocation) {
            doSetProperty("protocolLocation", protocolLocation);
            return this;
        }
        /**
         * If protocol object provided is reflection protocol. Should be used
         * only with protocol parameter because for protocolClassName protocol
         * type will be auto detected.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: common
         */
        default AvroEndpointBuilder reflectionProtocol(
                boolean reflectionProtocol) {
            doSetProperty("reflectionProtocol", reflectionProtocol);
            return this;
        }
        /**
         * If protocol object provided is reflection protocol. Should be used
         * only with protocol parameter because for protocolClassName protocol
         * type will be auto detected.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: common
         */
        default AvroEndpointBuilder reflectionProtocol(String reflectionProtocol) {
            doSetProperty("reflectionProtocol", reflectionProtocol);
            return this;
        }
        /**
         * If true, consumer parameter won't be wrapped into array. Will fail if
         * protocol specifies more then 1 parameter for the message.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: common
         */
        default AvroEndpointBuilder singleParameter(boolean singleParameter) {
            doSetProperty("singleParameter", singleParameter);
            return this;
        }
        /**
         * If true, consumer parameter won't be wrapped into array. Will fail if
         * protocol specifies more then 1 parameter for the message.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: common
         */
        default AvroEndpointBuilder singleParameter(String singleParameter) {
            doSetProperty("singleParameter", singleParameter);
            return this;
        }
        /**
         * Authority to use (username and password).
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default:
         * Group: common
         */
        default AvroEndpointBuilder uriAuthority(String uriAuthority) {
            doSetProperty("uriAuthority", uriAuthority);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Avro component.
     */
    public interface AdvancedAvroEndpointBuilder
            extends
                AdvancedAvroEndpointConsumerBuilder,
                AdvancedAvroEndpointProducerBuilder {
        default AvroEndpointBuilder basic() {
            return (AvroEndpointBuilder) this;
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
        default AdvancedAvroEndpointBuilder basicPropertyBinding(
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
        default AdvancedAvroEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
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
        default AdvancedAvroEndpointBuilder synchronous(boolean synchronous) {
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
        default AdvancedAvroEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    public interface AvroBuilders {
        /**
         * Avro (camel-avro)
         * Working with Apache Avro for data serialization.
         * 
         * Category: messaging,transformation
         * Since: 2.10
         * Maven coordinates: org.apache.camel:camel-avro
         * 
         * Syntax: <code>avro:transport:host:port/messageName</code>
         * 
         * Path parameter: transport (required)
         * Transport to use, can be either http or netty
         * The value can be one of: http, netty
         * 
         * Path parameter: port (required)
         * Port number to use
         * 
         * Path parameter: host (required)
         * Hostname to use
         * 
         * Path parameter: messageName
         * The name of the message to send.
         */
        default AvroEndpointBuilder avro(String path) {
            return AvroEndpointBuilderFactory.avro(path);
        }
    }
    /**
     * Avro (camel-avro)
     * Working with Apache Avro for data serialization.
     * 
     * Category: messaging,transformation
     * Since: 2.10
     * Maven coordinates: org.apache.camel:camel-avro
     * 
     * Syntax: <code>avro:transport:host:port/messageName</code>
     * 
     * Path parameter: transport (required)
     * Transport to use, can be either http or netty
     * The value can be one of: http, netty
     * 
     * Path parameter: port (required)
     * Port number to use
     * 
     * Path parameter: host (required)
     * Hostname to use
     * 
     * Path parameter: messageName
     * The name of the message to send.
     */
    static AvroEndpointBuilder avro(String path) {
        class AvroEndpointBuilderImpl extends AbstractEndpointBuilder implements AvroEndpointBuilder, AdvancedAvroEndpointBuilder {
            public AvroEndpointBuilderImpl(String path) {
                super("avro", path);
            }
        }
        return new AvroEndpointBuilderImpl(path);
    }
}