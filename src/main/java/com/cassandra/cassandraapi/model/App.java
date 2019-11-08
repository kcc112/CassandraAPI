package com.cassandra.cassandraapi.model;

import com.datastax.driver.core.DataType;
import lombok.*;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("apps_info")
@Data
public class App {
    @PrimaryKey
    private @NonNull String appTitle;
    private @NonNull String category;
    @CassandraType(type = DataType.Name.DOUBLE)
    private @NonNull double rating;
    @CassandraType(type = DataType.Name.INT)
    private @NonNull int reviews;
    private String size;
    private String installs;
    private @NonNull String type;
    private @NonNull String price;
    private @NonNull String contentRating;
    private String genres;
    private String lastUpdate;
    private String currentValue;
    private String androidVer;

    public String getAppTitle() {
        return appTitle;
    }
}
