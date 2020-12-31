package pl.sebroz.database.application.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product {
    private String name;
    private String description;
    private double price;
    private double alcoholContent;
    private boolean available;
    Category category;
}
