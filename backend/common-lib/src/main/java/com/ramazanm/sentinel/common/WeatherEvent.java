package com.ramazanm.sentinel.common;

import java.time.Instant;

public record WeatherEvent(
        String sourceId,
        double temperature,
        double humidity,
        Instant timestamp
) implements SentinelEvent {}
