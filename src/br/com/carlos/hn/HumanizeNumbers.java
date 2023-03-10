package br.com.carlos.hn;

public class HumanizeNumbers implements IHumanizeNumbers {
    private Integer indexScale; 
    private Double divider; 
    private Double base; 
    private String scale; 
    private Double baseRound; 

    private final static String[] SHORT_SCALE = {
        "",
        "Mil",
        "Milhão",
        "Bilhão",
        "Trilhão",
        "Quadrilhão",
        "Quintilhão"
    };

    public HumanizeNumbers() {}

    @Override
    public String execute(Double input, Integer decimals) {
        this.indexScale = (int) Math.ceil(input.toString().length() / 3) - 1;
        this.divider = Math.pow(10, 3 * this.indexScale);
        this.base = input / this.divider;
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
        if(this.base <= 2) return SHORT_SCALE[this.indexScale];

        return SHORT_SCALE[this.indexScale].replace("ão", "ões");
    }

    @Override
    public Double getBaseRound(Integer decimals) {
        return Math.round(this.base * Math.pow(10, decimals)) / Math.pow(10, decimals);
    }
}