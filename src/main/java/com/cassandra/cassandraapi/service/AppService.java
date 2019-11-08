package com.cassandra.cassandraapi.service;

import com.cassandra.cassandraapi.model.App;
import com.cassandra.cassandraapi.repository.IAppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AppService implements IAppService {

    private IAppRepository appRepository;

    @Autowired
    public AppService(IAppRepository appRepository) {
        this.appRepository = appRepository;
    }

    @Override
    public void addApp(App app) {
        appRepository.save(app);
    }

    @Override
    public List<App> getAllApps() {
        List<App> apps = new ArrayList<>();
        appRepository.findAll().forEach(apps::add);
        return apps;
    }

    @Override
    public Optional<App> getAppByName(String appName) {
        return appRepository.findById(appName);
    }

    @Override
    public void deleteApp(String appName) {
        appRepository.deleteById(appName);
    }

    @Override
    public void updateApp(App app) {

    }
}
