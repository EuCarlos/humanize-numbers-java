package br.com.carlos.hn;

public interface IHumanizeNumbers<T> {
    public String execute(T input, Integer decimals);

    public String numberIsPlural();

    public Double getBaseRound(Integer decimals);
}
