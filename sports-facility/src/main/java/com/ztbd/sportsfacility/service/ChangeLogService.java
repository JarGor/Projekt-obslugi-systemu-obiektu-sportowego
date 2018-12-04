package com.ztbd.sportsfacility.service;

import com.ztbd.sportsfacility.model.ChangeLog;

import java.time.LocalDate;
import java.util.List;

public interface ChangeLogService {
    void deleteChangeLog(LocalDate date);
    void saveChangeLog(ChangeLog changeLog);
    ChangeLog getChangeLog(LocalDate date);
    List<ChangeLog> getChangeLogs();
}
