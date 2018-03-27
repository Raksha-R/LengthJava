class Unit {
    public static final Unit INCH = new Unit(1);
    public static final Unit FOOT = new Unit(12);
    public static final Unit YARD = new Unit(36);

    private int conversionFactor;

    private Unit(int conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    long convertToBase(long value) {
        return value * this.conversionFactor;
    }
}