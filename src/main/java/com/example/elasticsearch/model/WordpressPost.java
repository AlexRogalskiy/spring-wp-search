package com.example.elasticsearch.model;


import com.example.elasticsearch.utils.WordpressPostDeserializer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Data
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(using = WordpressPostDeserializer.class)
//@JsonTypeInfo(include = JsonTypeInfo.As.WRAPPER_OBJECT, use = JsonTypeInfo.Id.CLASS)
public class WordpressPost implements Serializable {

    @Id
    private long id;

    @JsonProperty("date_gmt")
    private String dateGMT;

    private String guid;

    private String title;


    private String excerpt;
}
