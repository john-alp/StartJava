package StartJavaNeil;

/**
 * Урок 1. Поехали.
 *
 * При присваивании примитивного объекта, его значение копируется (дублируется). При присваивании же ссылочной переменной,
 * копируется только адрес объекта (телефонный номер), сам же объект при этом не копируется.
 *
 * Класс пишется с большой буквы
 * Класс это чертёж, а обьект это сделанная по этому чертежу деталь. Обьект, штука материальная, а класс не материальная...
 *
 *  (int) При присваивании примитивного объекта, его значение копируется (дублируется). При присваивании же ссылочной переменной,
 * копируется только адрес объекта (телефонный номер), сам же объект при этом не копируется.
 *  (String) Ссылка даёт ещё одно преимущество: можно передать ссылку на объект в какой-нибудь метод, и этот метод будет в состоянии модифицировать (изменять)
 * наш объект используя ссылку на него, вызывая его методы и обращаясь к данным внутри объекта.
 */
public class HelloWorld {
    public static void main(String[] args) {        // ниже поля класса или переменными экзэипляров
        String message;                             // Декларируем строковую переменную
        String name = "Evgeny";                     // Декларирую и инициализирую строковую переменную
        int age;                                    // Декларируем числовую переменную (примитивный тип)
        message = "Hello World!";                   // Инициализируем строковую переменную
        age = 41;
                                                    // Ниже, конкатенируем строки и переменные (+)
        Integer may7 = age  ;
int s = may7;
        System.out.println(s);

        System.out.println("Меня зовут " + name + ", мне всего " + age + ". Я хочу стать успешным программистом, и поэтому докладываю - " + message);
    }
}


