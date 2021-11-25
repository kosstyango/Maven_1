package com.skillfactory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data


public class Document {
    private String name;
    private String data;
    List<Paragraph> list2 = new ArrayList<>(); // список параграфов
}
