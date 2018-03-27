import java.util.Objects;

//Understands one unit in another
public class Length {

    private final long value;
    private final Unit unit;

    Length(long value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Length)) return false;
        Length other = (Length) o;
        return this.unit.convertToBase(this.value) == other.unit.convertToBase(other.value);
    }

    @Override
    public int hashCode() {

        return Objects.hash(value, unit);
    }

    @Override
    public String toString() {
        return "Length{" +
                "value=" + value +
                ", unit=" + unit +
                '}';
    }

    Length add(Length other) {
        return new Length(this.value + other.value, Unit.INCH);
    }
}

