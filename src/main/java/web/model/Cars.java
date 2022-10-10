package web.model;

import org.springframework.web.bind.annotation.ModelAttribute;


public class Cars {
    private int id;
    private String nameCar;
    private int series;

    public Cars() {
    }

    public Cars(int id, String nameCar, int series) {
        this.id = id;
        this.nameCar = nameCar;
        this.series = series;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameCar() {

        return nameCar;
    }

    public void setNameCar(String nameCar) {

        this.nameCar = nameCar;
    }

    public int getSeries() {

        return series;
    }

    public void setSeries(int series) {

        this.series = series;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "id=" + id +
                ", nameCar='" + nameCar + '\'' +
                ", series=" + series +
                '}';
    }
}
