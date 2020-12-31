package pl.sebroz.database.application.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Category {
    WINE("Wine"),
    BEER("Beer"),
    VODKA("Vodka"),
    WHISKEY("Whiskey"),
    OTHER("Other");

    private String name;
}
