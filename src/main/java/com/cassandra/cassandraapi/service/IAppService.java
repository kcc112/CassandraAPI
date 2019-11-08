package com.cassandra.cassandraapi.service;

import com.cassandra.cassandraapi.model.App;

import java.util.List;
import java.util.Optional;

public interface IAppService {
    List<App> getAllApps();
    Optional<App> getAppByName(String appName);
    void addApp(App app);
    void deleteApp(String appName);
    void updateApp(App app);
}
