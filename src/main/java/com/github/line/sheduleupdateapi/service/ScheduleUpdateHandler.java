package com.github.line.sheduleupdateapi.service;

import com.github.line.sheduleupdateapi.domain.Schedule;

import java.util.Optional;

public interface ScheduleUpdateHandler {
    public Optional<Schedule> handle();
}
