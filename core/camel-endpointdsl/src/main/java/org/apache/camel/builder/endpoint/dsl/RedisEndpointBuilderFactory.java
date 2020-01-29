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
 * The spring-redis component allows sending and receiving messages from Redis.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface RedisEndpointBuilderFactory {


    /**
     * Builder for endpoint consumers for the Spring Redis component.
     */
    public interface RedisEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedRedisEndpointConsumerBuilder advanced() {
            return (AdvancedRedisEndpointConsumerBuilder) this;
        }
        /**
         * List of topic names or name patterns to subscribe to. Multiple names
         * can be separated by comma.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default:
         * Group: common
         */
        default RedisEndpointConsumerBuilder channels(String channels) {
            doSetProperty("channels", channels);
            return this;
        }
        /**
         * Default command, which can be overridden by message header. Notice
         * the consumer only supports the following commands: PSUBSCRIBE and
         * SUBSCRIBE.
         * 
         * The option is a:
         * <code>org.apache.camel.component.redis.Command</code> type.
         * 
         * Default: SET
         * Group: common
         */
        default RedisEndpointConsumerBuilder command(Command command) {
            doSetProperty("command", command);
            return this;
        }
        /**
         * Default command, which can be overridden by message header. Notice
         * the consumer only supports the following commands: PSUBSCRIBE and
         * SUBSCRIBE.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.redis.Command</code> type.
         * 
         * Default: SET
         * Group: common
         */
        default RedisEndpointConsumerBuilder command(String command) {
            doSetProperty("command", command);
            return this;
        }
        /**
         * Reference to a pre-configured RedisConnectionFactory instance to use.
         * 
         * The option is a:
         * <code>org.springframework.data.redis.connection.RedisConnectionFactory</code> type.
         * 
         * Default:
         * Group: common
         */
        default RedisEndpointConsumerBuilder connectionFactory(
                Object connectionFactory) {
            doSetProperty("connectionFactory", connectionFactory);
            return this;
        }
        /**
         * Reference to a pre-configured RedisConnectionFactory instance to use.
         * 
         * The option will be converted to a
         * <code>org.springframework.data.redis.connection.RedisConnectionFactory</code> type.
         * 
         * Default:
         * Group: common
         */
        default RedisEndpointConsumerBuilder connectionFactory(
                String connectionFactory) {
            doSetProperty("connectionFactory", connectionFactory);
            return this;
        }
        /**
         * Reference to a pre-configured RedisTemplate instance to use.
         * 
         * The option is a:
         * <code>org.springframework.data.redis.core.RedisTemplate</code> type.
         * 
         * Default:
         * Group: common
         */
        default RedisEndpointConsumerBuilder redisTemplate(Object redisTemplate) {
            doSetProperty("redisTemplate", redisTemplate);
            return this;
        }
        /**
         * Reference to a pre-configured RedisTemplate instance to use.
         * 
         * The option will be converted to a
         * <code>org.springframework.data.redis.core.RedisTemplate</code> type.
         * 
         * Default:
         * Group: common
         */
        default RedisEndpointConsumerBuilder redisTemplate(String redisTemplate) {
            doSetProperty("redisTemplate", redisTemplate);
            return this;
        }
        /**
         * Reference to a pre-configured RedisSerializer instance to use.
         * 
         * The option is a:
         * <code>org.springframework.data.redis.serializer.RedisSerializer</code> type.
         * 
         * Default:
         * Group: common
         */
        default RedisEndpointConsumerBuilder serializer(Object serializer) {
            doSetProperty("serializer", serializer);
            return this;
        }
        /**
         * Reference to a pre-configured RedisSerializer instance to use.
         * 
         * The option will be converted to a
         * <code>org.springframework.data.redis.serializer.RedisSerializer</code> type.
         * 
         * Default:
         * Group: common
         */
        default RedisEndpointConsumerBuilder serializer(String serializer) {
            doSetProperty("serializer", serializer);
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
        default RedisEndpointConsumerBuilder bridgeErrorHandler(
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
        default RedisEndpointConsumerBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint consumers for the Spring Redis component.
     */
    public interface AdvancedRedisEndpointConsumerBuilder
            extends
                EndpointConsumerBuilder {
        default RedisEndpointConsumerBuilder basic() {
            return (RedisEndpointConsumerBuilder) this;
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
        default AdvancedRedisEndpointConsumerBuilder exceptionHandler(
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
        default AdvancedRedisEndpointConsumerBuilder exceptionHandler(
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
        default AdvancedRedisEndpointConsumerBuilder exchangePattern(
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
        default AdvancedRedisEndpointConsumerBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Reference to a pre-configured RedisMessageListenerContainer instance
         * to use.
         * 
         * The option is a:
         * <code>org.springframework.data.redis.listener.RedisMessageListenerContainer</code> type.
         * 
         * Default:
         * Group: consumer (advanced)
         */
        default AdvancedRedisEndpointConsumerBuilder listenerContainer(
                Object listenerContainer) {
            doSetProperty("listenerContainer", listenerContainer);
            return this;
        }
        /**
         * Reference to a pre-configured RedisMessageListenerContainer instance
         * to use.
         * 
         * The option will be converted to a
         * <code>org.springframework.data.redis.listener.RedisMessageListenerContainer</code> type.
         * 
         * Default:
         * Group: consumer (advanced)
         */
        default AdvancedRedisEndpointConsumerBuilder listenerContainer(
                String listenerContainer) {
            doSetProperty("listenerContainer", listenerContainer);
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
        default AdvancedRedisEndpointConsumerBuilder basicPropertyBinding(
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
        default AdvancedRedisEndpointConsumerBuilder basicPropertyBinding(
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
        default AdvancedRedisEndpointConsumerBuilder synchronous(
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
        default AdvancedRedisEndpointConsumerBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint producers for the Spring Redis component.
     */
    public interface RedisEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedRedisEndpointProducerBuilder advanced() {
            return (AdvancedRedisEndpointProducerBuilder) this;
        }
        /**
         * List of topic names or name patterns to subscribe to. Multiple names
         * can be separated by comma.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default:
         * Group: common
         */
        default RedisEndpointProducerBuilder channels(String channels) {
            doSetProperty("channels", channels);
            return this;
        }
        /**
         * Default command, which can be overridden by message header. Notice
         * the consumer only supports the following commands: PSUBSCRIBE and
         * SUBSCRIBE.
         * 
         * The option is a:
         * <code>org.apache.camel.component.redis.Command</code> type.
         * 
         * Default: SET
         * Group: common
         */
        default RedisEndpointProducerBuilder command(Command command) {
            doSetProperty("command", command);
            return this;
        }
        /**
         * Default command, which can be overridden by message header. Notice
         * the consumer only supports the following commands: PSUBSCRIBE and
         * SUBSCRIBE.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.redis.Command</code> type.
         * 
         * Default: SET
         * Group: common
         */
        default RedisEndpointProducerBuilder command(String command) {
            doSetProperty("command", command);
            return this;
        }
        /**
         * Reference to a pre-configured RedisConnectionFactory instance to use.
         * 
         * The option is a:
         * <code>org.springframework.data.redis.connection.RedisConnectionFactory</code> type.
         * 
         * Default:
         * Group: common
         */
        default RedisEndpointProducerBuilder connectionFactory(
                Object connectionFactory) {
            doSetProperty("connectionFactory", connectionFactory);
            return this;
        }
        /**
         * Reference to a pre-configured RedisConnectionFactory instance to use.
         * 
         * The option will be converted to a
         * <code>org.springframework.data.redis.connection.RedisConnectionFactory</code> type.
         * 
         * Default:
         * Group: common
         */
        default RedisEndpointProducerBuilder connectionFactory(
                String connectionFactory) {
            doSetProperty("connectionFactory", connectionFactory);
            return this;
        }
        /**
         * Reference to a pre-configured RedisTemplate instance to use.
         * 
         * The option is a:
         * <code>org.springframework.data.redis.core.RedisTemplate</code> type.
         * 
         * Default:
         * Group: common
         */
        default RedisEndpointProducerBuilder redisTemplate(Object redisTemplate) {
            doSetProperty("redisTemplate", redisTemplate);
            return this;
        }
        /**
         * Reference to a pre-configured RedisTemplate instance to use.
         * 
         * The option will be converted to a
         * <code>org.springframework.data.redis.core.RedisTemplate</code> type.
         * 
         * Default:
         * Group: common
         */
        default RedisEndpointProducerBuilder redisTemplate(String redisTemplate) {
            doSetProperty("redisTemplate", redisTemplate);
            return this;
        }
        /**
         * Reference to a pre-configured RedisSerializer instance to use.
         * 
         * The option is a:
         * <code>org.springframework.data.redis.serializer.RedisSerializer</code> type.
         * 
         * Default:
         * Group: common
         */
        default RedisEndpointProducerBuilder serializer(Object serializer) {
            doSetProperty("serializer", serializer);
            return this;
        }
        /**
         * Reference to a pre-configured RedisSerializer instance to use.
         * 
         * The option will be converted to a
         * <code>org.springframework.data.redis.serializer.RedisSerializer</code> type.
         * 
         * Default:
         * Group: common
         */
        default RedisEndpointProducerBuilder serializer(String serializer) {
            doSetProperty("serializer", serializer);
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
        default RedisEndpointProducerBuilder lazyStartProducer(
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
        default RedisEndpointProducerBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint producers for the Spring Redis component.
     */
    public interface AdvancedRedisEndpointProducerBuilder
            extends
                EndpointProducerBuilder {
        default RedisEndpointProducerBuilder basic() {
            return (RedisEndpointProducerBuilder) this;
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
        default AdvancedRedisEndpointProducerBuilder basicPropertyBinding(
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
        default AdvancedRedisEndpointProducerBuilder basicPropertyBinding(
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
        default AdvancedRedisEndpointProducerBuilder synchronous(
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
        default AdvancedRedisEndpointProducerBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Builder for endpoint for the Spring Redis component.
     */
    public interface RedisEndpointBuilder
            extends
                RedisEndpointConsumerBuilder,
                RedisEndpointProducerBuilder {
        default AdvancedRedisEndpointBuilder advanced() {
            return (AdvancedRedisEndpointBuilder) this;
        }
        /**
         * List of topic names or name patterns to subscribe to. Multiple names
         * can be separated by comma.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default:
         * Group: common
         */
        default RedisEndpointBuilder channels(String channels) {
            doSetProperty("channels", channels);
            return this;
        }
        /**
         * Default command, which can be overridden by message header. Notice
         * the consumer only supports the following commands: PSUBSCRIBE and
         * SUBSCRIBE.
         * 
         * The option is a:
         * <code>org.apache.camel.component.redis.Command</code> type.
         * 
         * Default: SET
         * Group: common
         */
        default RedisEndpointBuilder command(Command command) {
            doSetProperty("command", command);
            return this;
        }
        /**
         * Default command, which can be overridden by message header. Notice
         * the consumer only supports the following commands: PSUBSCRIBE and
         * SUBSCRIBE.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.redis.Command</code> type.
         * 
         * Default: SET
         * Group: common
         */
        default RedisEndpointBuilder command(String command) {
            doSetProperty("command", command);
            return this;
        }
        /**
         * Reference to a pre-configured RedisConnectionFactory instance to use.
         * 
         * The option is a:
         * <code>org.springframework.data.redis.connection.RedisConnectionFactory</code> type.
         * 
         * Default:
         * Group: common
         */
        default RedisEndpointBuilder connectionFactory(Object connectionFactory) {
            doSetProperty("connectionFactory", connectionFactory);
            return this;
        }
        /**
         * Reference to a pre-configured RedisConnectionFactory instance to use.
         * 
         * The option will be converted to a
         * <code>org.springframework.data.redis.connection.RedisConnectionFactory</code> type.
         * 
         * Default:
         * Group: common
         */
        default RedisEndpointBuilder connectionFactory(String connectionFactory) {
            doSetProperty("connectionFactory", connectionFactory);
            return this;
        }
        /**
         * Reference to a pre-configured RedisTemplate instance to use.
         * 
         * The option is a:
         * <code>org.springframework.data.redis.core.RedisTemplate</code> type.
         * 
         * Default:
         * Group: common
         */
        default RedisEndpointBuilder redisTemplate(Object redisTemplate) {
            doSetProperty("redisTemplate", redisTemplate);
            return this;
        }
        /**
         * Reference to a pre-configured RedisTemplate instance to use.
         * 
         * The option will be converted to a
         * <code>org.springframework.data.redis.core.RedisTemplate</code> type.
         * 
         * Default:
         * Group: common
         */
        default RedisEndpointBuilder redisTemplate(String redisTemplate) {
            doSetProperty("redisTemplate", redisTemplate);
            return this;
        }
        /**
         * Reference to a pre-configured RedisSerializer instance to use.
         * 
         * The option is a:
         * <code>org.springframework.data.redis.serializer.RedisSerializer</code> type.
         * 
         * Default:
         * Group: common
         */
        default RedisEndpointBuilder serializer(Object serializer) {
            doSetProperty("serializer", serializer);
            return this;
        }
        /**
         * Reference to a pre-configured RedisSerializer instance to use.
         * 
         * The option will be converted to a
         * <code>org.springframework.data.redis.serializer.RedisSerializer</code> type.
         * 
         * Default:
         * Group: common
         */
        default RedisEndpointBuilder serializer(String serializer) {
            doSetProperty("serializer", serializer);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Spring Redis component.
     */
    public interface AdvancedRedisEndpointBuilder
            extends
                AdvancedRedisEndpointConsumerBuilder,
                AdvancedRedisEndpointProducerBuilder {
        default RedisEndpointBuilder basic() {
            return (RedisEndpointBuilder) this;
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
        default AdvancedRedisEndpointBuilder basicPropertyBinding(
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
        default AdvancedRedisEndpointBuilder basicPropertyBinding(
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
        default AdvancedRedisEndpointBuilder synchronous(boolean synchronous) {
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
        default AdvancedRedisEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for <code>org.apache.camel.component.redis.Command</code>
     * enum.
     */
    enum Command {
        PING,
        SET,
        GET,
        QUIT,
        EXISTS,
        DEL,
        TYPE,
        FLUSHDB,
        KEYS,
        RANDOMKEY,
        RENAME,
        RENAMENX,
        RENAMEX,
        DBSIZE,
        EXPIRE,
        EXPIREAT,
        TTL,
        SELECT,
        MOVE,
        FLUSHALL,
        GETSET,
        MGET,
        SETNX,
        SETEX,
        MSET,
        MSETNX,
        DECRBY,
        DECR,
        INCRBY,
        INCR,
        APPEND,
        SUBSTR,
        HSET,
        HGET,
        HSETNX,
        HMSET,
        HMGET,
        HINCRBY,
        HEXISTS,
        HDEL,
        HLEN,
        HKEYS,
        HVALS,
        HGETALL,
        RPUSH,
        LPUSH,
        LLEN,
        LRANGE,
        LTRIM,
        LINDEX,
        LSET,
        LREM,
        LPOP,
        RPOP,
        RPOPLPUSH,
        SADD,
        SMEMBERS,
        SREM,
        SPOP,
        SMOVE,
        SCARD,
        SISMEMBER,
        SINTER,
        SINTERSTORE,
        SUNION,
        SUNIONSTORE,
        SDIFF,
        SDIFFSTORE,
        SRANDMEMBER,
        ZADD,
        ZRANGE,
        ZREM,
        ZINCRBY,
        ZRANK,
        ZREVRANK,
        ZREVRANGE,
        ZCARD,
        ZSCORE,
        MULTI,
        DISCARD,
        EXEC,
        WATCH,
        UNWATCH,
        SORT,
        BLPOP,
        BRPOP,
        AUTH,
        SUBSCRIBE,
        PUBLISH,
        UNSUBSCRIBE,
        PSUBSCRIBE,
        PUNSUBSCRIBE,
        ZCOUNT,
        ZRANGEBYSCORE,
        ZREVRANGEBYSCORE,
        ZREMRANGEBYRANK,
        ZREMRANGEBYSCORE,
        ZUNIONSTORE,
        ZINTERSTORE,
        SAVE,
        BGSAVE,
        BGREWRITEAOF,
        LASTSAVE,
        SHUTDOWN,
        INFO,
        MONITOR,
        SLAVEOF,
        CONFIG,
        STRLEN,
        SYNC,
        LPUSHX,
        PERSIST,
        RPUSHX,
        ECHO,
        LINSERT,
        DEBUG,
        BRPOPLPUSH,
        SETBIT,
        GETBIT,
        SETRANGE,
        GETRANGE,
        PEXPIRE,
        PEXPIREAT,
        GEOADD,
        GEODIST,
        GEOHASH,
        GEOPOS,
        GEORADIUS,
        GEORADIUSBYMEMBER;
    }

    public interface RedisBuilders {
        /**
         * Spring Redis (camel-spring-redis)
         * The spring-redis component allows sending and receiving messages from
         * Redis.
         * 
         * Category: spring,nosql
         * Since: 2.11
         * Maven coordinates: org.apache.camel:camel-spring-redis
         * 
         * Syntax: <code>spring-redis:host:port</code>
         * 
         * Path parameter: host (required)
         * The host where Redis server is running.
         * 
         * Path parameter: port (required)
         * Redis server port number
         */
        default RedisEndpointBuilder springRedis(String path) {
            return RedisEndpointBuilderFactory.springRedis(path);
        }
    }
    /**
     * Spring Redis (camel-spring-redis)
     * The spring-redis component allows sending and receiving messages from
     * Redis.
     * 
     * Category: spring,nosql
     * Since: 2.11
     * Maven coordinates: org.apache.camel:camel-spring-redis
     * 
     * Syntax: <code>spring-redis:host:port</code>
     * 
     * Path parameter: host (required)
     * The host where Redis server is running.
     * 
     * Path parameter: port (required)
     * Redis server port number
     */
    static RedisEndpointBuilder springRedis(String path) {
        class RedisEndpointBuilderImpl extends AbstractEndpointBuilder implements RedisEndpointBuilder, AdvancedRedisEndpointBuilder {
            public RedisEndpointBuilderImpl(String path) {
                super("spring-redis", path);
            }
        }
        return new RedisEndpointBuilderImpl(path);
    }
}