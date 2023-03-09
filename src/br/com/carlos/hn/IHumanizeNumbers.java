package br.com.carlos.hn;

public interface IHumanizeNumbers {
    public String execute(Double input, Integer decimals);

    public String numberIsPlural();

    public Double getBaseRound(Integer decimals);
}
