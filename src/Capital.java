public enum Capital {


    BISHKEK("My live City"),
    PARIS("Eiffel  tower"),
    MADRID("Real Madrid kings e Football"),
    BERLIN("Reading City"),
    TASHKENT("Beautiful city");
    private  String name;

    Capital(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Capital{" +
                "name='" + name + '\'' +
                '}';
    }
}
