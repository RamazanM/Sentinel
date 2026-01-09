package com.ramazanm.sentinel.common;

import java.math.BigDecimal;
import java.time.Instant;

public record StockEvent(
        String sourceId,
        BigDecimal price,
        String currency,
        Instant timestamp
) implements SentinelEvent {}
