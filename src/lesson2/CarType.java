package lesson2;

public enum CarType {

    SEDAN("Седан") {
        @Override
        public void describeTheCarType() {
            System.out.println("I'm sedan, I have 4 doors and cool bahazhnyk");
        }
    },
    HATCHBACK("Хетчбек") {
        @Override
        public void describeTheCarType() {
            System.out.println("I have 2 or 4 doors, and not that good bahazhnyk");
        }
    },
    MINIVAN("Мінівен") {
        @Override
        public void describeTheCarType() {
            System.out.println("Bitch I'm really big!");
        }
    };

    private String ukrainianTranslation;

    CarType(String ukrainianTranslation) {
        this.ukrainianTranslation = ukrainianTranslation;
    }

    public String getUkrainianTranslation() {
        return ukrainianTranslation;
    }

    public abstract void describeTheCarType();

    @Override
    public String toString() {
        return "CarType{" +
                "ukrainianTranslation='" + ukrainianTranslation + '\'' +
                '}';
    }
}
