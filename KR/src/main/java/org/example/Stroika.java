package org.example;

public class Stroika {
    private Roof roof;
    private Basement basement;
    private Walls walls;
    private Otdelka otdelka;
    private StatusEnum status;
    private StroikaStatus stroikaStatus;
    private Stroika number;

    public Stroika(Roof roof, Basement basement, Walls walls, Otdelka otdelka, StroikaStatus stroikaStatus, Stroika number) {
        this.roof = roof;
        this.basement = basement;
        this.walls = walls;
        this.otdelka = otdelka;
        this.stroikaStatus = stroikaStatus;
    }

    @Override
    public String toString() {
        return "Stroika {" +
                "Площадь крыши = " + roof.square +
                ", Объем фундамента = " + basement.size +
                ", Кол-во кирпичей = " + walls.countBrick +
                ", Стоимость отделки = " + otdelka.summa +
                ", Статус стройки = " + stroikaStatus.statusEnum +
                '}';
    }
}
