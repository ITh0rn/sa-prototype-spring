package it.univaq.softwarearchitecture.prototype.model;

import com.fasterxml.jackson.annotation.JacksonAnnotation;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Service {


    public enum Type {
        T1,
        T2;
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date date;

    @JsonProperty("service_type")
    private String serviceType;

    private String status;
}
