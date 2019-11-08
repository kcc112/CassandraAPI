package com.cassandra.cassandraapi.repository;

import com.cassandra.cassandraapi.model.App;
import org.springframework.data.repository.CrudRepository;

public interface IAppRepository extends CrudRepository<App, String> {
}
