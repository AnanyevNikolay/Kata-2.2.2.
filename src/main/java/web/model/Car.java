package web.model;

public class Car {

    private String model;

    private String series;

    private int constructYear;

    public Car(String model, String series, int constructYear) {
        this.model = model;
        this.series = series;
        this.constructYear = constructYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getConstructYear() {
        return constructYear;
    }

    public void setConstructYear(int constructYear) {
        this.constructYear = constructYear;
    }
}
