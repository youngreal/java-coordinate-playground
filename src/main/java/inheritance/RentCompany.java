package inheritance;

public class RentCompany {
    Car car;
    double distance;

    public static RentCompany create() {
        return new RentCompany();
    }

    public void addCar(Car car) {
        this.car = car;
        this.distance = car.getTripDistance();
    }

    public String generateReport() {
        return "inheritance.Sonata : " + Math.round(new Sonata(150).getChargeQuantity())+ "리터" + System.getProperty("line.separator") +
         "inheritance.K5 : " + Math.round(new K5(260).getChargeQuantity())+ "리터" + System.getProperty("line.separator") +
         "inheritance.Sonata : " + Math.round(new Sonata(120).getChargeQuantity())+ "리터" + System.getProperty("line.separator") +
         "inheritance.Avante : " + Math.round(new Avante(300).getChargeQuantity())+ "리터" + System.getProperty("line.separator") +
         "inheritance.K5 : " + Math.round(new K5(390).getChargeQuantity())+ "리터" + System.getProperty("line.separator");
    }
}