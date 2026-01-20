package ru.yandex.practicum.catsgram.service;

public enum SortOrder {
    ASCENDING,
    DESCENDING;

    public static SortOrder from(String order) {
        if (order == null) {
            return DESCENDING;
        }
        switch (order.toLowerCase()) {
            case "asc":
            case "ascending":
                return ASCENDING;
            case "desc":
            case "descending":
                return DESCENDING;
            default:
                return DESCENDING;
        }
    }
}