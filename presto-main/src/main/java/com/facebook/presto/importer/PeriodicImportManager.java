package com.facebook.presto.importer;

import com.google.common.base.Predicate;

import java.util.List;

public interface PeriodicImportManager
{
    long insertJob(PeriodicImportJob job);

    void dropJob(long jobId);

    void dropJobs(Predicate<PersistentPeriodicImportJob> jobPredicate);

    long getJobCount();

    PersistentPeriodicImportJob getJob(long jobId);

    List<PersistentPeriodicImportJob> getJobs();

    long beginRun(long jobId);

    void endRun(long runId, boolean result);
}

