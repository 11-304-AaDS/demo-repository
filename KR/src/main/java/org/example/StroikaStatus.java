package org.example;

public class StroikaStatus implements IStroikaStatus{
    public StatusEnum statusEnum;
    public StroikaStatus(StatusEnum statusEnum) {
        this.statusEnum = setStatus(statusEnum);
    }

    @Override
    public StatusEnum setStatus(StatusEnum statusEnum) {
        return statusEnum;
    }
}
