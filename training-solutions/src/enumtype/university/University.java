package enumtype.university;

public enum University {

    ELTE("Eötvös Lóránd Tudomány Egyetem"),BME("Budapesti Műszaki Egyetem"),SE("Semmelweis Egyetem"),DE("Debreceni Egyetem"),PTE("Pécsi Tudomány Egyetem"),SZE("Szegedi Egyetem");

    String name;

    University(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
