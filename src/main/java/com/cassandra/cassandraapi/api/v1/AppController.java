package com.cassandra.cassandraapi.api.v1;

import com.cassandra.cassandraapi.model.App;
import com.cassandra.cassandraapi.service.IAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/apps")
@RestController
public class AppController {

    private final IAppService appService;

    @Autowired
    public AppController(IAppService appService) {
        this.appService = appService;
    }

    @GetMapping
    public List<App> getAllApps()  {
        return appService.getAllApps();
    }

    @GetMapping(path = "{appName}")
    public App getAppByName(@PathVariable String appName) {
        return appService.getAppByName(appName).orElse(null);
    }

    @PostMapping
    public void addApp(@RequestBody App app) {
        appService.addApp(app);
    }

    @DeleteMapping(path = "{appName}")
    public void deleteApp(@PathVariable String appName) {
        appService.deleteApp(appName);
    }

    @PutMapping
    public void updateApp(@RequestBody App app) {
        appService.updateApp(app);
    }
}
