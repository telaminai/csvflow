package com.fluxtion.extension.csvcompiler.beans;

import com.fluxtion.extension.csvcompiler.annotations.CsvMarshaller;
import lombok.Data;

@Data
@CsvMarshaller
public class LombokBean {

    private String name;
    private int age;
}
