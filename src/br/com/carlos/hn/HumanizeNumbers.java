package br.com.carlos.hn;

import java.util.Arrays;

import br.com.carlos.hn.interfaces.IHumanizeNumbers;

public class HumanizeNumbers<T extends Number> implements IHumanizeNumbers<T> {
    private String lang;
    private Integer indexScale; 
    private Double divider; 
    private Double base; 
    private String scale; 
    private Double baseRound;

    private final static String[] LANGS = { "pt", "en" };

    private final static String[] SHORT_SCALE_PT = {
        "",
        "Mil",
        "Milhão",
        "Bilhão",
        "Trilhão",
        "Quadrilhão",
        "Quintilhão"
    };

    private final static String[] SHORT_SCALE_EN = {
        "",
        "Thousand",
        "Million",
        "Billion",
        "Trillion",
        "Quadrillion",
        "Quintillion"
    };

    public HumanizeNumbers() {
        this.lang = "pt";
    }

    public HumanizeNumbers(String lang) {
        boolean hasLang = Arrays.stream(LANGS).anyMatch(lang.toLowerCase()::equals);
        if (hasLang) {
            this.lang = lang.toLowerCase();
        } else {
            this.lang = "pt";
        }; 
    }

    @Override
    public String execute(T input, Integer decimals) {
        Double aux = null;
        
        if(input.getClass().getName().equals("java.lang.Integer")) {
            aux = input.doubleValue();
        } else {
            aux = (double) input;
        }

        this.indexScale = (int) Math.ceil(aux.toString().length() / 3) - 1;
        this.divider = Math.pow(10, 3 * this.indexScale);
        this.base = aux / this.divider;
        this.scale = this.numberIsPlural();
        this.baseRound = this.getBaseRound(decimals);

        return String.format(
            "%s %s", 
            baseRound.toString().replace(".", ","), 
            this.scale
        );
    }

    @Override
    public String numberIsPlural() {
        String[] shortScale = null;
        String plural = null;

        if(lang == "pt") {
            shortScale = SHORT_SCALE_PT;
            plural = shortScale[this.indexScale].replace("ão", "ões");
        };

        if(lang == "en") {
            shortScale = SHORT_SCALE_EN;
            plural = shortScale[this.indexScale].replace("on", "ons");
        };

        if(this.base <= 2) return shortScale[this.indexScale];

        return plural;
    }

    @Override
    public Double getBaseRound(Integer decimals) {
        return Math.round(this.base * Math.pow(10, decimals)) / Math.pow(10, decimals);
    }
}