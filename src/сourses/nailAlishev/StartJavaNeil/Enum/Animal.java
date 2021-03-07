package сourses.nailAlishev.StartJavaNeil.Enum;
// Название енама должно быть в единственном числе
public enum Animal {
    DOG("sobak"),CAT("kisulya"),KROKO("krokodiyal");  //  это обьекты енама Animal
    private String translation;

    Animal(String translation){
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    @Override
    public String toString() {
        return "Переопредилили toString "+translation;
    }
}
