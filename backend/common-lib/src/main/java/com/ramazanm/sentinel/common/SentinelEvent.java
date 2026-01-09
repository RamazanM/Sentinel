package com.ramazanm.sentinel.common;

import org.gradle.internal.impldep.com.fasterxml.jackson.annotation.JsonSubTypes;
import org.gradle.internal.impldep.com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.time.Instant;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = StockEvent.class, name = "stock"),
        @JsonSubTypes.Type(value = WeatherEvent.class, name = "weather")
})
public sealed interface SentinelEvent permits StockEvent,WeatherEvent,ServerEvent{
    String sourceId();
    Instant timestamp();
}

