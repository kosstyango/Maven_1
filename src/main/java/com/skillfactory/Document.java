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
    private String name; //название документа
    private String data; //содержимое документа
    List<Paragraph> list = new ArrayList<>(); // список параграфов
}
