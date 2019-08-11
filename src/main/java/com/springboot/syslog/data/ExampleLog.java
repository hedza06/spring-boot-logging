package com.springboot.syslog.data;

import org.springframework.context.annotation.Description;

import java.io.Serializable;

@Description("Example log data transfer object")
public class ExampleLog implements Serializable {

    private static final long serialVersionUID = -20190811101900L;

    private Long id;
    private String label;
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString()
    {
        return "ExampleLog{" +
            "id=" + id +
            ", label='" + label + '\'' +
            ", description='" + description + '\'' +
        '}';
    }
}
