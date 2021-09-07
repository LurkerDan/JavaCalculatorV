public class Number {

        private int value;
        private TypeNumber type;

        Number(int value, TypeNumber type) {
            this.value = value;
            this.type = type;
        }

        int getValue() {
            return value;
        }

        TypeNumber getType() {
            return type;
        }
}

