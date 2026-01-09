package com.ramazanm.sentinel.common;

import java.time.Instant;

public record ServerEvent(
        String sourceId,
        int cpuLoad,
        long freeMemoryMb,
        Instant timestamp
) implements SentinelEvent {}
