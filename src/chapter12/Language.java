package chapter12;

public enum Language {

    HY("Armenia"),
    ENG(),
    RU("Russia"),
    FR("France");
    private String country;

    Language(String country){
        this.country = country;
    }
    public String getCountry() {
        return country;
    }
    Language(){}
}
